package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	  public CartPage(WebDriver driver)
	  {
		 PageFactory.initElements(driver, this );
	  }
	  
	 //-----------------------------------------------
	  @FindBy(xpath="//button[contains(text(),'Place Order')]")
	  private WebElement place_order;
	  
	  public void clickPlaceOrder()
	  {
		  place_order.click();
	  }
	  
	  //---------------------------------------------------
	  @FindBy(xpath="//input[@id='name']")
	  private WebElement enter_name;
	  
	  public void enterName()
	  {
		  enter_name .sendKeys("jasson huggis");
	  }
	  
	//---------------------------------------------------
	  @FindBy(xpath="//input[@id='country']")
	  private WebElement enter_country;
	  
	  public void enterCountry()
	  {
		  enter_country.sendKeys("Russia");
	  }
	  
	  
	//---------------------------------------------------
	  @FindBy(xpath="//input[@id='city']")
	  private WebElement enter_city;
	  
	  public void enter_city()
	  {
		  enter_city.sendKeys("Dhaka");  
	  }
	  
	  
	  
	//---------------------------------------------------
	  @FindBy(xpath="//input[@id='card']")
	  private WebElement enter_card;
	  
	  public void enterCardNumber()
	  {
		  enter_card.sendKeys("2455564965565");
	  }
	  
	  
	//---------------------------------------------------
	  @FindBy(xpath="//input[@id='month']")
	  private WebElement month_text;
	  
	  public void enter_month()
	  {
		  month_text.sendKeys("July");
	  }
	  
	  
	//---------------------------------------------------
	  @FindBy(xpath="//input[@id='year']")
	  private WebElement year_text;
	  
	  public void enterYear()
	  {
		  year_text.sendKeys("2022");
	  }
	  //--------------------------------------------------
	  
	  @FindBy(xpath="//button[contains(text(),'Purchase')]")
	  private WebElement purchase_btn;
	  
	  public void cliclkPurchase()
	  {
		  purchase_btn.click(); 
	  }
	//----------------------  
	  public void  ok(WebDriver driver)
	  {
		  driver.switchTo().alert().accept();
	  }
	  
	  
}