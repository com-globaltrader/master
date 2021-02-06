@US08_Register
  Feature: Register as an company seller

    Background:
      Given user is on Global Trader home page
      Given user is click Seller Join Now
      Given user is select Company Seller radio button

@US08_TC001
  Scenario: user should provide Company Name and it can not be blank
    Given user provide Company name "Falcon"
    Given if Company name box is blank verify box will be red

  Scenario: user should provide company mobile number it should be accept only "+" and digits and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+447399054258"
    Given if Company Mobile box is blank verify box will be red


  Scenario: user should provide company address to the box  and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given if Company Address is blank verify box will be red

  Scenario: user provide full name and it  can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given if Full Name is blank verify box will be red

  Scenario: e mail must contain @ and . sign and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given if e-mail box is blank verify box will be red

  Scenario: if user provide invalid e mail red message will display as "Please Enter Valid Email Address"
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide invalid e-mail "falcon.glbtrader.com"
    Given verify e-mail error message "Pleas Enter Valid Email Address"

  Scenario: user provide sub domain and must contain application url (ex: subdomain.glbtrader.com) and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given if Sub Domain box is blank verify box will be red

  Scenario: user provide phone number  10 digits long and accept only digits
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"

  Scenario: if user provide other then digits characters as phone number will see red message "Please Enter Numeric Value"
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide invalid Phone Number "h987654321"
    Then verify error message Phone box "Please Enter Numeric Value"

  Scenario: if user provide less then 10 digits as phone number will see red message " Please Enter 10 Digit Mobile Number"
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide less then 10 digits "12345"
    Then verify red message on Phone box "Please Enter 10 Digit Mobile Number"

  Scenario: user should select country from dropdown menu
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given if Country box is blank verify box will be red

  Scenario: user provide State name and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given if State box is blank verify box will be red

  Scenario: user provide City name and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given user provide City "Glasgow"
    Given if City box is blank verify box will be red

  Scenario: user provide Address to address box and con not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given user provide City "Glasgow"
    Given user provide valid Address "Saracen Street"
    Given if Address is blank verify box will be red

  Scenario: user provide Postal Code to box
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given user provide City "Glasgow"
    Given user provide valid Address "Saracen Street"
    Given user provide Postal Code "G22 6PS"
    Given if Postal Code box is blank verify box will be red

  Scenario: user should select Category from dropdown and can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given user provide City "Glasgow"
    Given user provide valid Address "Saracen Street"
    Given user provide Postal Code "G22 6PS"
    Given user select Category from dropdown "Computer & Office"
    Given if Category box is blank verify will be red

  Scenario: user provide a password any long and any character and it can not be blank
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given user provide City "Glasgow"
    Given user provide valid Address "Saracen Street"
    Given user provide Postal Code "G22 6PS"
    Given user select Category from dropdown "Computer & Office"
    Given user provide valid Password "123456789Falcon"
    Given if Password box is blank verify will be red

  Scenario: user provide valid data all mandatory fields and clicks Registration button and see "Success" message
    Given user provide Company name "Falcon"
    Given user provide valid Company Mobile "+44 7399054258"
    Given user provide valid Company Address "Saracen Street"
    Given user provide valid Full Name "Ahmet Cakir"
    Given user provide valid e-mail "falcon@hawk.glbtrader.com"
    Given user provide valid Sub Domain "falcon.glbtrader.com"
    Given user provide valid Phone Number "07389055842"
    Given user select Country from dropdown "United Kingdom"
    Given user provide State "Glasgow"
    Given user provide City "Glasgow"
    Given user provide valid Address "Saracen Street"
    Given user provide Postal Code "G22 6PS"
    Given user select Category from dropdown "Computer & Office"
    Given user provide valid Password "123456789Falcon"
    Given user click Registration button
    Then verify Success message "Success"