package TestCases;


import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePages;
import TestBase.Geniric_Methods;

public class SignInAccountTest extends Geniric_Methods {
	HomePages oHomePages;
	
	@BeforeTest
	public void setBrowser() throws Exception{
		setBrowser("chrome");
		
		String env=svalues("environment");
		if(env.equalsIgnoreCase("prod")){
			setUrl("https://www.amazon.com/");
			
		}else{
			setUrl("https://www.ebay.com/");
		}
		
	}
	
	@Test(priority=1)
	public void searchItem(){
		oHomePages=new HomePages(driver);
		oHomePages.signIn();
		
	}
	@Test(priority=2)
	public void validateHeaderText(){
		oHomePages=new HomePages(driver);
		String val=oHomePages.getText();
		
		Assert.assertTrue(true, "Sign in");
		
	}@Test(priority=3)
	public void loginInvalidData(){
		oHomePages=new HomePages(driver);
		passData(oHomePages.username,oHomePages.password,"dima","1234ssd",oHomePages.signInSubmit);
	}
	

}
