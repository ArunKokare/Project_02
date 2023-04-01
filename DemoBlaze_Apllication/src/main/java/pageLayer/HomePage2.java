package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
	//-----PageFactory ---------------------
		public HomePage2(WebDriver driver)     
		 {
		   PageFactory.initElements(driver, this);
		 }
		

		 @FindBy(xpath="//a[@id='login2']")                		 //variable initiliaze
		 private WebElement login_lnk;


		  public void clickOnLoginLink()
		 {
			  login_lnk.click();
		 }
		 
	
		 @FindBy(xpath="//a[contains(text(),'Phones')]")
		 private WebElement phone_lnk;
		 
		 public void clickOnPhonesLinks()
		 {
			 phone_lnk.click();
		 }
		 
		 @FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
		 private WebElement samsung_galaxy_s6;
		 
		 public void clickOnSamsungGalaxyS6()
		 {
			 samsung_galaxy_s6.click();
		 }
	
		 @FindBy(xpath="//a[contains(text(),'Add to cart')]")
		 private WebElement add_to_cart_btn;
		 
		 public void clickOnAddToCardButton()
		 {
			 add_to_cart_btn.click();
		 }
		 

		 @FindBy(xpath="//a[contains(text(),'Contact')]")
		 private WebElement contact_lnk; 
		 
		 public void clickContactLink()
		 {
			 contact_lnk.click();
		 }
	 
//----------------------------------------------------------
		 @FindBy(xpath="//a[@id='cartur']")
		 private WebElement add_cart;
		 
		 public void clickCardLink()
		 {
			 add_cart.click();
		 }
	
	
	 
	

}
