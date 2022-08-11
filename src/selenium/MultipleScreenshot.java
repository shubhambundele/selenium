package selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshot
{
	static WebDriver driver;

	public static void screenshot() throws IOException

	{
		Date d = new Date(0);
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);

//		Timestamp time = new Timestamp(System.currentTimeMillis());
//		String times = time.toString().replace(" ", "").replace(".", "").replace(":", "").replace("-", "");

		TakesScreenshot gs = (TakesScreenshot) driver;
		File source = gs.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Pranjali\\Desktop\\screenshots\\loginpage1" + date + ".jpg");
		FileHandler.copy(source, destination);
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pranjali\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		username.sendKeys("shubhamb619@gmail.com");

		WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
		password.sendKeys("shubhamb1415");
		Thread.sleep(4000);
		screenshot();

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(4000);

		MultipleScreenshot.screenshot();

	}

}
