package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GrillPOM {
WebDriver driver;
WebDriverWait wait;
private By loginsignup=By.xpath("//*[contains(text(), ' Login / Sign Up ')]");
private By Login_via_pass=By.xpath("//*[text()=' Login Via Password ']");
private By mobileno=By.xpath("//input[@name='email']");
private By Password=By.xpath("//input[@id='password']");
private By login=By.xpath("//button[contains(text(),'Login')]");
private By custom=By.xpath("//*[@title=\"Burgers & Wraps\"]");
private By Additem=By.xpath("//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-menu-popup/div[@class='menu-popup-wrapper']/div[@class='menu-popup']/div[@class='content-section']/div[@class='menu-height']/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]");
private By Add_a_drink=By.xpath("//*[@type=\\\"radio\\\"][@id=\\\"00\\\"]");
private By Add_a_side=By.xpath("//*[@type=\"radio\"][@id=\"10\"]");
private By Add_ons=By.xpath("//div[@class='col-lg-6 multiple-choice no-padding-right']//div[1]//div[1]//div[4]//div[1]//p[2]");
private By Removebutton=By.xpath("//div[class='price-section d-flex desktop-version flex-column justify-content-between'] button[class='minus']");
private By Addtocart=By.xpath("//*[@class=\"view-cart\"][@type=\"button\"]");
private By incrementbutton=By.xpath("//div[@class='price-section d-flex desktop-version flex-column justify-content-between']//button[@class='plus'][normalize-space()='+']");
private By Alert=By.xpath("//button[normalize-space()='Select New']");
private By Add_drink=By.xpath("//*[@type=\\\"radio\\\"][@id=\\\"00\\\"]");
private By decrement_button=By.xpath("div[class='price-section d-flex desktop-version flex-column justify-content-between'] button[class='minus']");
private By proceed_to_cart=By.xpath("//button[normalize-space()='Proceed to Cart']");
public GrillPOM(WebDriver driver){
	this.driver=driver;
}
public void Loginsignup() {
	driver.findElement(this.loginsignup).click();
}
public void loginviapass() {
	driver.findElement(this.Login_via_pass).click();
}
public void enternumber(String no) {
	driver.findElement(this.mobileno).sendKeys(no);
}
public void enterpassword(String password) {
	driver.findElement(this.Password).sendKeys(password);
}
public void login(){
	driver.findElement(this.login).click();
}
public void customization() {
	driver.findElement(this.custom).click();
}
public void add_item() {
    driver.findElement(this.Additem).click();
}
public void add_a_drink() {
	driver.findElement(this.Add_a_drink).click();
}
public void add_a_side() {
	driver.findElement(this.Add_a_side).click();
}
public void add_ons() {
	driver.findElement(this.Add_ons).click();
}
public void remove() {
	driver.findElement(this.Removebutton).click();
}
public void add_to_cart() {
	driver.findElement(this.Addtocart).click();
}
public void increment() {
	driver.findElement(this.incrementbutton).click();
}
public void alertbutton() {
	driver.findElement(this.Alert).click();
}
public void adddrink() {
	driver.findElement(this.Add_drink).click();
}
public void decrement() {
	driver.findElement(this.decrement_button).click();
}
public void cart() {
	driver.findElement(this.proceed_to_cart).click();
}
 
}
