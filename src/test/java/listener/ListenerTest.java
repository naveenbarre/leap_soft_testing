package listener;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

//@Listeners(listener.Itestlistener.class)
public class ListenerTest {
	WebDriver driver;
  @Test
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","D:\\extract\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.spicejet.com");	
		System.out.println("you are navigated to spicejet");
  }

  @BeforeTest
  public void beforeTest() {
  }

}
