package page;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllItemsPage;
import util.BrowserFactory;

public class RemoveAllItemsTest {

	WebDriver driver;

	//public RemoveAllItemsTest(WebDriver driver) {
	//	this.driver = driver;
	//}
	
	@Before
	public void init() {
	    driver = BrowserFactory.startBrowser();
	}

	@Test
	public void CheckToggleBox() throws IOException {

		driver = BrowserFactory.startBrowser();
		RemoveAllItemsPage removeallitemspage = PageFactory.initElements(driver, RemoveAllItemsPage.class);

		removeallitemspage.checkBoxes();
		removeallitemspage.checkToggleAll();
		removeallitemspage.hitRemove();
		removeallitemspage.takeScreenShotAtEndOfTest(driver);
	}

	@After
	public void tearDown() {
		BrowserFactory.tearDown();
		driver.close();
		driver.quit();
	}
}
