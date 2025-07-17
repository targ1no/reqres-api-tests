Feature: Create a new user

  Scenario: Successfully create a user
    Given I have a name and job to create a user
    When I send a POST request to create the user
    Then the response status code should be 201
