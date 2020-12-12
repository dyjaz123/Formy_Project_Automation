package PagesforAutoComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
	public static void submitform(WebDriver driver) throws InterruptedException
	{driver.findElement(By.id("first-name")).sendKeys("Dean");		
	Thread.sleep(3000);
	
	driver.findElement(By.id("last-name")).sendKeys("Smithereen");
	Thread.sleep(3000);
	
	driver.findElement(By.id("job-title")).sendKeys("ChiefCookandBottleWasher");
	Thread.sleep(3000);
	
	driver.findElement(By.id("radio-button-2")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("checkbox-1")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("option[value='4']")).click();
    Thread.sleep(3000);
	
	WebElement datePicker = driver.findElement(By.id("datepicker"));
	datePicker.sendKeys("12/25/2020");
	Thread.sleep(3000);
	datePicker.sendKeys(Keys.RETURN);
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	Thread.sleep(3000);
	}

}
