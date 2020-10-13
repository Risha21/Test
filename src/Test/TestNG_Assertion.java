package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_Assertion {
	/*public String baseurl="https://www.amazon.com";
	public WebDriver driver;
	
	@BeforeTest
		
		public void setBaseURL() {
			driver=new ChromeDriver();
			driver.get(baseurl);
			
		}
	*/
	@Test
	public void testAssertionfunction() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Desktop\\\\software\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String actualTitle=driver.getTitle();
		System.out.println();
	}
/*	public void verifyHomePageTitle() {
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	}
	/*@AfterTest
	public void endSession() {
		driver.quit();
	}*/

	}
		
		


