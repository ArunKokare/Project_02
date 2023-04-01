package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.ContactPage;
import pageLayer.HomePage2;

public class ContactPageTest {
	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 -126\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	HomePage2 home = new HomePage2(driver);
	ContactPage contact = new ContactPage(driver);
	
	home.clickContactLink();
	contact.enterContactEmail();
	contact.enterContactName();
	contact.enterTextMassage();
	contact.clickSendButton();
	contact.popup(driver);
	
	
	
	
	}
}
