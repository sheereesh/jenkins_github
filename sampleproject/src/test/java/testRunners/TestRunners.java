package testRunners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunners {
	
	@Test
	public void fun() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("http://automationpractice.com/index.php");
		
	}

}
