Feature: Verify register Feature

  @sanity @regression
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully and verify the text "Register"

  @smoke @regression
  Scenario: User should get mandatory field message
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I should get error message for first name required "First name is required."
    And I should get error message for last name required "Last name is required."
    And I should get error message for email required "Email is required."
    And I should get error message for password required "Password is required."
    And I should get error message for confirm password required "Password is required."

  @regression
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I click on radio button against female
    And I enter first name "ajay"
    And I enter last name "kumar"
    And I select day for DOB "16"
    And I select month for DOB "March"
    And I select year for DOB "1997"
    And I enter email for registration
    And I enter password for registration "ajay@123"
    And I enter confirm password for registration "ajay@123"
    And I click on register for registration
    Then I should get registration completion message "Your registration completed"
