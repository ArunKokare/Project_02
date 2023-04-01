package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageLayer.HomePage;
import pageLayer.HomePage2;
@Listeners(utility.Listener.class)

public class BuyProductTest2  {
	@Test
	public void byProduct() 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 -126\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//-------------------------------------------------
	HomePage2 home = new HomePage2(driver);
	home.clickOnPhonesLinks();
	home.clickOnSamsungGalaxyS6();
	home.clickOnAddToCardButton();
	
	
	
	
 }
}
