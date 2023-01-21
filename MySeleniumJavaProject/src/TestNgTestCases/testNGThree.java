package TestNgTestCases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGThree {
	public class testNg {
		public static WebDriver driver;
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yraut\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.tickertape.in/screener/mutual-fund");
			/*try {
				driver.findElement(By.xpath("//i[@class=\"jsx-1245644719 jsx-2319868650 icon-Close text-24 text-primary\"]")).click();
			} catch (NoSuchElementException e) {
			}*/
		}
		@Test(priority = 1)
			public void MFUniverseTabTest() {
				
			   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
			 
			}
		@Test(priority = 2)
		public void LiquidfundCheckBoxUnderMFUniverseTabTest() {
			
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		}
		@Test(priority = 3)
		public void FundTrackingNiftyCheckBoxUnderMFUniverseTabTest() {
			
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		}
		@Test(priority = 4)
		public void categoryMFUniverseTabTest() {
			
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		}
		@Test(priority = 5)
		public void planMFUniverseTabTest() {
			
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]")).click();
		}
		@Test(priority = 6)
		public void AUMcrMFUniverseTabTest() {
			
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]")).click();


		}
		@Test(priority =7 )
		public void CAGR3yMFUniverseTabTest() {
			
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]")).click();
		  //  driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]")).click();

		}
		@Test(priority = 8)
		public void ExpenseRatioMFUniverseTabTest() {
			
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]")).click();
		    //driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[4]")).click();

		}
		@Test(priority = 9)
		public void AddFillterFUniverseTabTest() {
			
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]")).click();
		    //driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[4]")).click();
		    driver.findElement(By.xpath("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]")).click();
		}

		
		@Test(priority = 10)
		public void CustomMFUniverseTabTest() {
			
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.xpath("(//div[@class=\"jsx-214020999 jsx-173293736 \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[1]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[2]")).click();
		    driver.findElement(By.xpath("(//i[@class=\"jsx-3866717609 jsx-3091157964  text-18 mr8  icon-checkbox-blank \"])[3]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[1]")).click();
		    //driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[2]")).click();
		   // driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[3]")).click();
		    driver.findElement(By.xpath("(//div[@class=\"jsx-254693987 card-title\"])[4]")).click();
		    driver.findElement(By.xpath("//span[@class=\"jsx-4191592233 typography-button-large text-btn\"]")).click();
		    driver.findElement(By.xpath("//span[@class=\"jsx-214020999 jsx-177278739 typography-body-regular-m universe-tab ml16 \"]")).click();

		}
			    @AfterMethod
				public void close() {
					driver.quit();
				}
			}
		}


