Feature: Creating New Dashboard funcationality of salesforce application




Scenario: Create New Dashboard
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Leaf@1234'
When Click on Login button
Then HomePage should be displayed
When Click on toggle menu button from the left corner 
Then Click view All and click Dashboard from App Launcher
When Click on the New Dashboard option 
Given Enter Name as Salesforce Automation by 'Janaki' and Click on Create
When Click on Save
Then Verify Dashboard name

	 
