package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

/*********************************************************************************************************
 * Base page contains only constructor 
 * Why we need a constructor?
 * ans- we use constructor to initialize the webDriver instance and pagefactory elements to avoid repeating the same 
   initialization code again and again in every test method .
   
 * why we need to initilize the webdriver instance ?
 * ans-  we initialize webdriver instance so that selenium know which browser to control and can perform actions on
   that browser .
   initialization =  driver = new ChromeDriver() ;
   
 * What is pageFactory ?
 * ans- pagefactory is a helper class in selenium which is used to initialize web elemnts . that are defined using @FindBy annotation.
 * 
 * In two ways we can initialize a webelemnt 
  1- using driver.findelemnts().
  2- using pagefactory.initelemnts()  
  
 * advantages of using pagefactory 
 ans -  we dont have to write multiple driver.findelements() again and again .
        if a locator changes we update it only once . 
 * **********************************************************************************************************/
