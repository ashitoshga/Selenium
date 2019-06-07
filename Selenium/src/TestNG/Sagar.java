package TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sagar {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver az = new FirefoxDriver();
		
		az.get("http://www.amazon.in");
		
		az.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Actions category = new Actions(az);
		WebElement all = az.findElement(By.xpath(".//a[@id='nav-link-shopall']/span[1]"));
		category.moveToElement(all).perform();
		WebElement mobiles = az.findElement(By.xpath(".//span[@aria-label='Mobiles & Tablets']"));
		category.moveToElement(mobiles).perform();
		az.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/div[5]/div[1]/div[1]/a[3]")).click();
		Thread.sleep(5000);
		az.findElement(By.xpath("//img[@alt='Sony']")).click();
		az.findElement(By.xpath("//li[@id='result_0']/div/div/div/div/a")).click();
		String prevwindow = az.getWindowHandle();
		//az.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
	//handling windows
		
		Set<String> windowID = az.getWindowHandles();
		Iterator itr = windowID.iterator();
		
		while(itr.hasNext()){
			String purchwindow = itr.next().toString();
		
		if(!prevwindow.equals(purchwindow))
		{
			az.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			az.switchTo().window(purchwindow);
			
			az.findElement(By.xpath("//input[@id='buy-now-button']")).click();
			
		}
	  
	  
  }
}
}