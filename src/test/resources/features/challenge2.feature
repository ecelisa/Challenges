#Autor: Elian Celis
@stories
Feature: Bancolombia
  As a person, I want to calculate the payment for a credit
  Background:
    Given that alex wants a simulation the quota of a credit
  @successCase
  Scenario Outline: Simulate quota succcessfully
    When he fill the form for simulated with <amount> and <quota> quota
    Then he see a payment list
    Examples:
      | amount | quota |
      | 10000000  | 48  |
      | 10000000  | 60  |
  @wronglyCase
  Scenario Outline: Simulate quota wrongly
    When he fill the form for simulated with <amount> and <quota> quota
    Then he see a payment list
    Examples:
      | amount | quota |
      | 10000000  | 24  |
      | 15000  | 60  |
