package NewProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.*;

public class AssertionTest {
	
	
	@Test
	public void Assert() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		String expct = "W3Schools Online Web Tutorials";
		
		String act = driver.getTitle();
		
		Assert.assertEquals(expct, act);
		
		System.out.println("Test pass");
		
}
		public static void main(String[] args) {
			
			AssertionTest assertTest1= new AssertionTest();
			assertTest1.Assert();
	}

}
