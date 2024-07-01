Feature: Addition of Numbers


 Background: application prereq
    Given the calculator application is open


   @sanity @add_interfering
  Scenario Outline: Check whether the calculator can perform addition for two interfering number <First> and <Second>
     When the user enters the <First> interfering number
     And user hit "+" operator
     And the user enters the <Second> interfering number
     And the user hit the equals "=" button
     Then the result <Result> should be display
  Examples:
    | First | Second | Result |
    | 555   | 666    | 1221   |
    | 7777  | 0      | 7777   |
    | 0     | 2222   | 2222   |
    | 0     | 0      | 0      |

      @sanity @add_positive
      Scenario Outline: To verify if the calculator can correctly add two Positive numbers for <TestcaseName>
        When the user enters the <First> number
        And user hit "+" operator
        And the user enters the <Second> number
        And the user hit the equals "=" button
        Then the result <Result> should be display
      Examples:
            | First          | Second          | Result | TestcaseName   |
            | 10             | 20              | 30     | for 10 and 20  |
            | 20             | 5               | 25     | for 20 and 5  |
            | 55             | 55              | 110    | for 55 and 55  |
            | 175            | 5               | 180    | for 175 and 5  |


  @Sanity @add_negative
  Scenario Outline: To verify if the calculator can correctly add two negative numbers <TestcaseName>
     When the user enters the <Negative1> number
     #And the user hit "+" the addition operator
     And user hit "+" operator
     And the user enters the <Negative2> number
     And the user hit the equals "=" button
      Then the result <Result> should be display
  Examples:
        |Negative1 | Negative2 | Result|  TestcaseName |
        | -10       | -20      | -30   |for -10 and -20|
        | -0        | 0        | -0    |for -0 and 0   |
        | -0        | -999     | -999  |for -0 and -999|
        | -1000     | 0        | -1000 |for -1000 and 0|
