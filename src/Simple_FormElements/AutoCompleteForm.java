package Simple_FormElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteForm {

	// The below shows how to select a value on an autocomplete form and have the
	// form filled out automatically.
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
		Thread.sleep(3000);		
		
		WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
		autocompleteresult.click();
		Thread.sleep(3000);
		
		driver.quit();	

	}

}
