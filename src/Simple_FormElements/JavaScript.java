package Simple_FormElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");		
		Thread.sleep(3000);
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		Thread.sleep(3000);
		
		// Shows the use of JavaScript to click a button on a Modal window.
		WebElement closeButton = driver.findElement(By.id("close-button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closeButton);
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
