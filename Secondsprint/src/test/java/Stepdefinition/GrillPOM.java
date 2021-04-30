package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GrillPOM {
	WebDriver driver;
	
	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
	    driver.findElement(By.xpath("//*[contains(text(),\\\"Login / Sign Up \\\")]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='cursor-pointer width-menu pr-4 active']")).click();
	}

	@Then("^user enters the valid number and password$")
	public void user_enters_the_valid_number_and_password() throws Throwable {
	   driver.findElement(By.name("email")).sendKeys("6301389621");
	   driver.findElement(By.id("password")).sendKeys("Kiran123@");
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    driver.findElement(By.xpath("//button[@class=\"cursor-pointer button button-color\"]")).click();
	}

	@When("^user click on add item$")
	public void user_click_on_add_item() throws Throwable {
		driver.findElement(By.xpath("//*[@title=\"Burgers & Wraps\"]")).click();
		driver.findElement(By.xpath("//*[@title=\"Burgers & Wraps\"]"))
	}

	@Then("^Customization chart should be displayed$")
	public void customization_chart_should_be_displayed() throws Throwable {
	    
	}

	@When("^user select an item and adds to cart$")
	public void user_select_an_item_and_adds_to_cart() throws Throwable {
	    
	}

	@Then("^message should be displayed as product added$")
	public void message_should_be_displayed_as_product_added() throws Throwable {
	    
	}


}
//button[@class="cursor-pointer button button-color"]
//*[contains(text(),\"Login / Sign Up \")]