Feature: List users

  Scenario: Retrieve a list of users
    Given I want to list users
    When I send a request to fetch the user list
    Then the response status code should be 200
