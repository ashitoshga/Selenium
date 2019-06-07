import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Library2 {
	private static WebDriver driver;
	public Library2(WebDriver driver) {
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
	
	public static void FlightDetails(int passangers, String DepartingFrom, String On, int OnDate, String ArrivingIn, String Returning, int ReturningDate) throws InterruptedException 
	{
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		Select PassengersList =  new Select(driver.findElement(By.name("passCount")));
		for(int i=1; i<passangers; i++){
			if(passangers==1){
				PassengersList.selectByIndex(0);				
			}
			else if (passangers==2){
				PassengersList.selectByIndex(1);
			}
			else if(passangers==3)
			{
				PassengersList.selectByIndex(2);
			}
			else if(passangers==4)
			{
				PassengersList.selectByIndex(3);
			}	
		}		
				
		Select DepartingList = new Select(driver.findElement(By.name("fromPort")));
		int count1 = DepartingList.getOptions().size();
		for(int i=1; i<count1; i++)
		{
			if(DepartingFrom=="Acapulco")
			{
				DepartingList.selectByValue("Acapulco");
			}else if(DepartingFrom=="Frankfurt")
			{
				DepartingList.selectByValue("Frankfurt");	
			}
			if(DepartingFrom=="London")
			{
				DepartingList.selectByValue("London");
			}else if(DepartingFrom=="New York")
			{
				DepartingList.selectByValue("New York");
			}
			if(DepartingFrom=="Paris")
			{
				DepartingList.selectByValue("Paris");
			}else if(DepartingFrom=="Portland")
			{
				DepartingList.selectByValue("Portland");
			}
			if(DepartingFrom=="San Francisco")
			{
				DepartingList.selectByValue("San Francisco");
			}else if(DepartingFrom=="Seattle")
			{
				DepartingList.selectByValue("Seattle");
			}
			if(DepartingFrom=="Sydney")
			{
				DepartingList.selectByValue("Sydney");
			}else if(DepartingFrom=="Zurich")
			{
				DepartingList.selectByValue("Zurich");
			}
		    }
		

		Select OnList = new Select(driver.findElement(By.name("fromMonth")));
		//OnList.selectByValue("12");
		
		Select FromDay = new Select(driver.findElement(By.name("fromDay")));
		//FromDay.selectByVisibleText("12");
		
		Select ArrivingIn1 = new Select(driver.findElement(By.name("toPort")));
		//ArrivingIn.selectByVisibleText("New York");
		
		Select ToMonth = new Select(driver.findElement(By.name("toMonth")));
		//ToMonth.selectByVisibleText("December");
		
		Select ToDay = new Select(driver.findElement(By.name("toDay")));
		//ToDay.selectByVisibleText("12");
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		Thread.sleep(5000);
		
		//Select AirlineList2 = new Select(driver.findElement(By.name("airline")));
		//AirlineList2.selectByIndex(3);
	
	
	}
	
	
	
	public static void Logoff()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();
	}
	}


