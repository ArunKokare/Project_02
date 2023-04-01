package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageLayer.CartPage;
import pageLayer.HomePage2;

public class CardPageText {
	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 -126\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	HomePage2 home = new HomePage2(driver);
	CartPage card = new CartPage(driver);
	home.clickCardLink();
	
	card.clickPlaceOrder();
	card.enterName();
	card.enterCountry();
	card.enter_city();
	card.enterCardNumber();
	card.enter_month();
	card.enterYear();
	card.cliclkPurchase();
	card.ok(driver);
	driver.quit();
	
	
	}
}
