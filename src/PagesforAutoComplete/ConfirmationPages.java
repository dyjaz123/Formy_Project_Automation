package PagesforAutoComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPages{
	public static void waitforalertbanner(WebDriver driver)
	{WebDriverWait wait = new WebDriverWait(driver, 10);		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
	}
	
	public static String getAlertBannerText(WebDriver driver)
	{return driver.findElement(By.className("alert")).getText();		
	}

	}


