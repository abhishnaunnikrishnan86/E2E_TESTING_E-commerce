package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By first=By.id("first-name");
	By last=By.id("last-name");
	By postal=By.id("postal-code");
	By cont=By.id("continue");
	
	
	public void enterfirstname(String firstname)
	{
		driver.findElement(first).sendKeys(firstname);
	}
	public void enterlastname(String lastname)
	{
		driver.findElement(last).sendKeys(lastname);
	}
	public void enterzip(String zip)
	{
		driver.findElement(postal).sendKeys(zip);
	}
	public void continuebtn()
	{
		driver.findElement(cont).click();
	}
	
	
	public void checkout(String firstname,String lastname,String zip)
	{
		
		enterfirstname(firstname);
		enterlastname(lastname);
		enterzip(zip);
		continuebtn();
	}
	

}
