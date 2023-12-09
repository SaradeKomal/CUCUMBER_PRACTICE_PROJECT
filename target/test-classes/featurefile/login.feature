Feature: login Automation page 
Scenario: Automation page login with valid data 

	Given initialize browser 
	When user navigates url 
	And click on username and password 
	Then user should be login successfuly