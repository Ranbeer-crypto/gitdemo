Feature: Application Login


Scenario: Homepage login default login

Given User is on net banking login page
When user login into application with username "name" and password "1234"
Then Home page is populated
And cards are displayed "true"

Scenario: Homepage login default login

Given User is on net banking login page
When user login into application with username "ranbeer" and password "12345"
Then Home page is populated
And cards are displayed "false"

Scenario Outline: Homepage login default login

Given User is on net banking login page
When user login into application with <username> and <password>
Then Home page is populated
And cards are displayed 