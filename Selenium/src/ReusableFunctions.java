import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ReusableFunctions {
	
public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {
		//This is lib for login, flight details and logoff test
		LoginTest();
		LogOffTest();
		FlightDetails();
		
	}
	
	public static void LoginTest()
	{
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseurl = "http://newtours.demoaut.com";
		
		driver.get(baseurl);
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();		
		}
	public static void LogOffTest()
	{
		//ReusableFunctions driverobj1 = new ReusableFunctions();
		//driverobj1.LoginTest();
		//LoginTest driverobj = new LoginTest();
		
		//WebDriver driver = new FirefoxDriver();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
	}
	public static void FlightDetails() throws InterruptedException
	{
		//WebDriver driver = new FirefoxDriver();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		
		Select PassengersList = new Select(driver.findElement(By.name("passCount")));
		PassengersList.selectByIndex(1);
		
		Select DepartingList = new Select(driver.findElement(By.name("fromPort")));
		DepartingList.selectByValue("Frankfurt");
		
		Select OnList = new Select(driver.findElement(By.name("fromMonth")));
		OnList.selectByValue("12");
		
		Select FromDay = new Select(driver.findElement(By.name("fromDay")));
		FromDay.selectByVisibleText("12");
		
		Select ArrivingIn = new Select(driver.findElement(By.name("toPort")));
		ArrivingIn.selectByVisibleText("New York");
		
		Select ToMonth = new Select(driver.findElement(By.name("toMonth")));
		ToMonth.selectByVisibleText("December");
		
		Select ToDay = new Select(driver.findElement(By.name("toDay")));
		ToDay.selectByVisibleText("12");
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		Thread.sleep(5000);
		
		Select AirlineList = new Select(driver.findElement(By.name("airline")));
		AirlineList.selectByIndex(3);
		
		driver.findElement(By.name("findFlights")).click();
	}
}
