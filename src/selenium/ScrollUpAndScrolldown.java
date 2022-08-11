package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrolldown
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// //code-java script language
		js.executeScript("window.scrollBy(0,1000)"); // down-->1000

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,-1000)");// up- scroll

	}

}
