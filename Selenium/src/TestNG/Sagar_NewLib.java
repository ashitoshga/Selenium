package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Sagar_NewLib {

		public static WebDriver launch_application(WebDriver web, String url){
			web = new FirefoxDriver();
			web.get(url);
			
			return web;
		}
		
		public static WebDriver wait_manage(WebDriver web){
			web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			return web;
			
		}
		
		public static void type_textbox(WebDriver web, String p, String t){
			
			web.findElement(By.xpath(p)).clear();
			web.findElement(By.xpath(p)).sendKeys(t);
		}
		
		public static void click_button(WebDriver web, String b){
			
			web.findElement(By.xpath(b)).click();
		}
		
		public static void get_title(WebDriver web, String t){
			
			Assert.assertTrue(web.getTitle().contains(t), "Invalid page");
			System.out.println("Page Title- "+t);
			
		}
		
		
	}


