Feature: Limeroad Order

Background: Launch url "https://www.limeroad.com/"

Scenario: To click on shop men button
  
Given Launch the browser "Chrome"
  
When User clicks shops men
   
And clicking on Winter

Scenario: Adding the Blazer to cart

Given Select the size for Blazer

When Click on add to cart button

And Click on Buy now button

And Enter your mobile number

And Enter your otp

Scenario: Entering the address

Given Entering address

When click on confirm order