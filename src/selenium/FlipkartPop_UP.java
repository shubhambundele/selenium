package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPop_UP
{

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));// TODO Auto-generated method stub
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		username.sendKeys("shubhamb619@gmail.com");

		WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
		password.sendKeys("shubhamb1415");
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourc = ts.getScreenshotAs(OutputType.FILE);
//		File destinatio = new File("C:\\Users\\Pranjali\\Desktop\\screenshots\\loginpage.jpg");
//		FileHandler.copy(sourc, destinatio);

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(3000);

		WebElement searchtext = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchtext.sendKeys("mobiles");
		Thread.sleep(3000);

		WebElement searchbtn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchbtn.click(); // div[text()='POCO C31 (Royal Blue, 64 GB)']

		WebElement mobile = driver.findElement(By.xpath("//div[text()='POCO C31 (Royal Blue, 64 GB)']"));
		mobile.click();

		List<String> pageaddress = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(pageaddress.get(1));

		WebElement addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addtocart.click();

	}

}
