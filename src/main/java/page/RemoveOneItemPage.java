package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveOneItemPage extends BasePage{

	
WebDriver driver;

	
	public RemoveOneItemPage(WebDriver driver) {
		this.driver = driver;
}
	
	//Element Library
	@FindBy(how = How.CSS, using = "input[name='todo[2]']")
	WebElement CheckOnBox;
	@FindBy(how = How.CSS, using = "input[value = 'Remove']")
    WebElement RemoveButton;


// Interactive Methods
   public void ClickOnCheckBox() {
   CheckOnBox.click();  
   }
   
   public void RemoveOneCheckedItem() {
	RemoveButton.click();
   }
}