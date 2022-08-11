package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pranjali\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.googlemaps.com");
		Thread.sleep(4000);

		driver.navigate().to("https://www.fb.com");
		Thread.sleep(4000);

		driver.navigate().back();
		Thread.sleep(4000);

		driver.navigate().forward();
		Thread.sleep(4000);

		driver.navigate().refresh();
		Thread.sleep(4000);

		driver.manage().window().maximize();
		Thread.sleep(4000);

		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Thread.sleep(4000);

		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);

		Dimension d = new Dimension(200, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);

		Point p = new Point(200, 300);
		driver.manage().window().setPosition(p);
		Thread.sleep(4000);

		driver.close();
		Thread.sleep(4000);

		driver.quit();
		Thread.sleep(4000);
	}

}
