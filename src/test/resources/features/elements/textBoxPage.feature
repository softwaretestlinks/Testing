Feature: This is a test to verify user can enter customer credentials


 @Test1 @Smoke @Regression
  Scenario: Validating successful Submission
    Given I am on the Landing Page "https://demoqa.com/text-box"
    When I click on click on Elements
    And I click on Text Box link
    And I enter First Name "Femi"
    And I enter Email Address "davidn@me.com"
    And I enter Current Address "Leeds"
    And I enter Permanent Address "Manchester"
    And I click Submit
    Then details are submitted successfully
