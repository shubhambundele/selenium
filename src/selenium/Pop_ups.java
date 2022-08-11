package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_ups
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.id("alertButton"));
		button.click();

		Alert alt = driver.switchTo().alert();
		alt.accept();

		WebElement button1 = driver.findElement(By.id("timerAlertButton"));
		button1.click();
		Thread.sleep(6000);
		alt.accept();

	}

}
