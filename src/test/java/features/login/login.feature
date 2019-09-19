Feature: Login
  Background: User is on login page
    Given user is on the login page

    Scenario: Login page is true

    When Login the page
    And Control the tab title

    When Login the page
    And Control the page title

    When Login the page
    And Control the Status Message

    When Login the page
    And Click Test Login button

  Scenario: Uncorrect username and correct password login the page
    And Enter uncorrect username
    And Enter correct password
    And Click Test Login button
    And Check the fail login

  Scenario: Correct username and uncorrect password login the page
    And Enter correct username
    And Enter uncorrect password
    And Click Test Login button
    And Check the fail login

  Scenario: Uncorrect username and password login the page
    And Enter uncorrect username
    And Enter uncorrect password
    And Click Test Login button
      And Check the fail login

  Scenario: Correct username and password login the page
    And Enter correct username
    And Enter correct password
    And Click Test Login button
    And Check the success login

