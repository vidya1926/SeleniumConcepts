Feature: Merge Lead Functionality

#Background:
#Given Open the Chrome browser 
#And Load the application URL

Scenario: Merge Lead
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
When Click on Leads
When Click on Merge Leads
When Click on image next to From Lead text box
Given Switch to the next window - window1
And Enter the first name in window1 as 'gopi'
When Click on Find Leads button in window1
Given Store the first Lead ID in window1
When Click on first Lead ID in window1
Given Switch to previous window
When Click on image next to To Lead text box
Given Switch to the next window - window2
And Enter the first name in window2 as 'babu'
When Click on Find Leads button in window2
When Click on first Lead ID in window2
Given Switch back to previous window
When Click on Merge button
When Switch to alert and accept
When Click on Find Leads again
Given Enter the Lead ID stored
When Click on Find Leads button in the current screen
Then No records should be displayed