import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cashkaro.com/");
		int a = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frames are: " + a);
		
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		for(int i=0; i<a; i++)
		{
			System.out.println("Frames name are: " + ele.get(i).getAttribute("name"));
		}
		

	}

}
