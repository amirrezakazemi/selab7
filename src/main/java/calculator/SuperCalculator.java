package calculator;
import java.lang.Math;
public class SuperCalculator {
    public int calculate(int a, int b, String operator){
        if (operator.equals("^")){
            return (int) Math.pow(a,b);
        }
        else if (operator.equals("/")){
            return a / b;
        }
        System.out.println("not a valid Operator");
        return -1;
    }
}
