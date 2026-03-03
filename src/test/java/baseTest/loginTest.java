package baseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.CheckoutPage;
import Page.Shoppage;
import Page.finishPage;
import Page.loginPage;
import base.Setup;

public class loginTest extends Setup {
	
	
	
	@Test
	public void validTestLogin()
	{
	    loginPage lp = new loginPage(driver);
	    lp.login("standard_user", "secret_sauce");

	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl,
	        "https://www.saucedemo.com/inventory.html",
	        "Login failed!");

		Shoppage sh=new Shoppage(driver);
		sh.addproduct("Sauce Labs Backpack");
	   
		CheckoutPage cp=new CheckoutPage(driver);
		cp.checkout("abcd", "efg", "680504");
		
		finishPage fp=new finishPage(driver);
		fp.lastpage();
	
	
	
	}

}
