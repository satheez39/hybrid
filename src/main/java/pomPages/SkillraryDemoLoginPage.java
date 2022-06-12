package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtarining;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	public void seleniumtrainingbtn() {
		seleniumtarining.click();
	}

}