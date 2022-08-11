package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConcept extends MultipleScreenshot
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);

		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame3);

		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();

		driver.switchTo().parentFrame();

		WebElement textbox = driver.findElement(By.xpath("/html/body/input[1]"));
		textbox.sendKeys("shubham");
	}

}
