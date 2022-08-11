package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassSauceDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.saucedemo.com/");

		POMClassSauceDemo pom = new POMClassSauceDemo(driver);
		Thread.sleep(2000);
		pom.loginid();
		Thread.sleep(2000);
		pom.loginpass();
		Thread.sleep(2000);
		pom.loginclick();
		Thread.sleep(2000);
		pom.addtocart();

	}

}
