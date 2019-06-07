package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CashKaro {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		Thread.sleep(5000);
		int b = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frames in the webpage are: " + b);
		List<WebElement> framelist = driver.findElements(By.tagName("iframe"));
		for(int j=0; j<b; j++) 
		{
			System.out.println("frame names are: " + framelist.get(j).getAttribute("name"));
		}
		driver.findElement(By.linkText("")).click();
		driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div/nav/ul/li[3]/a")).click();
		Thread.sleep(5000);
		//String test = driver.getPageSource();
		//System.out.println(test);
		/*Thread.sleep(20000);
		int c = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frames in the webpage are: " + c);
		List<WebElement> framelist1 = driver.findElements(By.tagName("iframe"));
		for(int j=0; j<c; j++) 
		{
			System.out.println("frame names are: " + framelist1.get(j).getAttribute("name"));
		}*/
		//driver.switchTo().frame("google_conversion_frame");
		//List<WebElement> parentframe = driver.findElements(By.tagName("iframe"));
		//driver.switchTo().frame(driver.findElements(parentframe.equals("https://cashkaro.com/signin_small_popup.php?page=http://cashkaro.com/&curpage=http://cashkaro.com/")));
		
		/*driver.findElement(By.xpath(".//*[@id='uname']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("123456");
		//driver.findElement(By.name("uname")).sendKeys("abc@abc.com");
		driver.findElement(By.name("pwd")).sendKeys("123456");*/
		for(int j=0; j<b; j++)
		{
			if(driver.findElement(By.name("uname")).isDisplayed())
			{
				driver.switchTo().frame(0);
				}
			else{
				driver.switchTo().frame(1);				
			}
			
			
			
		}
		
		
		driver.findElement(By.name("uname")).sendKeys("abc@abc.com");
		
		
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.cashkaro.com/");
		Thread.sleep(10000);
	}

	@AfterTest
	public void afterTest() {
	}

}
