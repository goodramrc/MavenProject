package curs12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void openBrowser() {
		
		
		WebDriver driver = new EdgeDriver();
		
		// new FirefoxDriver()
		// new EdgeDriver();
		
		driver.get("https://keybooks.ro/");
		
	}
}
