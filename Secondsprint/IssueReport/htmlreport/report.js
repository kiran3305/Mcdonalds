$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Grill.feature");
formatter.feature({
  "line": 1,
  "name": "user can custimze the item",
  "description": "",
  "id": "user-can-custimze-the-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Customization",
  "description": "",
  "id": "user-can-custimze-the-item;customization",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the valid number and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user added an item",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Customization chart should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user select an item and adds to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "message should be displayed as product added",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user increase the quantityof item",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user get an alert for type of customization",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user decrease the quantity of item",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user gets an alert for procceding cart cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomizationSD.user_is_on_the_homepage()"
});
formatter.result({
  "duration": 13629956800,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_Navigate_to_login_page1()"
});
formatter.result({
  "duration": 434079200,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_enters_the_valid_number_and_password()"
});
formatter.result({
  "duration": 517215600,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_should_be_logged_in()"
});
formatter.result({
  "duration": 3159367100,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_added_an_item()"
});
formatter.result({
  "duration": 7785087700,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.customization_chart_should_be_displayed()"
});
formatter.result({
  "duration": 3002290000,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_select_an_item_and_adds_to_cart()"
});
formatter.result({
  "duration": 10373247900,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.message_should_be_displayed_as_product_added()"
});
formatter.result({
  "duration": 3317891100,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_increase_the_quantityof_item()"
});
formatter.result({
  "duration": 3190540600,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_get_an_alert_for_type_of_customization()"
});
formatter.result({
  "duration": 13268590700,
  "status": "passed"
});
formatter.match({
  "location": "CustomizationSD.user_decrease_the_quantity_of_item()"
});
formatter.result({
  "duration": 3014713800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});