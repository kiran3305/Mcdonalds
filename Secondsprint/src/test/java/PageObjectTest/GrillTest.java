package PageObjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.GrillPOM;

public class GrillTest {
@Test
public void Grill()  {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium automation\\Selenium software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   driver.get("https://www.mcdelivery.co.in/home/trending");
   driver.manage().window().maximize();
  /* WebDriverWait wait=new WebDriverWait(driver, 40);
   ChromeOptions options = new ChromeOptions();*/
   GrillPOM g=new GrillPOM(driver);
   g.Loginsignup();
   g.loginviapass();
   g.enternumber("6301389621");
   g.enterpassword("Kiran123@");
   g.login();
   g.customization();
   g.add_item();
   g.add_a_drink();
   g.add_a_side();
   g.add_ons();
   g.remove();
   g.add_to_cart();
   g.increment();
   g.alertbutton();
  g.adddrink();
  g.decrement();
   driver.close();
}
}
