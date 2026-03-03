package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Setup {

	
	
	protected static WebDriver driver;
	
	@BeforeClass
	public void setup() {

	    ChromeOptions options = new ChromeOptions();

	    // 🔥 Incognito mode
	    options.addArguments("--incognito");

	    // Disable password manager
	    Map<String, Object> prefs = new HashMap<>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);

	    options.setExperimentalOption("prefs", prefs);

	    options.addArguments("--disable-features=PasswordLeakDetection");
	    options.addArguments("--disable-save-password-bubble");

	    // ✅ IMPORTANT: Pass options here
	    driver = new ChromeDriver(options);

	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	}

}
