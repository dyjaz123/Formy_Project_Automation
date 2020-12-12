package Simple_FormElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");		
		Thread.sleep(3000);
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("12/25/2020");
		Thread.sleep(3000);
		datepicker.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
