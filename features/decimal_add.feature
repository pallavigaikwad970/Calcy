Feature: Decimal Numbers of addition
  Background: application pre-requisite
    Given the calculator application is open

  @sanity @decimal_addition
  Scenario Outline: Check whether the calculator can perform addition for two decimal number <TestcaseName>
    When the user enters the <First> number
    And user hit "+" operator
    And the user enters the <Second> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
    Examples:
      | First | Second | Result |  TestcaseName     |
      | 3.5   | 5.5    | 9      | For 3.5 and 5.5   |
      | 0.0   | 0.36   |0.36    | For 0.0 and 0.36  |
      | 0.89  | 0.852  | 1.742  | For 0.89 and 0.852|
      | 0     | 0      | 0      | For 0 and 0       |


  @sanity @decimal_add_negative
  Scenario Outline: To verify if the calculator can correctly add two negative numbers <TestcaseName>
    When the user enters the <Negative1> number
    And user hit "+" operator
    And the user enters the <Negative2> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
    Examples:
      |Negative1    | Negative2  | Result        | TestcaseName        |
      | -10.10      | -20.89     | -30.99        |for -10.10 and -20.89|
      | -0          | -0         | -0            |for -0 and 0         |
      | -0          | -999       | -999          |for -0 and -999      |
      | -1000.78946 | -1000.78946| -2,001.57892  |for -1000.78946 and -1000.78946 |