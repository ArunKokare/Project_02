package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	 // declare variable
	 private WebElement login_lnk;
	 private WebElement phone_lnk;
	 private WebElement samsung_galaxy_s6;
	 private WebElement add_to_cart_btn;
	
	//variable  intilization
	 public HomePage(WebDriver driver)     
	 {
	  login_lnk=driver.findElement(By.xpath("//a[@id='login2']"));
	  
	  phone_lnk=driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
	  samsung_galaxy_s6 = driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
	//  add_to_cart_btn = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
	  
	 }
	 
//----------use of variable-----------------------
	 public void clickOnLoginLink()
	 {
		 login_lnk.click();
	 }
	 
	 public void clickOnPhonesLinks()
	 {
		 phone_lnk.click();
	 }
	 
	 public void clickOnSamsungGalaxyS6()
	 {
		 samsung_galaxy_s6.click();
	 }
	 public void clickOnAddToCardButton()
	 {
		 add_to_cart_btn.click();
	 }
	 
	

}
