package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Grid_Script {
	private WebDriver driver;
	private DesiredCapabilities capability;
	String nodeURL;
	String baseURL;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get(baseURL);
		Thread.sleep(15000);
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/td/table/tbody/tr/td[1]/a")).click();

  }
  @Parameters ({"browser"}) 
  
  @BeforeTest
  public void beforeTest(String browser) throws MalformedURLException {
	  nodeURL = "http:/192.168.107.1:4444/wd/hub";
	  baseURL = "http:/newtours.demoaut.com";
	  System.out.println(browser);
	  if(browser.equalsIgnoreCase("FF"))
	  {
		  capability = DesiredCapabilities.firefox();
		  capability.setBrowserName("firefox");
	  }
	  else if(browser.equalsIgnoreCase("CH"))
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		  capability = DesiredCapabilities.chrome();
		  capability.setBrowserName("chrome");
			
	  }
	  else
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\IEDriverServer.exe");
		  capability = DesiredCapabilities.internetExplorer();
		  capability.setBrowserName("internet explore");
		
			
	  }
	  driver = new RemoteWebDriver(new URL(nodeURL), capability);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
