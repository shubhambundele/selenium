package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart
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

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(3000);

		TakesScreenshot gs = (TakesScreenshot) driver;
		File source = gs.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Pranjali\\Desktop\\screenshots\\loginpage1.jpg");
		FileHandler.copy(source, destination);

		Dimension d = new Dimension(750, 750);
		driver.manage().window().setSize(d);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// //code-java script language
		js.executeScript("window.scrollBy(0,5000)"); // down-->1000

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-4500)");// up-1000
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("//div[@class='_28p97w'][1]"));
		click.click();
		click.click();
		Thread.sleep(2000);
		WebElement clickon = driver.findElement(By.xpath("//div[text()='Logout']"));
		clickon.click();

		driver.quit();
	}
}
