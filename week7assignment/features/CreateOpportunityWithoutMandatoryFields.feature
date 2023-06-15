Feature: Creating New opportunity without mandatory fields  funcationality of salesforce application




Scenario: Create New Opportunity without mandatory fields
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Leaf@1234'
When Click on Login button
Then HomePage should be displayed
When Click on toggle menu button from the left corner 
Then Click view All and click Sales from App Launcher
When Click on Opportunities tab 
And Click on New button 
Given Choose close date as Tommorow 
When Click SaveButton
Then Verify the Alert message