#Autor: Elian Celis
  @stories
    Feature: CRM Zoho
      As a person, David wants to register and use the CRM Zoho
      @scenarioRegister
      Scenario: Register into platform
        Given that david wants use the CRM Zoho
        When David made the successful registration
        | txtName | txtEmail  | txtPassword | txtDigits  | txtCountryCode | txtCountry  |
        | David   | ecelisa@choucairtesting.com  | Choucair2021 | 1234567890  |  Colombia (+57)  | Colombia  |
        Then he checked the access in the platform
        | txtName |
        | David |
      @scenarioCreateTask
      Scenario: Create task
        Given that david login in the platform
        When David register a task
        Then David checked that the task is successfully
