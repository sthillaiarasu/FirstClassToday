@tag789
Feature: FaceBook Login


	@tag123
Scenario: Facebook login with valid username and password
	 Given open the facebook page
    When enter the username and password
    |username|password|
    |thillai|arasu|
    |thillai1|arasu1|
    Then click the login button
    
    
       
Scenario: Facebook account creation with valid details
	 Given open the facebook page
    When enter the "arasu" and "thillai"
    When click create the account
    Then fill the details