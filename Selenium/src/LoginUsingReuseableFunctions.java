import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginUsingReuseableFunctions {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//calling method from another class
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
			
		/*ReusableFunctions R = new ReusableFunctions();
		R.LoginTest();
		R.FlightDetails();
		R.LogOffTest();
		*/
		
		LibraryFunctions L = new LibraryFunctions();
		L.Navigate("http://newtours.demoaut.com");
		L.Login("admin", "mercury");
		if(driver.findElement(By.linkText("SIGN-ON")).isDisplayed())
		{
			System.out.println("Correct Login is Verified ");
		}
		else{
			System.out.println("Login is Not Verified");
		}
	
		L.Logoff();
		if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed())
		{
			System.out.println("Correct Logoff is Verified ");
		}
		else
		{
			System.out.println("Correct Logoff is not Verified ");
		}
		
		}

		}
