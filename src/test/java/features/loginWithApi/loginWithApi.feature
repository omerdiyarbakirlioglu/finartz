Feature: LoginWithApi
  Background: User is on login page with api

  Scenario: Login Api Correct Username
    When Enter correct username and password with api
    Then Check the success login with api

  Scenario: Login Api Uncorrect Username
    When Enter uncorrect username and correct password with api
    Then Check the fail login with api

  Scenario: Login Api Uncorrect Password
    When Enter correct username and uncorrect password with api
    Then Check the fail login with api

  Scenario: Login Api Uncorrect Username and Password
    When Enter uncorrect username and uncorrect password with api
    Then Check the fail login with api