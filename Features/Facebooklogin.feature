 Feature: Validate Facebook Login

 Scenario Outline: Validate Facebook Login
 
  Given user visit facebook homepage
  
  When user type valid "<email>" and valid "<password>" and click on login button
  
  Then user will be able to login facebook
  
  Examples:
  |email | password|
  |hasanchisty@live.com||Hasan@2023|

