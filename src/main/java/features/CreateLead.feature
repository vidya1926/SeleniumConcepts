Feature: Create Lead Functionality

#Background:
#Given Open the Chrome browser 
#And Load the application URL

Scenario: Create Lead
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
When Click on Create Lead
Given Enter the company name as 'Test Leaf'
And Enter the first name as 'Gopi'
And Enter the last name as 'R'
When Click on Create Lead button
Then View Lead page should be displayed