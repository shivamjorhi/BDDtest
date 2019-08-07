Feature: User Validation

Scenario: Username Validation
Given User is on UserInformation page
When username is invalid
Then then show message invalid username

Scenario: FirstName Validation
Given User is on UserInformation page
When firstName is invalid
Then then show message invalid firstname


Scenario: Last Name Validation
Given User is on UserInformation page
When lastname is invalid
Then then show message invalid lastname


Scenario: Father's Name Validation
Given User is on UserInformation page
When fathername is invalid
Then then show message invalid fathername

Scenario: DOB Validation
Given User is on UserInformation page
When dob is invalid
Then then show message invalid dob

Scenario: gender Validation
Given User is on UserInformation page
When gender is invalid
Then then show message invalid gender

Scenario: mobileno Validation
Given User is on UserInformation page
When mobileno is invalid
Then then show message invalid mobileno

Scenario: email Validation
Given User is on UserInformation page
When email is invalid
Then then show message invalid email


Scenario: landline Validation
Given User is on UserInformation page
When landline is invalid
Then then show message invalid landline

Scenario: communication Validation
Given User is on UserInformation page
When communication is invalid
Then then show message invalid communication

Scenario: Invalid details
Given User is on UserInformation page
When all invalid details
Then then go to UserInformation page

Scenario: Valid details
Given User is on UserInformation page
When all valid details
Then then go to PaymentDetails page









