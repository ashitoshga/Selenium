import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;


public class Excel4Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\INPUTSHEET.xls");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = null;
		Workbook = new HSSFWorkbook(inputStream);
		org.apache.poi.ss.usermodel.Sheet sht = Workbook.getSheetAt(0);
		System.out.println(Workbook.getSheetAt(0).getSheetName());
		
		int rowCount = sht.getLastRowNum()-sht.getFirstRowNum();
		System.out.println(rowCount);
		
		/*String text = sht.getRow(1).getCell(1).getStringCellValue();
		String text2 = sht.getRow(1).getCell(0).getStringCellValue();
		System.out.println(text);
		System.out.println(text2);*/
		/*String baseurl = sht.getRow(1).getCell(0).getStringCellValue();
		System.out.println(baseurl);*/
		/*String Passangers = sht.getRow(1).getCell(3).getStringCellValue();
		System.out.println(Passangers);*/
		String DepartingFrom = sht.getRow(1).getCell(4).getStringCellValue();
		//driver.findElement(By.name("fromPort")).sendKeys(DepartingFrom);
		System.out.println(DepartingFrom);
		int rowcount = sht.getLastRowNum()-sht.getFirstRowNum();
		Iterator<Row> colcount = sht.rowIterator();
		System.out.println(colcount);
		for(int i=0; i<=rowcount; i++)
		{
			Row row = sht.getRow(i);
			String baseurl = row.getCell(i).getStringCellValue();
			System.out.println(baseurl);
			for(int j=1; j<=10; j++)
			{
			String UN = row.getCell(i).getStringCellValue();
			String PW = row.getCell(i).getStringCellValue();
			System.out.println(UN);
			System.out.println(PW);

			}
			
			
		}
		
		
		
		/*int Passangers = (int) sht.getRow(1).getCell(3).getNumericCellValue();
		//driver.findElement(By.name("passCount")).getText();
		System.out.println(Passangers);
		
		/*for(int i=1;i<=rowCount;i++)
		{
			Row row = sht.getRow(i);
			
				String UN = row.getCell(0).getStringCellValue();
				String PW = row.getCell(1).getStringCellValue();
				System.out.println(UN);
				System.out.println(PW);
				Cell cell = row.createCell(2);
			    cell.setCellValue(UN+" "+PW);
			    Cell cell2 = row.createCell(3);
			    cell2.setCellValue(UN+" "+PW);
			}
		/*inputStream.close();
		//Create an object of FileOutputStream class to create write data in excel file
		FileOutputStream outputStream = new FileOutputStream("F:\\Outputsheet.xls");
		//write data in the excel file
		Workbook.write(outputStream);
		//Close output stream
		outputStream.close();*/
			
		}
		
		
		

	}


