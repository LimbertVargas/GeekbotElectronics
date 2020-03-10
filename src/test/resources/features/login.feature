Feature: Login in Geekbot Electronics
  Scenario: Sign In with valid credential
    Given the user goes to the login page
    When the user login entering his email and password
    Then Mi cuenta title is shown