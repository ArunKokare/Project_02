package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	
	 public ContactPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	//----------------------------------------- 
 
	 @FindBy(xpath="//input[@id='recipient-email']")
	 private WebElement contact_emalid;
	 
	 public void enterContactEmail()
	 {
		 contact_emalid.sendKeys("amarpatil25@gmail.com");
	 }
	//----------------------------------------- 
	 @FindBy(xpath="//input[@id='recipient-name']")
	 private WebElement contact_name;
	 
	 public void enterContactName()
	 {
		 contact_name.sendKeys("suhas nene"); 
		 
	 }
	//----------------------------------------- 

	 @FindBy(xpath="//textarea[@id='message-text']")
	 private WebElement text_massage;
	 
	 public void enterTextMassage()
	 {
		 text_massage.sendKeys("hi this page is test under maven project ");
	 }
		
	 //----------------------------------------- 
 
	 @FindBy (xpath="//button[contains(text(),'Send message')]")
	 private WebElement send_button;
	 
	 public void clickSendButton()
	 {
		 send_button.click(); 
	 }
	 
	 //--------------------------------------------------
	 public void popup( WebDriver driver)
	 {
		 driver.switchTo().alert().accept();
	 }

	 

	 
	 

}
