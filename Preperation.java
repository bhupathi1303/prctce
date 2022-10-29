package interviews;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Preperation {
	public WebDriver driver;
  @Test
  public void Assertion() {
	  String at =driver.getTitle();
	  String et = at;
	 
		 Assert.assertEquals(at,et);}

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	
  }

}
