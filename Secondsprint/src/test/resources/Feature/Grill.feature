Feature: user can custimze the item

Background: user logs in with valid credentials
When user click on login
Then user enters the valid number and password
Then user should be logged in 

Scenario: Navigate to the customization chart
When user click on add item
Then Customization chart should be displayed 

Scenario: select respective item and add the items to the cart
When user select an item and adds to cart
Then message should be displayed as product added

Scenario: Remove the selected item 