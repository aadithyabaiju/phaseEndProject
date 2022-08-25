Feature: Order Food Online

Scenario: A user should be able to checkout food successfully on Swiggy
Given a user is on the landing page of Swiggy
When he enter ‘Bangalore, Karnataka, India’ in the search box 
And he clicks on ‘Bangalore, Karnataka, India’ in the option
And he clicks on the first restaurant on the next page
And he clicks on Add on the first item of the restaurant page
And he clicks on Checkout button
Then he must be able to order food successfully