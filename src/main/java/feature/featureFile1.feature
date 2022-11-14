Feature: Test CRUD methods in sample student REST API



 Scenario: Add Student record
  Given I Set POST student service api endpoint
  When Send a POST HTTP request
  Then I receive valid Response


