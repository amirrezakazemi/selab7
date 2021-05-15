@tag
Feature: SuperCalculator

  Scenario: divide two numbers
    Given Three Input Values, 6 and 2 and /
    When I calculate operation
    Then I expect the result 3

  Scenario: power two numbers
    Given Three Input Values, 6 and 2 and ^
    When I calculate operation
    Then I expect the result 36


  Scenario Outline: calculate operation
    Given Three Input Values, <first> and <second> and <operation>
    When I calculate operation
    Then I expect the result <result>

    Examples:
      | first | second | operation | result |
      | 10    | 2      | ^         | 100    |
      | 2     | 1      | /         | 2      |
      | -10   | 2      | /         | -5     |

