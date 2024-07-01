Feature: Decimal Numbers of Multiplication
  Background: application pre-requisite
    Given the calculator application is open


  @sanity @decimal_multiply_Positive
  Scenario Outline: To Verify the calculator can perform the multiplication of two integer numbers <TestcaseName>
    When the user enters the <First> number
    And user hit "*" operator
    And the user enters the <Second> number
    And the user hit the equals "=" button
    Then the result <Result> should be display
    Examples:
      | First | Second        | Result              |TestcaseName          |
      | 0.0   | 99.10         |   0                 | For 0.0 and 99.10    |
      | 20.99 | 55.89         | 1,173.1311          | For 20.99 and 55.89  |
      | 1131.1131 | 1131.1131 | 1,279,416.84499161  | For 1131.1131 and 1131.1131|


  @sanity @decimal_multiply_both
  Scenario Outline: To verify if the calculator can correctly multiply a negative number with a positive number <TestcaseName>
    When the user enters the <First_positive> number
    And user hit "*" operator
    And the user enters the <Second_negative> number
    And the user hit the equals "=" button
    Then the result <Result> should be display

    Examples:
      | First_positive | Second_negative | Result | TestcaseName    |
      | 10.25          | -5.-5              | -50    | For 10 and -5   |
      | -510           | -5              | 2,550  | For -510 and -5 |
      | -0             |  0              | -50    | For -0 and -0   |
      |  0             | -9999           | 0      | For 0 and -9999  |
