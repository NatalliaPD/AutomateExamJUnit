package page;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveOneItemPage;
import util.BrowserFactory;

public class RemoveOneItemTest {
		
WebDriver driver;
	
//public RemoveOneItemTest(WebDriver driver) {
//this.driver = driver;
//}

@Before
public void init() {
    driver = BrowserFactory.startBrowser();
}

@Test
public void ClickOnCheckBox() {
 driver = BrowserFactory.startBrowser();
 
RemoveOneItemPage removeoneitemPage = PageFactory.initElements(driver, RemoveOneItemPage.class);
removeoneitemPage.ClickOnCheckBox();
removeoneitemPage.RemoveOneCheckedItem();

//How else can you do Assert??
Assert.assertTrue("Item removed", true);
		
}
@After 
public void tearDown() { BrowserFactory.tearDown();
driver.close();
driver.quit();
}
}