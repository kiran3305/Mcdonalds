Feature: Defect reporting

Scenario: Testing for the defect
Given User logged in successfully
When user clicked on item
Then grill chart should be displayed
And user selected two items under same section
Then only a single item should be selected
