package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AjaxObjectDraggable {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://jqueryui.com/draggable/");
	  driver.switchTo().frame(0);
	  //first find frame which contains draggable object by index method
	  
	  WebElement draggable = driver.findElement(By.id("draggable"));
	  //find webelement and store that in variable
	  
	  Actions actions = new Actions(driver);
	  //create actions to drag the element
	  actions.dragAndDropBy(draggable, 300, 0).build().perform();
	  //build.perform is common method need to be used everytime
	  Thread.sleep(10000);
	  driver.close();
	  
  }
  @Test
public static void f2(){
	  WebDriver driver = new FirefoxDriver();
	  WebElement droppable = driver.findElement(By.id("droppable"));
	Actions action = new Actions(driver);  
  }




}



