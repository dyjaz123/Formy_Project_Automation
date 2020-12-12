package Simple_FormElements;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PagesforAutoComplete.ConfirmationPages;
import PagesforAutoComplete.FormPage;

public class CompeteWebForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");		
		Thread.sleep(3000);
		
		FormPage.submitform(driver);		
		
		ConfirmationPages.waitforalertbanner(driver);
				
		Assert.assertEquals("The form was successfully submitted!", ConfirmationPages.getAlertBannerText(driver));		
		
		driver.quit();		

	}		
			
	}

