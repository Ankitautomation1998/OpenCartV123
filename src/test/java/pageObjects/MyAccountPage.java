package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgHeading;
	
	@FindBy(xpath="//div[@class='list-group']//a[normalize-space()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath="(//h2[normalize-space()='My Account'])[1]")
	WebElement msgHeadingAfterLogin;
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return(msgHeading.isDisplayed());
		}catch(Exception e)
		{
			return (false);
		}
	}
	
	public boolean isMyAccountExist()
	{
		try
		{
			return(msgHeadingAfterLogin.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
