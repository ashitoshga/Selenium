package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testlib {
	private static WebDriver driver;
	public testlib(WebDriver driver){
		this.driver = driver;
	}
	public boolean TestMethod(String url) {
		// TODO Auto-generated constructor stub
		//WebDriver driver = new FirefoxDriver();
		//driver = new FirefoxDriver();
		//String base1 = "http://newtours.demoaut.com/";
		driver.get(url);
		String expectedtitle="Welcome: Mercury Tours";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		boolean test;
		if(actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Navigation is Successful!");
			test=true;
			return test;
		}
		else
		{
			System.out.println("Failed");
			//return false;
		}
		return false;
		
	}
	public static boolean Login(String UN, String PW)
	{
		//WebDriver driver = new FirefoxDriver();
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
	public void logOFF()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();
	}
	

}
