Feature: Division of Integer Numbers
 Background: Calcy
 Given the calculator application is open

  @sanity @div_positive
  Scenario Outline: To verify if the calculator can correctly divide two integer numbers <Dividend> and <divisior>
    When the user enters the <First> number
    And user hit "/" operator
    And the user enters the <Second> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
  Examples:
            | First    | Second  | Result                 | TestcaseName   |
            | 100      | 20      | 5                      | For 100 and 20 |
            | 0        | 1       | 0                      | For 0 and 1    |
            | 999      | 52      | 192.2884615384615      | For 999 and 52 |
            | 20       | 100     | 0.2                    | For 20 and 100 |
            | 100      | 0       | Can not divide by zero | For 100 and 0  |
            | 99999    | 0       | Can not divide by zero | For 99999 and 0|


  @sanity @div_negative
  Scenario Outline: Verify that the calculator can correctly divide two negative numbers <TestcaseName>
    When the user enters the <First_negative> number
    And user hit "/" operator
    And the user enters the <Second_negative> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
  Examples:
                | First_negative| Second_negative  | Result           | TestcaseName   |
                | -10           | -2               | 5                | For -10 and -2 |
                | -0            | -0               | Result Undefined | For -0 and -0  |
                | -0            | -99              | 0                | For -0 and -99 |
                | -987          | 6666             | -0.14806480648064806480648064806481 | for -987 and 6666|


