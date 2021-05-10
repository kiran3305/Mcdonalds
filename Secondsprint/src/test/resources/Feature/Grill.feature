Feature: user can custimze the item

Scenario: Customization
Given user is on the homepage
When user Navigate to login page
And user enters the valid number and password
Then user should be logged in
When user added an item
Then Customization chart should be displayed 
And user select an item and adds to cart
Then message should be displayed as product added
When user increase the quantityof item
Then user get an alert for type of customization
When user decrease the quantity of item
Then user gets an alert for procceding cart/cancel

#Scenario: Remove the selected item 
#When user clicks on remove
#Then item should be removed from the cart


#Scenario: Alert for decrement(single)
#When user remove any single selected item
#Then user gets a confirmation alert