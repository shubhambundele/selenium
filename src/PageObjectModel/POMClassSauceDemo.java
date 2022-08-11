package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassSauceDemo
{
	private WebDriver driver;
	private Actions act;

	@FindBy(xpath = "//input[@class='input_error form_input'][1]")
	private WebElement loginbutton;

	public void loginid()
	{
		loginbutton.sendKeys("standard_user");
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement loginpassword;

	public void loginpass()
	{
		loginpassword.sendKeys("secret_sauce");
	}

	@FindBy(xpath = "//input[@class='submit-button btn_action']")
	private WebElement login;

	public void loginclick()
	{
		// login.click();
		act.click(login).perform();
	}

	@FindBy(xpath = "//button[text()='Add to cart']")
	List<WebElement> addtocartbuttons;

	public void addtocart()
	{
		for (WebElement itemstoclick : addtocartbuttons)
		{
			itemstoclick.click();

		}
	}

	public POMClassSauceDemo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);

	}
}
