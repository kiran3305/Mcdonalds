package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.GrillPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DefectSD {
	WebDriver driver;
	@Test(priority=1)
	@Given("^User logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium automation\\Selenium software\\chromedriver.exe");
		 driver=new ChromeDriver();
	   driver.get("https://www.mcdelivery.co.in/home");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//*[contains(text(), ' Login / Sign Up ')]")).click();
	  GrillPOM obj=PageFactory.initElements(driver,GrillPOM.class);
		  obj.loginviapass();
	obj.enternumber("6301389621");
			obj.enterpassword("Kiran123@");
			obj.login();
			
		  }

@Test(priority=2)
@When("^user clicked on item$")
public void user_clicked_on_item() throws Throwable {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@title=\"Burgers & Wraps\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-menu-popup/div[@class='menu-popup-wrapper']/div[@class='menu-popup']/div[@class='content-section']/div[@class='menu-height']/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")).click();
}
@Test(priority=3)
@Then("^grill chart should be displayed$")
public void grill_chart_should_be_displayed() throws Throwable {
 Thread.sleep(3000);
}
@Test(priority=4)
@Then("^user selected two items under same section$")
public void user_selected_two_items_under_same_section() throws Throwable {
	WebElement cokeradiobtn=driver.findElement(By.xpath("//*[@type=\"radio\"][@id=\"00\"]"));
	 cokeradiobtn.click();
	 System.out.println("CokeRadioButton is selected?" +cokeradiobtn.isSelected());
	//driver.findElement(By.xpath("//*[@type=\"radio\"][@id=\"00\"]")).click();
	   Thread.sleep(3000);
	   WebElement Spriteradiobtn=driver.findElement(By.cssSelector("label[for='01']"));
	    Spriteradiobtn.click();
	    System.out.println("spriteRadioButton is selected?" +Spriteradiobtn.isSelected());
	   Thread.sleep(2000);
	  boolean Expected=true;
	   boolean Actual=Spriteradiobtn.isSelected();
Assert.assertEquals(Expected, Actual);
}
@Test(priority=5)
@Then("^only a single item should be selected$")
public void only_a_single_item_should_be_selected() throws Throwable {
 Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@class=\"view-cart\"][@type=\"button\"]")).click();
}

}
