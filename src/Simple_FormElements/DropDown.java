package Simple_FormElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");		
		Thread.sleep(3000);
		
		WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
		dropdownMenuButton.click();
		Thread.sleep(3000);
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.click();
		Thread.sleep(3000);
		
		driver.quit();
			

	}

}
