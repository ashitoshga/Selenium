package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameElements {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.amazon.com/");

//int size = driver.findElements(By.tagName("iframe")).size();
List<WebElement> attlist = driver.findElements(By.tagName("iframe"));
System.out.println("number of iframes are: " + attlist.size());
//int j=attlist.size();
for(int i=0; i<=attlist.size(); i++)
{
    System.out.println(attlist.get(i).getAttribute("name"));
}

	  
	  /*WebElement framelist = (WebElement) driver.findElements(By.name("frame"));
	  
	  framelist.getSize();
	  
	  
	  framelist.getAttribute("name");	  
	  System.out.println("dascasfc" + framelist);*/
	  
  }
}
