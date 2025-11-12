package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verifyAccountRegistration()
	{
	logger.info("********* String Account registraion Test ***********");
	try
	{
	
	 HomePage hp = new HomePage(driver);
	 hp.clickMyAccount();
	 logger.info("******* Clicked on My Account  ********");
	 hp.clickRegister();
	 logger.info("******* Clicked on My Register Account ********");

	 AccountRegistrationPage ap = new AccountRegistrationPage(driver);
	 logger.info("******* providing customer details **********");
	 ap.setFirstName(randomString().toUpperCase());
	 ap.setLastname(randomString().toUpperCase());
	 ap.setEmail(randomString()+"@gmail.com");
	 ap.setTelephone(randomNumber());
	 
	 String password = randomAlphaNumeric();
	 ap.setPassword(password);
	 ap.setconfmPassword(password);
	 
	 ap.setPrivacyPolicy();
	 ap.clkContinueButton();
	 
	 logger.info("******* validation confirmation message  ********");

	 Assert.assertEquals(ap.getConfirmationMsg(), "Your Account Has Been Created!");
	 
	 logger.info("************ Test passed **********");
	}
	catch (Exception e)
	{
		logger.error("Test failed:" + e.getMessage());
		Assert.fail("Test failed:" +e.getMessage());
	}
	finally
	{
		logger.info("******* finshed test case*********");

	}
	}
}
