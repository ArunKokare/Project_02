package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.HomePage;
import pageLayer.HomePage2;
import pageLayer.LoginPage;

public class LoginPageTest {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 -126\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//-------------------------------------------------
	HomePage2 home = new HomePage2(driver);
	LoginPage login =new LoginPage(driver);
	
	//-----------------------------------
	home.clickOnLoginLink();
	login.enterUsername();
	login.enterPassword();
	login.clickOnLoginButton();
	
	
	
	
}
}
