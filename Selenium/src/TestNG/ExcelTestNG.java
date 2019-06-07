package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelTestNG {
	public static WebDriver driver;
	
  @Test(priority=1)
  public void Sample() {
	  System.out.println("*****TEst starts here...*******");
  }
  @Test(priority=2)
  public void Login() throws IOException, InterruptedException {
	  //driver = new FirefoxDriver();
	  TestNGLibrary obj1 = new TestNGLibrary(driver);
	  Boolean navin = obj1.Prerequisite("http://newtours.demoaut.com/");
	  System.out.println(navin);
	  
	  if(navin)
			  {
		  driver.manage().window().maximize();
		  obj1.Login("admin", "mercury");
		  File file = new File("F:\\INPUTSHEET.xls");
			FileInputStream inputStream = new FileInputStream(file);
			Workbook Workbook = null;
			Workbook = new HSSFWorkbook(inputStream);
			Sheet sht = (Sheet) Workbook.getSheetAt(0);
	  int rowcount = ((org.apache.poi.ss.usermodel.Sheet) sht).getLastRowNum()-((org.apache.poi.ss.usermodel.Sheet) sht).getFirstRowNum();
		for(int i=0; i<rowcount; i++)
		{
			Row row = ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(i);
			String baseurl = row.getCell(i).getStringCellValue();
			for(int j=0; j<i; j++)
			{
				String DepartingFrom = ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(1).getCell(4).getStringCellValue();
				driver.findElement(By.name("fromPort")).sendKeys(DepartingFrom);
				System.out.println(DepartingFrom);
				
				String OnMonth = ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(1).getCell(5).getStringCellValue();
				driver.findElement(By.name("fromMonth")).sendKeys(OnMonth);
				
				int OnDate = (int) ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(1).getCell(6).getNumericCellValue();
				driver.findElement(By.name("fromDay")).getText().indexOf(OnDate);
				String ArrivingIn = ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(1).getCell(7).getStringCellValue();
				driver.findElement(By.name("toPort")).sendKeys(ArrivingIn);
				
				String ReturningMonth = ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(1).getCell(8).getStringCellValue();
				driver.findElement(By.name("toMonth")).sendKeys(ReturningMonth);
				
				String ReturningDate = ((org.apache.poi.ss.usermodel.Sheet) sht).getRow(1).getCell(9).getStringCellValue();
				driver.findElement(By.name("toDay")).sendKeys(ReturningDate);
			}
		}
		//return navin;
  }
	  else{
			System.out.println("Test failed to RUN");
		driver.close();
}
	
  }

}
