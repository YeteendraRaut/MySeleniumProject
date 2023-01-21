package TestNgTestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGtwo {
	public class testNg {
		public static WebDriver driver;
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yraut\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tickertape.in/screener/equity");
			/*try {
				driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
			} catch (NoSuchElementException e) {
			}*/
		}
		
		@Test(priority = 1)
		public void StockUniverseTest() throws InterruptedException {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    Thread.sleep(2000);
		    boolean flag=driver.findElement(By.xpath("//span[@class=\"jsx-214020999 jsx-177278739 typography-body-regular-m universe-tab ml16 \"]")).isDisplayed();
		    Assert.assertTrue(flag);
		}
		@Test(priority = 2)
		public void PERatioTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));*/
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		}
		@Test(priority = 3)
		public void MarketCapTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]"));
		    }
		@Test(priority = 4)
		public void ClosePriceTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));*/
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]"));
		}
		@Test(priority = 5)
		public void AddFilterTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();*/
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));
		    
		    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]"));
		    driver.findElement(By.xpath("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]")).click();
		}
		@Test(priority = 6)
		public void ExportTabTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();*/
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));
		    
		   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]"));
		    driver.findElement(By.xpath("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]")).click();
		    driver.findElement(By.xpath("(//span[@class=\"jsx-1030694240\"])[4]")).click();
		    
		}
		@Test(priority = 7)
		public void NewScreenTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();*/
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));*/
		    
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]"));
		    driver.findElement(By.xpath("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]")).click();
		    driver.findElement(By.xpath("(//span[@class=\"jsx-1030694240\"])[4]")).click();
		    driver.findElement(By.xpath("//h5[@class=\"jsx-392637537 typography-h5 text-primary ellipsis d-inline-block full-width\"]")).isDisplayed();

		}
		@Test(priority = 8)
		public void SockUniverseNiftyFiftyTest() {
			/*driver.findElement(By.xpath("//i[@data-toggle=\"products\"]")).click();
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/assets/stock.svg\"])[1]")).click();
		   
		    driver.findElement(By.xpath("(//img[@src=\"https://assets.tickertape.in/nav-logos/tools_of_the_trade/stock_screener.svg\"])[1]")).click();*/
		    
		    //WebDriverWait expWait= new WebDriverWait(driver, Duration.ofSeconds(5));
			//expWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]"))));*/
		    
		  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		    
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]"));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]"));
		    driver.findElement(By.xpath("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]")).click();
		    driver.findElement(By.xpath("(//span[@class=\"jsx-1030694240\"])[4]")).click();
		    driver.findElement(By.xpath("//div[@class=\"jsx-1149186501 sector-info\"]")).click();		   
		    driver.findElement(By.xpath("//h5[@class=\"jsx-392637537 typography-h5 text-primary ellipsis d-inline-block full-width\"]")).isDisplayed();
            driver.findElement(By.xpath("(//span[@class=\"jsx-3866717609 jsx-3091157964 icon-pos-align\"])[1]")).click();

		}
		
		
		@AfterMethod
		public void close() {
			driver.quit();
		}
	}
}





	
