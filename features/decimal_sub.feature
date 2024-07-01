Feature: Decimal Numbers of subtraction
  Background: application pre-requisite
    Given the calculator application is open

@sanity @Decimal_subtraction
  Scenario Outline:To verify if the calculator can correctly subtraction of two Positive numbers <TestcaseName>
    When the user enters the <First> number
    And user hit "-" operator
    And the user enters the <Second> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
  Examples:
    | First | Second | Result | TestcaseName        |
    | 100.23| 89.56  | 10.67  | For 100 and 20      |
    | 23.89 | 99.99  | -76.1  | For 23.89 and 99.99 |
    | 0.0   | 66.99  | -66.99 | For 000 and 0152    |
    | 2.8   | 999.6  | -996.8 | For 2.8 and 999.6   |

