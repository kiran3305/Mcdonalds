package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.GrillPOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomizationSD {
	WebDriver driver;
	@Test(priority=0)
	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium automation\\Selenium software\\chromedriver.exe");
		 driver=new ChromeDriver();
	   driver.get("https://www.mcdelivery.co.in/home");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//*[contains(text(), ' Login / Sign Up ')]")).click();
	/*driver.findElement(By.xpath("//*[text()=' Login Via Password ']")).click();
	driver.findElement(By.name("email")).sendKeys("6301389621");
	driver.findElement(By.id("password")).sendKeys("Kiran123@");
	driver.findElement(By.xpath("//button[@class=\"cursor-pointer button button-color\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@title=\"Burgers & Wraps\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-menu-popup/div[@class='menu-popup-wrapper']/div[@class='menu-popup']/div[@class='content-section']/div[@class='menu-height']/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")).click();
    //driver.findElement(By.xpath("//*[@type=\"radio\"][@id=\"00\"]")).click();
	 driver.findElement(By.xpath(" driver.findElement(By.xpath(\"//*[@type=\\\"radio\\\"][@id=\\\"10\\\"]\")).click();")).click();
	driver.findElement(By.xpath("//*[@type=\"radio\"][@id=\"10\"]")).click();
    driver.findElement(By.xpath("//div[@class='col-lg-6 multiple-choice no-padding-right']//div[1]//div[1]//div[3]//div[1]//p[2]")).click();
driver.findElement(By.xpath("//label[@for='10']")).click();
driver.findElement(By.xpath("//*[@class=\"remove\"][@xpath=\"1\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@class=\"view-cart\"][@xpath=\"1\"]")).click();
driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//button[@class='plus'][normalize-space()='+']")).click();	
*/
	}
	
	@Test(priority=2)
		@When("^user Navigate to login page$")
		public void user_Navigate_to_login_page1() throws Throwable {
		 //driver.findElement(By.xpath("//*[text()=' Login Via Password ']")).click();
	  GrillPOM obj=PageFactory.initElements(driver,GrillPOM.class);
	  obj.loginviapass();
	}
@Test(priority=3)
	@And("^user enters the valid number and password$")
	public void user_enters_the_valid_number_and_password() throws Throwable {
	//driver.findElement(By.name("email")).sendKeys("6301389621");
	//driver.findElement(By.id("password")).sendKeys("Kiran123@"); 
	GrillPOM obj=PageFactory.initElements(driver, GrillPOM.class);
	obj.enternumber("6301389621");
	obj.enterpassword("Kiran123@");
	
	}

@Test (priority=4)
	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	  GrillPOM obj=PageFactory.initElements(driver,GrillPOM.class);
	  obj.login();
	   // driver.findElement(By.xpath("//button[@class=\"cursor-pointer button button-color\"]")).click();
	Thread.sleep(3000);
}

@Test (priority=5)
		@When("^user added an item$")
		public void user_added_an_item() throws Throwable {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");
	Thread.sleep(3000);
	 //GrillPOM obj=PageFactory.initElements(driver,GrillPOM.class);
	  //obj.customization();
		driver.findElement(By.xpath("//*[@title=\"Burgers & Wraps\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-menu-popup/div[@class='menu-popup-wrapper']/div[@class='menu-popup']/div[@class='content-section']/div[@class='menu-height']/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")).click();
		////driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-home-page[1]/div[1]/div[4]/app-menu-popup[1]/div[1]/div[1]/div[1]/div[2]/app-menu-items[1]/div[1]/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")).click();
	}

@Test (priority=6)
	@Then("^Customization chart should be displayed$")
	public void customization_chart_should_be_displayed() throws Throwable {
	Thread.sleep(3000);
	}

@Test(priority=7)
	@When("^user select an item and adds to cart$")
	public void user_select_an_item_and_adds_to_cart() throws Throwable {
			/*GrillPOM obj=PageFactory.initElements(driver,GrillPOM.class);
	  obj.add_a_drink();*/
	    driver.findElement(By.xpath("//*[@type=\"radio\"][@id=\"00\"]")).click();
	   Thread.sleep(3000);
	    driver.findElement(By.cssSelector("label[for='01']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@type=\"radio\"][@id=\"10\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='col-lg-6 multiple-choice no-padding-right']//div[1]//div[1]//div[3]//div[1]//p[2]")).click();
	driver.findElement(By.xpath("//label[@for='10']")).click();
	}

@Test(priority=8)
	@Then("^message should be displayed as product added$")
	public void message_should_be_displayed_as_product_added() throws Throwable {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class=\"view-cart\"][@type=\"button\"]")).click();
	}

@Test(priority=9)
	@When("^user increase the quantityof item$")
	public void user_increase_the_quantityof_item() throws Throwable {
	Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//button[@class='plus'][normalize-space()='+']")).click();
	}

@Test(priority=10)
	@Then("^user get an alert for type of customization$")
	public void user_get_an_alert_for_type_of_customization() throws Throwable {
	/*Alert alert=driver.switchTo().alert();
	String alertmessage=driver.switchTo().alert().getText();
	//System.out.println(alert message);
	alert.accept();*/
	Thread.sleep(3000);
driver.findElement(By.xpath("//button[normalize-space()='Select New']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='col-lg-6 multiple-choice no-padding-right']//div[1]//div[1]//div[2]//div[1]//p[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='col-lg-6 multiple-choice no-padding-right']//div[1]//div[1]//div[4]//div[1]//p[2]")).click();	
	driver.findElement(By.xpath("//*[@class=\"view-cart\"][@type=\"button\"]")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//button[@class='minus'][normalize-space()='-']")).click();
}

@Test(priority=11)
	@When("^user decrease the quantity of item$")
	public void user_decrease_the_quantity_of_item() throws Throwable {
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//button[@class='minus'][normalize-space()='-']")).click();
	}

@Test(priority=12)
	@Then("^user gets an alert for proceeding cart/cancel$")
	public void user_gets_an_alert_for_procceding_cart_cancel() throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[normalize-space()='Proceed to Cart']")).click();
	//driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//button[@class='minus'][normalize-space()='-']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class=\"clear-all\"]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
Thread.sleep(3000);
	/*driver.findElement(By.xpath("//*[@title=\"Burgers & Wraps\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-menu-popup/div[@class='menu-popup-wrapper']/div[@class='menu-popup']/div[@class='content-section']/div[@class='menu-height']/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")).click();
	WebElement Expected=driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//span[@class='price pr-1'][contains(text(),'₹ 49')]"));
	//driver.findElement(By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//span[@class='price pr-1'][contains(text(),'₹ 49')]")).click();
driver.findElement(By.xpath("//*[@class=\"view-cart\"][@type=\"button\"]")).click();
driver.findElement(By.xpath("//button[normalize-space()='View Cart']")).click();
WebElement actual=driver.findElement(By.xpath("//*[@class=\"item-price\"]"));
	Assert.assertEquals(Expected.getText(), actual.getText());*/
	driver.close();
}	
}

