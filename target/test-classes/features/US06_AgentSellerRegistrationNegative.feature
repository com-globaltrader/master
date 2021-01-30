@US06_Negative @smoketest
Feature: negative - register as an agent seller

  Background:
    Given user is on GLBTreader home page
    Given user navigate to vendor registration page
    Given user select Agent seller form

  @US06_TC001
  Scenario: user leaves blank in name_email_subDomain text boxes
    Given user provide valid phone number "4914235240"
    And user select country from dropdown
    And user provide state "Baden-Württemberg"
    And user provide city "Kirchheim unter Teck"
    And user provide address "Kirchheimer Str. 112"
    And user provide posta code "73230"
    And user provide password "ye123."
    And user cliks registration button
    Then user sees red box around name text box
    Then user sees red box around email text box
    Then user sees red box around sub domain text box

    @US06_TC002
    Scenario: user leaves blank mobileNumber_state_city text boxes
      Given user provide full name "Furkan Chen"
      And user provide valid e mail "sakat@gmail.com"
      And user provide valid sub domain "frknChen"
      And user select country from dropdown
      And user provide address "Kirchheimer Str. 112"
      And user provide posta code "73230"
      And user provide password "ye123."
      And user cliks registration button
      Then user sees red box around mobileNumber text box
      Then user sees red box around state text box
      Then user sees red box around city text box

    @US06_TC003
    Scenario: user leaves blank adress_password text boxes
      Given user provide full name "Furkan Chen"
      And user provide valid e mail "sakat@gmail.com"
      And user provide valid sub domain "frknChen"
      Given user provide valid phone number "4914235240"
      And user select country from dropdown
      And user provide state "Baden-Württemberg"
      And user provide city "Kirchheim unter Teck"
      And user provide posta code "73230"
      And user select category from dropdown
      And user cliks registration button
      Then user sees red box around address text box
      Then user sees red box around password text box

    @US06_TC004
    Scenario: user leaves blank every mandatory boxes
      And user select country from dropdown
      And user provide posta code "73230"
      And user select category from dropdown
      And user cliks registration button
      Then user sees red boxes around every mandatory text boxes