Feature: Creating Individuals funcationality of salesforce application


Scenario: Create Individuals
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Leaf@1234'
When Click on Login button
Then HomePage should be displayed
When Click on toggle menu button from the left corner 
Then Click view All and click Individuals from App Launcher
When Click on New Individual
Given Enter the Last Name as 'Kumar'
When Click saveButton
Then Verify Individuals Name