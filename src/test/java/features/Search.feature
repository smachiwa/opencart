Feature: Application Search Products

Scenario Outline: searchWithValidProduct
Given Type the Application URL
When User enter valid products into search box field
Then clicks on search button
Then hp products is displayed

Scenario Outline: searchWithInValidProduct
Given Type the Application URL
When User type invalid products into search box field
Then clicks on search button
Then Verify a warning informing user to invalid product



Scenario Outline: searchWithoutAnyProduct
Given Type the Application URL
When User type empty products into search box field
Then clicks on search button
Then Verify a warning informing user to no products is matching
