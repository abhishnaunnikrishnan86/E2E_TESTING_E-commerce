package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	 WebDriver driver;

	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators
	
	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");

	public void enterUsername(String username)
	{
	    driver.findElement(usernameField).sendKeys(username);
	}
	public void enterpassword(String pass)
	{
	    driver.findElement(passwordField).sendKeys(pass);
	}
	public void loginbttn()
	{
	    driver.findElement(loginButton).click();
	}
	
	
	
	//Actions

	public void login(String username,String pass)
	{
		enterUsername(username);
		enterpassword(pass);
		loginbttn();
	}
	
}
