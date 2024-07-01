Feature: Multiplication of Integer Numbers
Background: Calculator
Given the calculator application is open

  @sanity @multiply_Positive
  Scenario Outline: To Verify the calculator can perform the multiplication of two integer numbers <TestcaseName>
    When the user enters the <First> number
    And user hit "*" operator
    And the user enters the <Second> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
   Examples:
        | First | Second | Result |TestcaseName   |
        | 10    | 20     | 200    | For 100 and 20|
        | 0     | 20     | 0      | For 0 and 20  |
        | 99999 | 0      | 0      | For 99999 and 0|


  @sanity @multiply_negative_positive
  Scenario Outline: To verify if the calculator can correctly multiply a negative number with a positive number <TestcaseName>
    When the user enters the <First_positive> number
    And user hit "*" operator
    And the user enters the <Second_negative> number
    And the user hit the equals "=" button
    Then the result <Result> should be display

      Examples:
            | First_positive | Second_negative | Result | TestcaseName    |
            | 10             | -5              | -50    | For 10 and -5   |
            | -510           | -5              | 2,550  | For -510 and -5 |
            | -0             |  0              | -50    | For -0 and -0   |
            |  0             | -9999           | 0      | For 0 and -9999  |
