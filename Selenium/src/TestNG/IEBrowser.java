package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IEBrowser {
 private WebDriver driver;
 private boolean acceptNextAlert = true;
	
	@Test(priority=1)
  public void f() {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\ashu.gajare\\Desktop\\Selenium_Practice\\JAVA\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
	  DesiredCapabilities iecapabilities = DesiredCapabilities.internetExplorer();
	  iecapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	  driver = new InternetExplorerDriver(iecapabilities);
  }
	@Test(priority=2)
	public void Login(){
		driver.manage().window().maximize();
		String baseurl = "http://newtours.demoaut.com/";
		driver.get(baseurl);
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		System.out.println("Login sucess");
		driver.close();
		
	}
}
