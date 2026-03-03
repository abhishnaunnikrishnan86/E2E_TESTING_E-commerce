package Page;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Setup;

public class Shoppage extends Setup {
	
 	WebDriver driver;
	public Shoppage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By productContainer = By.className("inventory_item");
	By productName = By.className("inventory_item_name");
	By addButton = By.tagName("button");
	By cart=By.xpath("//a[@class='shopping_cart_link']");
	By check=By.id("checkout");

	public void addproduct(String item)
	{
	    List<WebElement> products = driver.findElements(productContainer);

	    for (WebElement product : products)
	    {
	        String name = product.findElement(productName).getText();

	        if (name.equals(item))
	        {
	            product.findElement(addButton).click();
	            break; // stop after adding
	        }
	    }
	    
	   driver.findElement(cart).click();
	   driver.findElement(check).click();
	
	
	}

}
