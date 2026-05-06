Feature: Instagram Login Functionality
Scenario: Successful login with valid credentials
    Given User launches the browser
    And User navigates to "https://www.instagram.com"
    When  User enters valid username 
    And User enters valid password
    And  User clicks on login button
    Then User should be navigated to homepage
    And User profile icon should be displayed