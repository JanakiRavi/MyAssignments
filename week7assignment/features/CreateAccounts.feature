Feature: Creating Accounts funcationality of salesforce application


Scenario: Create Accounts
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Leaf@1234'
When Click on Login button
Then HomePage should be displayed
When Click on toggle menu button from the left corner 
Then Click view All and click Sales from App Launcher
When Click on Accounts tab 
Then Click on New Account button 
Given Enter 'Janaki' as account name 
And Select Ownership as Public
When Click saveOption 
Then verify Account name
	