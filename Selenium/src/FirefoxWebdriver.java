import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxWebdriver {

	public static void main(String[] args) {
		// Scenario: First navigate to newtours
		//Second capture title
		//Third compare with actual title
		
		
		//first create object for firefox
		WebDriver driver = new FirefoxDriver();
			
		String baseurl = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		//three string variables used to store baseurl, title, actual
		
		
		driver.get(baseurl);
		// to navigate to base url
		
		actualTitle=driver.getTitle();
		//to store title value into actualTitle variable
		
		if(actualTitle.contentEquals(expectedTitle))//to compare actual & expected title
		{
			System.out.println("test is passed");
		}
		else
			System.out.println("test is failed");
				
	}

}
