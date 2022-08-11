package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pranjali\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);

		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
		Thread.sleep(3000);

		WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		addtocart.click();
		Thread.sleep(3000);

		WebElement viewcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		viewcart.click();
		Thread.sleep(3000);

		WebElement checkout = driver.findElement(By.xpath("//button[@name='checkout']"));
		checkout.click();
		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstname.sendKeys("shubham");
		Thread.sleep(3000);

		WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("bundele");
		Thread.sleep(3000);

		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipcode.sendKeys("450221");
		Thread.sleep(3000);

		WebElement countinuebtn = driver.findElement(By.xpath("//input[@id='continue']"));
		countinuebtn.click();
		Thread.sleep(3000);

	}

}
