package calculator;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private SuperCalculator superCalculator;
    private int value1;
    private int value2;
    private String operator;
    private int result;

    @Before public void before() {

        calculator = new Calculator();
        superCalculator = new SuperCalculator();
    }

    @Given("^Two Input Values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add two values$")
    public void iAddTwoValues() {
        result = calculator.add(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0,  result);
    }

    @Given("^Three Input Values, (-?\\d+) and (-?\\d+) and ([/^])$")
    public void threeInputValuesAndAnd(int arg0, int arg1, String operator){
        value1 = arg0;
        value2 = arg1;
        this.operator = operator;
    }


    @When("^I calculate operation$")
    public void iCalculateOperation() throws Throwable {
        result = superCalculator.calculate(value1, value2, operator);
    }

}
