package my.twelve.project12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class something {
WebDriver driver = null;
@Test
public  void open_browser() {


	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.getTitle();
	System.out.println(driver.getTitle());
	driver.close();
}
}
