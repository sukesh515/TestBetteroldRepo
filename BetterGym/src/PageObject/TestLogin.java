package PageObject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin {
	
	
	@Test
	
	public void LoginBet() throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//WebDriver driver = new FirefoxDriver();
		
		Properties prop = new Properties();
		
		FileInputStream fil = new FileInputStream(System.getProperty("user.dir")+ "\\src\\datadriven.properties");
		
		//FileInputStream fil = new FileInputStream("datadriven.properties");
		
		
		prop.load(fil);

		driver.get("https://better.legendonlineservices.co.uk/enterprise/account/login");
		
		LoginPageBetter lp = new LoginPageBetter(driver);
		
		lp.username().sendKeys(prop.getProperty("username"));
		lp.Password().sendKeys(prop.getProperty("password"));
		
		lp.Login().click();
		Thread.sleep(3220L);
		lp.Logout().click();
		
		
		/*MakeBookingPage  makeb = new MakeBookingPage(driver);
		
		makeb.MakeBooking().click();
		
		makeb.AvoneilCheckbox().click();
				
		makeb.AvoneilCheckbox().click();
		
		Thread.sleep(3220l);
		
		makeb.OtherActivities().click();
		
		Thread.sleep(3220l);
		
		makeb.badmintoncheckbox().click();
		
		Thread.sleep(3220l);
		makeb.bookingsubmit().click();
		*/
		
	}
		
	

}
