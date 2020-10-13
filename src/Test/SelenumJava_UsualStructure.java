package Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenumJava_UsualStructure {

	public static String baseURL = "http://demo.guru99.com/test/newtours/";
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();

		verifyHomePageTitle();
		driver.quit();

	}

	public static void verifyHomePageTitle() {

		String expectedtitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
	}
	/*	try {
			
			System.out.println("test passed");
		} catch (Exception e) {
			System.out.println("test failed");
		}

	}*/

}