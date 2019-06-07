package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGLibrary  {
	
	public static WebDriver driver;
	public TestNGLibrary(WebDriver driver){
		this.driver = driver;
		
	}
	@Test
	public Boolean Prerequisite(String baseurl) throws IOException
{
	driver = new FirefoxDriver();
	String expectedtitle="Welcome: Mercury Tours";
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	
	Boolean navin1;
		if(actualtitle.contentEquals(expectedtitle))
	{
		System.out.println("Navigation is Successful!");
		navin1 = true;
		return navin1;
	}
	else
		System.out.println("Navigation is Failed");
		System.out.println("Actual URL is " + actualtitle);
		navin1 = false;
		return navin1;
}
	public static Boolean Login(String UN, String PW)
	{
		driver.findElement(By.name("userName")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PW);
		driver.findElement(By.name("login")).click();
		
		Boolean login;
			if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed())
			{
				System.out.println("Login is Successful...");
				login=true;
				return login;
			}
			else
			{
				System.out.println("Login is UnSuccessful...");
				login=false;
				return login;
			}
}
	  @AfterTest
	  public void Logoff() {
		  //WebDriver driver = new FirefoxDriver();
		  driver.findElement(By.linkText("SIGN-OFF")).click();
}
}
