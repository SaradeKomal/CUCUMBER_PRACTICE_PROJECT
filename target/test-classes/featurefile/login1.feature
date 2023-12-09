Feature: Automation login 
Scenario Outline: application login with different data 

	Given intialize browser 
	When user navigates url "https://practicetestautomation.com/practice-test-login/" 
	And user enter <username> and <password> 
	Then user should be able to login successfully 
	
	
	Examples:
	|username|password|
	|heloo|test123|
	|java|lo677|
	
	
