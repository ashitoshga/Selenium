package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testscript {
	private static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  //WebDriver driver = new FirefoxDriver();
	 //driver.get(url);
	  testlib T1 = new testlib(driver);
	 // T1.TestMethod("http://newtours.demoaut.com/");
	  boolean test2 = T1.TestMethod("http://newtours.demoaut.com/");
	  System.out.println(test2);
	  T1.Login("admin", "mercury");
	  if(test2=true)
	  {
		  T1.Login("admin", "mercury");
	  }
	  else{
			System.out.println("Test failed to RUN");
		driver.close();
} 
  }
  @AfterTest
  public void afterTest() 
  {
	  
	 testlib T2 = new testlib(driver);
	 T2.logOFF();
	  
  }

}
