package first;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FirstTest {
	WebDriver driver;
	
  @Test(groups="flavour")
  public void flavour() {
	  System.out.println("i am venilla");
  }
  @Test(groups="ice-cream")
  public void iceCream() {
	  System.out.println("i am ice-cream");
  }
  @Test(groups="flavour")
  public void fruits() {
	  System.out.println("i am graps");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\extract\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.spicejet.com");	
  }

}
