package curs14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class WebElementExample {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
	
	//cand folosim selenium 3 varianta 1
	//	System.setProperty("webdriver.chrome.driver", "..path catre chromedriver.exe" );
	//	driver = new EdgeDriver();
		
	//cand folosim selenium 3 varianta 2
	// driver = WebDriverManager.chromedriver.create();	
		
	//cand folosim selenium 4 putem folosii direct	
		driver = new EdgeDriver();
		driver.manage().window().maximize(); //maximizeaza fereastra browserului
		
		
	}
	
	@Test
	public void webelementExample() {
		driver.get("https://keybooks.ro/");
		
		driver.findElement(By.id("menu_user"));
	}
	
	@AfterClass
	public void teardown() {
		
	//	driver.quit(); //inchide tot browserul cu toate taburile
	//	driver.close(); //inchide tabul curent (daca am un sg tab deschis, inchide si browserul)
	}
	

}
