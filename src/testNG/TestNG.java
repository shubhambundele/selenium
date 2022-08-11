package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG
{

	@Test
	public void method1234()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();

		List<WebElement> addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for (int i = 0; i < addtocart.size(); i++)
		{
			addtocart.get(i).click();
		}
	}

}
