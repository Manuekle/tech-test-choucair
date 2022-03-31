# Autor Manuel
# language:en

@stories
Feature: Utest
  As a user, I want to learn how to automate in screamplay at Utest page practice
  @scenario1
  Scenario: Login the user
    Given than manuel wants to learn automation at the utest
      | strUsername             | strPassword |
      | meerazo7@hotmail.com    | Manuel123*  |
    When he finds the coursed called utest
    Then the user Logout with their credentials
  @scenario2
  Scenario: Register a new user
    Given set data in fields
      | strFirstName  | strLastName | strEmailAddress        | strCity    | strZipCode |
      | Juan          | Carabali    | mowafo1178@sartess.com | Popayán    | 190002     |