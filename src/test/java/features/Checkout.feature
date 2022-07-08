Feature: Application Checkout

Scenario Outline: checkout the products as a guest user
Given type the url
When search the product add to cart             
Then click on checkoutbutton and fill all delivery details order is placed

Scenario Outline: checkout the products as a guest user with ivalid delivery details
Given type the url
When search the product add to cart             
Then click on checkoutbutton and fill invalid delivery details order is placed

Scenario Outline: checkout the products as a guest user with no deliverydetails filled
Given type the url
When search the product add to cart             
Then click on checkoutbutton and no fill delivery details order is placed


