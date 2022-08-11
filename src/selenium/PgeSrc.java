package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PgeSrc
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		// URL launch
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		// get page source
		String p = driver.getPageSource();
		System.out.println("Page Source is : " + p);
		driver.close();
	}

}
