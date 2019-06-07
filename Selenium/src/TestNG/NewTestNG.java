package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNG {

  WebDriver driver = new FirefoxDriver();
  @BeforeTest
  public void message() {
	  System.out.println("*********Test Starts Here**********");
  }
@Test
public void login(){
	driver.manage().window().maximize();
	String baseurl = "http://newtours.demoaut.com/";
	driver.get(baseurl);
	driver.findElement(By.name("userName")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	System.out.println("Login sucess");
	 }

@Test
public void logoff(){
	driver.findElement(By.linkText("SIGN-OFF")).click();
	driver.close();
}
@AfterTest
public void End(){
	System.out.println("*********Test Ends Here**********");
}

}
