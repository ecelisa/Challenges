#Autor: Elian Celis
@stories
Feature: HerokuApp
  As a user, I want to learn more about JavaScript Alerts
  @storie1
  Scenario: access to the herokuPage
    Given that Mary access at the heroku page
    When she select the link javascript alerts
    And she interact with the controls that exits in the page
    | txtMessage |
    | Hola Mundo  |
    Then she learns to use the JavaScript Alerts
    | txtMessage |
    | Hola Mundo  |