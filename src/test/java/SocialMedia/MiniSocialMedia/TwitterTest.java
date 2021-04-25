package SocialMedia.MiniSocialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterTest {
	
	WebDriver driver;
	
	@Test
	public void Twitterlogin() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://twitter.com");
		driver.manage().window().maximize();
		System.out.println("Twitter login successful");
	}

}
