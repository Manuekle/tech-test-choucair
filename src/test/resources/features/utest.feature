# Autor Manuel
# language:en

@stories
Feature: Utest
  As a user, I want to learn how to automate in screamplay at Utest page practice
  @scenario1
  Scenario: Search for automation course
    Given than manuel wants to learn automation at the utest
      | strUsername             | strPassword |
      | meerazo7@hotmail.com    | Manuel123*  |
    When the user Logout with their credentials
    #Then he finds the coursed called utest