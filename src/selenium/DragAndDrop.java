package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		WebElement source = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='box105']"));

		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(source, destination).perform();

	}

}
