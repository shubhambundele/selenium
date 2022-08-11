package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctcpunemultiple
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://vctcpune.com/selenium/practice.html");

		List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr//th"));
		for (int i = 0; i < column.size(); i++)
		{
			String text = column.get(i).getText();
			System.out.println(text);
		}

		List<WebElement> texts = driver.findElements(By.xpath("//table//tbody//tr//td"));
		for (int k = 0; k < texts.size(); k++)
		{
			String textss = texts.get(k).getText();
			System.out.println(textss);
		}

//		List<WebElement> cellData = driver.findElements(By.xpath("//table//tbody//tr//td"));
//
//		System.out.println("NoOfCells-" + cellData.size());
//
//		for (int i = 0; i < cellData.size(); i++)
//		{
//			String s = cellData.get(i).getText();
//			System.out.println(s);
//		}

	}

}
