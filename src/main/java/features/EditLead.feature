Feature: Edit Lead Functionality

#Background:
#Given Open the Chrome browser 
#And Load the application URL

Scenario: Edit Lead
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
When Click on Leads
When Click on Find Leads
When Click on Phone
Given Enter the phone number as '9'
When Click on Find Leads button
When Click on first Lead ID
When Click on Edit button
Given Change the company name to 'Qeagle'
When Click on Update button
Then View Lead page should be displayed