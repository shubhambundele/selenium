package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Searchflipkart
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pranjali\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		username.sendKeys("shubhamb619@gmail.com");

		WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
		password.sendKeys("shubhamb1415");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(4000);

		WebElement homecategory = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]"));
		homecategory.click();
		Thread.sleep(2000);

		WebElement homecategory1 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act = new Actions(driver);
		act.moveToElement(homecategory1).perform();
		Thread.sleep(2000);

		WebElement homecategory2 = driver.findElement(By.xpath("//a[@title='Beds']"));
		homecategory2.click();
		Thread.sleep(2000);

//		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
//		search.sendKeys("mobile");
//		Thread.sleep(2000);
//		WebElement clicksearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//		clicksearch.click();

	}

}
