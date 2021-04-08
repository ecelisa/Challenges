#Autor:Elian Celis
@stories
Feature: colorLib
  As a user,I want to learn more the colorLib library
  @scenario1
  Scenario: search library colorLib
  Given than Maria wants to learn more the color library, she login
    | txtUser  | txtPassword  | titleHome |
    | demo     | demo         | Bootstrap-Admin-Template     |
    When she surf for menu and find the section block validate and fill the form for see its funcionality
    | txtRequired | txtEmail  | txtPass | txtConfirm  | txtDate | txtUrl  | txtDigits | txtRange  |
    | example     | challenge@choucair.com  | 12345 | 12345 | 08/04/2021  | https://colorlib.com  | 123 | 6 |
  Then she sees the menssage of validation
    | titleForm |
    | Block Validation  |