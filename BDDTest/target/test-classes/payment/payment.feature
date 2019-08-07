Feature: Payment Validation

Scenario: cardholdername Validation
Given User is on PaymentDetails page
When cardholdername is invalid
Then then show message invalid cardholdername

Scenario: debitcardno Validation
Given User is on PaymentDetails page
When debitcardno is invalid
Then then show message invalid debitcardno


Scenario: cvv Validation
Given User is on PaymentDetails page
When cvv is invalid
Then then show message invalid cvv


Scenario: expiremonth Validation
Given User is on PaymentDetails page
When expiremonth is invalid
Then then show message invalid expiremonth

Scenario: expireyear Validation
Given User is on PaymentDetails page
When expireyear is invalid
Then then show message invalid expireyear