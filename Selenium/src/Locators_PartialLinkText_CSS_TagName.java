import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Locators_PartialLinkText_CSS_TagName {

	public static void main(String[] args) {
		// first linktext method then partial linktext & CSS
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		//here list of all the links is created and stored in the LinkList
		// all the links are find by anchor tag 'a'
		java.util.List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		//list size is calculated
		System.out.println(LinkList.size());
		
		for(int i=0; i<LinkList.size(); i++)
		{
			String Linktext = LinkList.get(i).getText();
			if(Linktext.equalsIgnoreCase("Register Here"))
				{
			LinkList.get(i).click();
			break;
				}
				}
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText(""))
		driver.findElement(By.cssSelector("#u_0_w")).click();
		driver.findElement(By.cssSelector(".fb_logo.img.sp_IIuy94UEXRV.sx_6bf598")).click();
		
		
		
		
		
		
		
		

	}

}
