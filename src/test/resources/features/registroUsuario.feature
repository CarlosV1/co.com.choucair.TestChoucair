#Autor: Carlos Valero

@stories
Feature: User Register
  register user on the related page
  @scenario1
  Scenario: Registration Automation
    Given That Carlos will register in Automation
    When  He will fill out the registration form
      | strName  | strLastName | intAdress   | strEmail | intPhone   | strGender | strHobbies | strLanguages | strSkills      | strCountry | strPassword | strCPaswword  |
      | TuNombre | TuApellido  | TuDireccion | TuEmail  | TuTelefono | TuGenero  | TusHobbies | TusIdiomas   | TusHabilidades | TuPais     | TuClave     | ConfirmaClave |
    Then  You will register successfully
