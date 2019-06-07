package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ChromeTest {
	private WebDriver driver;
	
	//@Parameters({"browser"});
	  @Test(priority=1)
    public void f() {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			String baseurl = "http://newtours.demoaut.com/";
			driver.get(baseurl);
			driver.findElement(By.name("userName")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			System.out.println("Login sucess");
  }
	  @BeforeTest
	  public void message() {
		  System.out.println("*********Test Starts Here**********");
	  }
	

	@Test(priority=2)
	public void logoff(){
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();
	}
	@AfterTest
	public void End(){
		System.out.println("*********Test Ends Here**********");
	}

}
