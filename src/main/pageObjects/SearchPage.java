package main.pageObjects;


/* 01/07/2024
 * Krishna Punuganti
 * UI automation framewrok design
 * 
 * 
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	private WebDriver driver ;
	
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(cssSelector = "h3 > a")
	WebElement results;
	
	
	
	public SearchPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
