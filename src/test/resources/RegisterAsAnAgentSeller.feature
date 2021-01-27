
  Feature: register
    Background:
      Given user is on GLBTreader home page
      Given user navigate to vendor registration page
      Given user select Agent seller form

    Scenario:  user provide full name and it  can not be blank
      Given user provide full name "Mali"
      Given if name box is blank verify box will be red


    Scenario:  e mail must contain @ and . sign and it can not be blank
      Given user provide full name "Mali"
      Given user provide valid e mail "a@b.glbtrader.com"
      Given if email box is blank verify box will be red
      Given user provide invalid email "ayyildiz.glbtrader.com"
      Then verify error message "Please Enter Valid Email Address"

    Scenario:  user provide sub domain and must contain application url (ex: subdomain.glbtrader.com) and it can not be blank
      Given user provide full name "Mali"
      Given user provide valid e mail "a@b.glbtrader.com"
      Given user provide valid subdomain "ayyildiz.glbtreader.com"
      Given if subdomain box is blank verify box will be red
      Given user provide invalid sub domain "ayyildz.com"
      Then verify regsitration can not be succesfull

    Scenario:  user provide phone number  10 digits long and accept only digits
      Given user provide full name "Mali"
      Given user provide valid e mail "a@b.glbtrader.com"
      Given user provide valid subdomain "ayyildiz.glbtreader.com"
      Given user provide valid phone number "1234567890"
      Given user provide invalid phone number "a123456789"
      Then verify error message on phone box "Please Enter Numeric Value"
      Given user provide less then 10 digits
      Then verify red message on phone box "Please Enter 10 Digit Mobile Number"

      Scenario: user provide address to address boxes
        Given user provide full name "Mali"
        Given user provide valid e mail "a@b.glbtrader.com"
        Given user provide valid subdomain "ayyildiz.glbtreader.com"
        Given user provide valid phone number "1234567890"
        Given user select country from dropdown
        Given user provide state "NY"
        Given if state box is blank verify box will be red
        Given user provide city "New York"
        Given if city box is blank verify box will be red
        Given user provide address "2 avenue NY"
        Given if address box is blank verify box will be red
        Given user provide posta code "616161"

      Scenario: user should select Category from dropdown and can not be blank
        Given user provide full name "Mali"
        Given user provide valid e mail "a@b.glbtrader.com"
        Given user provide valid subdomain "ayyildiz.glbtreader.com"
        Given user provide valid phone number "1234567890"
        Given user select country from dropdown
        Given user provide state "NY"
        Given user provide city "New York"
        Given user provide address "2 avenue NY"
        Given user provide posta code "616161"
        Given user select category from dropdown
        Given if category box is blank verify box will be red

      Scenario:user provide a password any long and any charecter and it can not be blank
        Given user provide full name "Mali"
        Given user provide valid e mail "a@b.glbtrader.com"
        Given user provide valid subdomain "ayyildiz.glbtreader.com"
        Given user provide valid phone number "1234567890"
        Given user select country from dropdown
        Given user provide state "NY"
        Given user provide city "New York"
        Given user provide address "2 avenue NY"
        Given user provide posta code "616161"
        Given user select category from dropdown
        Given user provide password "12345"
        Given if password box is blank verify box will be red

      Scenario:  user provide valid data all mandatory fields and clicks Registration button and see "Success" message
        Given user provide full name "Mali"
        Given user provide valid e mail "a@b.glbtrader.com"
        Given user provide valid subdomain "ayyildiz.glbtreader.com"
        Given user provide valid phone number "1234567890"
        Given user select country from dropdown
        Given user provide state "NY"
        Given user provide city "New York"
        Given user provide address "2 avenue NY"
        Given user provide posta code "616161"
        Given user select category from dropdown
        Given user provide password "12345"
        Given user cliks registration button
        Then verify success message "Success"
