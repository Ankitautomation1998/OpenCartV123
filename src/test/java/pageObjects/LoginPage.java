package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement btnLogin;
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void login()
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click();", btnLogin);
				
				//sol2 
				//btnContinue.submit();
				
				//sol3
				//Actions act=new Actions(driver);
				//act.moveToElement(btnContinue).click().perform();
							
				//sol4
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click();", btnContinue);
				
				//Sol 5
				//btnContinue.sendKeys(Keys.RETURN);
				
				//Sol6  
				//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
				//mywait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
				

				btnLogin.click();
	}

}
