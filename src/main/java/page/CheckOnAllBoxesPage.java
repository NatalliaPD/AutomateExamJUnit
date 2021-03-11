package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;

public class CheckOnAllBoxesPage extends BasePage {

	WebDriver driver;

	public CheckOnAllBoxesPage() {

	}

	public CheckOnAllBoxesPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.CSS, using = "div[class ='controls']")
	WebElement TogglleAll;
	@FindBy(how = How.CSS, using = "li[style = 'font-size:16px']")
	WebElement CheckBoxes;

	// Interactive methods

	public void clickToggleAllBoxes() {
		TogglleAll.click();

		List<WebElement> checkbox = driver.findElements(By.cssSelector("li[style = 'font-size:16px']"));

		System.out.println(checkbox.size());

		for (WebElement e : checkbox) {
			System.out.println(e.isSelected());

		}
	}

	public void clickToggleTwoBoxes() {
		TogglleAll.click();

		List<WebElement> checkbox = driver.findElements(By.cssSelector("li[style = 'font-size:16px']"));

		System.out.println(checkbox.size());

		int checkCounter = 0;
		for (WebElement e : checkbox) {
			System.out.println(e.isSelected());
			if (e.isSelected()) {
				checkCounter++;
			}
		}
		
		assertEquals(2, checkCounter);
	}

	
}
