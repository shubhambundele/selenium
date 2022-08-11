package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationClass
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));// TODO Auto-generated method stub
		driver.get("https://www.flipkart.com/");
		System.out.println("URL is opened");
		Thread.sleep(2000);

		POMClass lg = new POMClass(driver);
		lg.enterusername();
		lg.enterpassword();
		lg.clickloginbutton();
	}

}
