# Autor: jamontoya
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    |username       |password       |
    |jamontoya      |@contraseña12  |
    When he search for the course Recursos Automatización Bancolombia on the choucair academy platform
    |course                   |
    |Metodología Bancolombia  |
    Then he finds the course called resources Recursos Automatización Bancolombia