import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LibraryFunctions {
	
	private static WebDriver driver;
	//driver = new FirefoxDriver();
		
	public static void main(String[] args, WebDriver driver) {
		Login("admin", "mercury");
		Navigate("http://newtours.demoaut.com");
		Logoff();
			}
	public static void Navigate(String baseurl)
	{
		//String baseurl = "http://newtours.demoaut.com";
		driver.get(baseurl);
	}
		
	public static void Login(String UN, String PW)
	{
		driver.findElement(By.name("userName")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PW);
		driver.findElement(By.name("login")).click();
	}
	public static void Logoff()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	

}
