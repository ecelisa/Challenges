#Autor: Elian Celis
  @stories
  Feature: Medical appointment management
    As a patient, i want make the a request a medical appointment
    Background: Open the page medical
      Given that Carlos want make a request a medical appointment
  @scenarioDoctor
  Scenario: Register of doctor
    When Carlos fill the form for register a doctor
      | txtName | txtLastName | txtPhone  | txtDocumentType | txtNumberDocumentDoctor |
      | Carlos Antonio  | Perez Rincon  | 1234566789 | Cédula de ciudadanía  | 101011111212  |
    Then carlos verify that the register of the doctor is saved
      | txtMessage  |
      | Guardado:   |
  @scenarioPatient
  Scenario: Register of patient
    When Carlos fill the form for register a patient
      | txtName | txtLastName | txtPhone  | txtDocumentType | txtNumberDocumentPatient |
      | Ana Maria  | Orozco Sanchez  | 1123456789 | Cédula de ciudadanía  | 778899  |
    Then carlos verify that the register of the patient is saved
      | txtMessage  |
      | Guardado:   |
  @scenarioMedicalAppointment
  Scenario: schedule a medical appointment
    When Carlos fill the form for schedule a medical appointment
      | txtDate | txtNumberDocumentPatient | txtNumberDocumentDoctor  | txtDescription |
      | 07/09/2021  | 778899  | 101011111212 | Asignación de cita medica  |
    Then carlos verify that the register of the schedule is saved
      | txtMessage  |
      | Guardado:   |


