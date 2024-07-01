Feature: Verify Arithmetic Signs
  Background: the calculator application is open
    Given the calculator application is open
  @smoke @plus
  Scenario: Verify if the arithmetic sign "+" is visible and clickable
    When the user looks at the plus sign
    Then the user should see and be able to click the plus sign

  @smoke @minus
  Scenario: Verify if the arithmetic sign "-" is visible and clickable
    When the user looks at the minus sign
    Then the user should see and be able to click the minus sign

  @smoke @multiply
  Scenario: Verify if the arithmetic sign "*" is visible and clickable
    When the user looks at the multiply sign
    Then the user should see and be able to click the multiply sign

  @smoke @divide
  Scenario: Verify if the arithmetic sign "/" is visible and clickable
    When the user looks at the divide sign
    Then the user should see and be able to click the divide sign

  @smoke @equals
  Scenario: Verify if the arithmetic sign "=" is visible and clickable
    When the user looks at the equals sign
    Then the user should see and be able to click the equals sign
