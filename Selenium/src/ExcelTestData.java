import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class ExcelTestData {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("F:\\INPUTSHEET.xls");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = null;
		Workbook = new HSSFWorkbook(inputStream);
		org.apache.poi.ss.usermodel.Sheet sht = Workbook.getSheetAt(0);
		System.out.println(Workbook.getSheetAt(0).getSheetName());
		
		int rowCount = sht.getLastRowNum()-sht.getFirstRowNum();
		//System.out.println(rowCount);

		String baseurl = sht.getRow(1).getCell(0).getStringCellValue();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(baseurl);
		
		String UN = sht.getRow(1).getCell(1).getStringCellValue();
		String PW = sht.getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.name("userName")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PW);
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		int Passangers = (int) sht.getRow(1).getCell(3).getNumericCellValue();
		driver.findElement(By.name("passCount")).getText().indexOf(Passangers);
		System.out.println(Passangers);
				
		String DepartingFrom = sht.getRow(1).getCell(4).getStringCellValue();
		driver.findElement(By.name("fromPort")).sendKeys(DepartingFrom);
		System.out.println(DepartingFrom);
		
		String OnMonth = sht.getRow(1).getCell(5).getStringCellValue();
		driver.findElement(By.name("fromMonth")).sendKeys(OnMonth);
		
		int OnDate = (int) sht.getRow(1).getCell(6).getNumericCellValue();
		driver.findElement(By.name("fromDay")).getText().indexOf(OnDate);
		String ArrivingIn = sht.getRow(1).getCell(7).getStringCellValue();
		driver.findElement(By.name("toPort")).sendKeys(ArrivingIn);
		
		String ReturningMonth = sht.getRow(1).getCell(8).getStringCellValue();
		driver.findElement(By.name("toMonth")).sendKeys(ReturningMonth);
		
		String ReturningDate = sht.getRow(1).getCell(9).getStringCellValue();
		driver.findElement(By.name("toDay")).sendKeys(ReturningDate);
		
		
		
		
		
		
	
		
	}		

}
