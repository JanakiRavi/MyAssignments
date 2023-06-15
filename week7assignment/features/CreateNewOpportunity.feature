Feature: Creating New opportunity funcationality of salesforce application




Scenario: Create New Opportunity
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Leaf@1234'
When Click on Login button
Then HomePage should be displayed
When Click on toggle menu button from the left corner 
Then Click view All and click Sales from App Launcher
When Click on Opportunities tab 
And Click on New button 
Given Enter Opportunity name as Salesforce Automation by 'Janaki'
When Choose close date as Today 
And Select Stage as Needs Analysis
And Click Save
Then VerifyOppurtunity Name

	 
	 
	 
	
	 


	 