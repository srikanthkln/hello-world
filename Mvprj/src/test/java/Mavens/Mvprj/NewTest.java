package Mavens.Mvprj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void ChromeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/abc/chromedriver");
	  AppTest.driver = new ChromeDriver();
	  System.out.println("*********CHROMEE-From NEW Servers***********");
	  AppTest.driver.quit();
  }
}
