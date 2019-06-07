	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestScript1 {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Library2 lib = new Library2(driver);
		lib.Navigate("http://newtours.demoaut.com/");
		lib.Login("admin", "mercury");
		lib.FlightDetails(2, "Zurich", "April", 24, "New York", "April", 24);
		lib.Logoff();	
		

	}

}
