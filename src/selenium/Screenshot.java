package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pranjali\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		username.sendKeys("shubhamb619@gmail.com");

		WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
		password.sendKeys("shubhamb1415");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourc = ts.getScreenshotAs(OutputType.FILE);
		File destinatio = new File("C:\\Users\\Pranjali\\Desktop\\screenshots\\loginpage.jpg");
		FileHandler.copy(sourc, destinatio);
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(3000);

		TakesScreenshot gs = (TakesScreenshot) driver;
		File source = gs.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Pranjali\\Desktop\\screenshots\\loginpage1.jpg");
		FileHandler.copy(source, destination);

	}

}
