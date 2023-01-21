package TestNgTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class common extends testNGThree{
	public static void click(String xpath) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void hover(String xpath) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
	}
	
	public static boolean isDisplayed(String xpath) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public static void sendKeys(String xpath, String text) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	

	

}
