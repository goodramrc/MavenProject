package curs14;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import utils.BaseTest;

public class SeleniumLocators extends BaseTest{
	
	@Test(priority=1)
	public void tagNameLocator() {
		
	WebElement discoverText =driver.findElement(By.tagName("em"));
	//getText() - returneaza textul unui WebElement, adica textul dintre
	// perechea de <em> Discover </em>
	
	System.out.println(discoverText.getText());
	assertEquals(discoverText.getText(), "Discover");
		
	}
	
	@Test(priority=2)
	public void linkTextLocator() {
//<a href="https://keybooks.ro/shop/">BOOKS</a>		
		driver.findElement(By.linkText("BOOKS")).click();
		//getCurrentURL() - returneaza URL-ul curent al paginii
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority=3)
	public void partialLinkTextLocator() {
	//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>
	driver.findElement(By.partialLinkText("Cooking")).click();	
	assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");	
	}
	
	@Test(priority=4)
	public void classLocator() {
		//<p class="price">
		
		WebElement price = driver.findElement(By.className("price"));
		//isDisplayed() - verifica daca elementul este displayed
		assertTrue(price.isDisplayed());
		//assertTrues(driver.findElement(By.className("price")).isDisplayed()); - daca price este folosit doar pt o singuta actiune a browserului
	}

	
	@Test(priority=5)
	public void idLocator() {
		
		//<li class="reviews_tab" id="tab-title-reviews" role="tab" aria-controls="tab-reviews">
		
		WebElement reviewsTab = driver.findElement(By.id("tab-title-reviews"));
		assertTrue(reviewsTab.isDisplayed());
		reviewsTab.click();
	}
	
	@Test(priority=6)
	public void nameLocator() {
		WebElement commentBox = driver.findElement(By.name("comment"));
		//sendKeys() - ne permite sa scriem de la tastatura intr-un element
		commentBox.sendKeys("My super comment !");
	}
	
	@Test(priority=7)
	public void cssSelectorLocator() {
		
		//cssSelector - tagnameHtml[atribut=valoareaAtribut]
		//Ex: input[name=['author']
		//<input id="author" name="author" type="text" value="" size="30" required="">
		
		driver.findElement(By.cssSelector("input[name='author']")).sendKeys("Ion");
	}
	
	@Test(priority=8)
	public void xpathSelector() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com");
	}
}
