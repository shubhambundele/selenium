package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.className("button"));
		login.click();
		Thread.sleep(3000);

		WebElement userdetails = driver.findElement(By.xpath("//a[@id='welcome']"));
		userdetails.click();
		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']"));
		logout.click();
		Thread.sleep(3000);

	}

}
