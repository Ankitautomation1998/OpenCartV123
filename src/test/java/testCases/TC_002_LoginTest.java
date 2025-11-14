package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	@Test
	public void verifyLogin()
	{
		logger.info("*********starting TC_002_loginTest********");
		try
		{
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("********* clicking on my account Link**********");

		hp.clickLogin();
		logger.info("********* clicking on login Link**********");

		
		LoginPage lp = new LoginPage(driver);
		
		logger.info("************ providing credential******");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		
		lp.login();
		logger.info("********* clicking on login Link**********");

		
		MyAccountPage macc = new MyAccountPage(driver);
		
		boolean targetpage=macc.isMyAccountExist();
		Assert.assertEquals(targetpage, true, "Login Failed");
		}catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*************Finshed login test*********");
	}
}
