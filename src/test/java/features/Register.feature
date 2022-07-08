Feature: Application Register Account

Scenario Outline: RegisterWithMandatoryFields
Given Enter the Application URL
When User enter all mandatory fields
Then clicks on checkbox button
Then clicks on Continue button
Then Verify user is  successfully Registerd

Scenario Outline: RegisterWithAllFields
Given Enter the Application URL
When User filled  All fields
Then clicks on checkbox button
Then clicks on Continue button
Then Verify user is  successfully Registerd

Scenario Outline: RegisterWithAlreadyRegisteredEmailAddress
Given  Enter the Application URL
When User put all mandatory fields
Then clicks on checkbox button
Then clicks on Continue button
Then Verify user is  warning informing displayed
