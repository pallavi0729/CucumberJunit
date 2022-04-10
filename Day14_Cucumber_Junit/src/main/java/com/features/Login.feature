@login
Feature: JBK offline application

@jbk
Scenario Outline: login test

Given user should be on login page
When  user enters "<uname>" and "<password>"
Then  user should be on home page

Examples:
|uname             |password|
|kiran@gmail.com   |123456  |
|pallavi@gmail.com |dfgbn   |
|Gargi@gmail.com   |123     |


Scenario: logo test

Given user should be on login page
Then  user should see JBK logo
