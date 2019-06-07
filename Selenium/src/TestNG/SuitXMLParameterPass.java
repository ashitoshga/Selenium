package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SuitXMLParameterPass {
	private WebDriver driver;
	  @Parameters({"browser"})
  @Test
  public void f(String browser) {
	
		String baseurl = "http://newtours.demoaut.com/";
		driver.get(baseurl);
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		System.out.println("Login sucess");
		driver.close();
}
	  
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("CH"))
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
	  }
	  else if(browser.equalsIgnoreCase("FF"))
	  {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
	  }
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\ashu.gajare\\Desktop\\Selenium_Practice\\JAVA\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
		  DesiredCapabilities iecapabilities = DesiredCapabilities.internetExplorer();
		  iecapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		  driver = new InternetExplorerDriver(iecapabilities);
		  driver.manage().window().maximize();
	  }
	  
	 
  }
  @Parameters({"browser"})
  @AfterTest
  public void afterTest(String browser) {
	  System.out.println("****EndS Here*****");
  }

}
