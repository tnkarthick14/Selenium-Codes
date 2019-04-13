Feature: LeafTaps Login 

Scenario: Positive Flow for login 
Given  Open the browser
And Max the Browser
And Set the Timeouts
And Load the URL 
And Enter the Username as DemoSalesManager
And Enter the Password as crmsfa
When Click on the Login Button
Then Verify Login Successful 


