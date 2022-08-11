package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass
{

	WebDriver driver;
	// user name
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;

	public void enterusername()
	{
		username.sendKeys("shubhamb619@gmail.com");
	}

	// password
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;

	public void enterpassword()
	{
		password.sendKeys("shubhamb1415");
	}

	// loginbutton
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbutton;

	public void clickloginbutton()
	{
		loginbutton.click();
	}

	public POMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
