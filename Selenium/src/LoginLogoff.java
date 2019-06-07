import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginLogoff {

	public static void main(String[] args) throws InterruptedException {
		//Scenario- Login then verify and logoff then verify application and close
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()){
			System.out.println("User is logged in");
		}else{
			System.out.println("User is unable logged in");
		}
		//below code is selecting radio buttons for trip type
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		//create Select class to store all values of passenger list in PassengerList object/class
		Select PassengersList = new Select(driver.findElement(By.name("passCount")));
		//Now count all the values using int variable 
		int count = PassengersList.getOptions().size();
		//select one value using three methods by index/visible text/value
		PassengersList.selectByIndex(1);
		//here selecting value 2 using index method
		PassengersList.selectByValue("3");
		//here selecting by value as 3
		PassengersList.selectByVisibleText("4");
		//here selecting value by visible text as 4
		
		//Same for Departing From weblist
		Select DepartingList = new Select(driver.findElement(By.name("fromPort")));
		int count2=DepartingList.getOptions().size();
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
		
		
		
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
				
		if (driver.findElement(By.linkText("SIGN-ON")).isDisplayed())
		{
			System.out.println("user is still logged in");
		}
		else
			System.out.println("user is logged off successfully");
			
		driver.close();		
		
	}

}
