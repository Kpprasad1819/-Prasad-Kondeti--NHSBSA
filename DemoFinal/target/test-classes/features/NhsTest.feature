Feature: NhsTest Ticket

Scenario: Wales Test Ticket Acceptance Criteria

Given I am a person from Wales
When I put my circumstances into the Checker tool
Then I should get a result of whether I will get help or not
And I close the application