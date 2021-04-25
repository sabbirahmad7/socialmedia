package SocialMedia.MiniSocialMedia;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class fbTest {
	
	 WebDriver driver;
	
	@Test
	public void facebookLogin() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
	}

}
