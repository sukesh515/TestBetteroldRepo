
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BetterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		 driver.get("https://better.legendonlineservices.co.uk/enterprise/account/login");	
		 
		 driver.findElement(By.id("login_Email")).sendKeys("sukesh515@gmail.com");
		 driver.findElement(By.id("login_Password")).sendKeys("Hyundai515");
		 driver.findElement(By.id("login")).click();
		 driver.findElement(By.linkText("View My Bookings")).click();
		 driver.close();
		 
		 
			

		 
		

	}

}
