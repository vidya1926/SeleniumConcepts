Feature: Delete Lead Functionality

#Background:
#Given Open the Chrome browser 
#And Load the application URL

Scenario: Delete Lead
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
Given Store the first Lead ID
When Click on first Lead ID
When Click on Delete button
When Click on Find Leads again
Given Enter the Lead ID stored
When Click on Find Leads button in the current screen
Then No records should be displayed