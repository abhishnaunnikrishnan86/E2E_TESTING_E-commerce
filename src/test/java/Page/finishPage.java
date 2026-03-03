package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class finishPage {
	
	
	WebDriver driver;
	
	public finishPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By finish=By.id("finish");
	By header=By.xpath("//div[@class='header_secondary_container']");
	
	
	public void lastpage()
	{
		driver.findElement(finish).click();
		String s=driver.findElement(header).getText();
		System.out.println(s);
		
	}

}
