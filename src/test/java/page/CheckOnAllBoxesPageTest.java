package page;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckOnAllBoxesPage;
import util.BrowserFactory;



public class CheckOnAllBoxesPageTest {

	WebDriver driver;
//	public CheckOnAllBoxesPageTest(WebDriver driver) {
//	this.driver = driver;
//}
	@Before
	public void init() {
	    driver = BrowserFactory.startBrowser();
	}
	
	@Test
	public void checkToggleBox() throws IOException {

		driver = BrowserFactory.startBrowser();

	//CheckOnAllBoxesPage checkonallboxesPage = new CheckOnAllBoxesPage;

		
		CheckOnAllBoxesPage checkonallboxespage = PageFactory.initElements(driver,CheckOnAllBoxesPage.class);
		
		checkonallboxespage.clickToggleAllBoxes();
		checkonallboxespage.takeScreenShotAtEndOfTest(driver);
		
		// Selenium test toggle page | 
	}

	//public String getPageTitle() {
	//return driver.getTitle();

	//}

  @After 
  public void tearDown() { BrowserFactory.tearDown();
  }
 } 
 