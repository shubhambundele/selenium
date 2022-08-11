package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		username.sendKeys("shubhamb619@gmail.com");

		WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
		password.sendKeys("shubhamb1415");

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		login.click();
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.contextClick(login).perform();
		act.click(login).perform();
		Thread.sleep(2000);

		WebElement click = driver.findElement(By.xpath("//div[@class='_28p97w'][1]"));
//		click.click();
//		click.click();
//		act.doubleClick(click).perform();.
		act.moveToElement(click).perform();
		Thread.sleep(2000);

		WebElement clickon = driver.findElement(By.xpath("//div[text()='Logout']"));
		clickon.click();

	}

}
