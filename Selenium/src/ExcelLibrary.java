import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ExcelLibrary {
	private static WebDriver driver;
	
	public ExcelLibrary(WebDriver driver) {
		this.driver = driver;
	}
		
		public static void Navigate(String baseurl)
		{
			driver.get(baseurl);
		}
		public static void Login(String UN, String PW)
		{
			driver.findElement(By.name("userName")).sendKeys(UN);
			driver.findElement(By.name("password")).sendKeys(PW);
			driver.findElement(By.name("login")).click();
		}
		
	}


