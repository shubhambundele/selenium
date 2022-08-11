package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		WebElement list = driver.findElement(By.xpath("//input[@list='mah-district']"));
		list.click();
		Thread.sleep(2000);

//		WebElement click = driver.findElement(By.xpath("//datalist[@id='mah-district']"));
//		click.click();
//		Thread.sleep(3000);

		Select s = new Select(list);
		s.selectByVisibleText("Aurangabad"); // s.selectByIndex(null); s.selectByValue(null);

	}

}
