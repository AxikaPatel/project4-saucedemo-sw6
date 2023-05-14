@regression
Feature: Login Test
  As user I want to login into saucedemo website

  @sanity
  Scenario: I should Login Successfully with valid Credentials
    Given   I am on homepage
    When    I enter username "standard_user"
    And     I enter password "secret_sauce"
    And     I click on login button
    Then    I should navigate to login page successfully and observe text "Products"

  @smoke
  Scenario: I can observe that six products are display on page
    Given   I am on homepage
    When    I enter username "standard_user"
    And     I enter password "secret_sauce"
    And     I click on login button
    Then    I can observe that six products are display on page



