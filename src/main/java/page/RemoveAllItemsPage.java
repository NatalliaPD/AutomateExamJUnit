package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllItemsPage extends BasePage{
WebDriver driver;

	
	public RemoveAllItemsPage(WebDriver driver) {
	this.driver = driver;
}
	
	//Element Library
	@FindBy(how = How.CSS, using = "input[name ='todo[0]']")
	WebElement TopCheckBox;
	@FindBy(how = How.CSS, using = "input[name ='todo[2]']")
	WebElement BottomCheckBox;
	@FindBy(how = How.CSS, using = "input[name ='allbox']")
	WebElement ToggleAll;
	@FindBy(how = How.CSS, using = "input[value ='Remove']")
	WebElement RemoveButton;
	
	//Interactive methods
	public void checkBoxes() {
	TopCheckBox.click();
	BottomCheckBox.click();
	}
	
	
	public void checkToggleAll() {
	ToggleAll.click();
	}
	
	
	public void hitRemove() {
	RemoveButton.click();

	}

	}

	

