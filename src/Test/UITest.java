package Test;

/* 01/07/2024
 * Krishna Punuganti
 * UI automation framewrok design
 * 
 * 
 */


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.BaseTest;


public class UITest extends BaseTest {

	String driverPath = "C:\\geckodriver.exe";
	WebDriver driver;
	SearchPage searchPage;

	@BeforeTest
	//Extend this to intiate any type of webdriver chrome/firefox
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserStack\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}

	@Test(priority = 1)
	public void openSearchPage() {
	HashMap<String,String> inputData = readFile("Users\automation\testData\input.xls", "searchPage",null);
	HashMap<String,String> expectedData = readFile("Users\automation\testData\expected.xls","searchPage",null);
	searchPage = new SearchPage(driver);
	searchPage.veryHeader();
	searchPage.clickOnGetStarted();
	searchPage.search(inputData.get("searchString"));
	searchPage.validateFirstResult(String expectedData.get("searchResults"));
	}
	


}
