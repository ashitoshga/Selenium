package TestNG;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sagar_NewTest {
	
	WebDriver web;
	String url = "https://www.makemytrip.com/";
	String fcity = "pune";
	String tcity = "sangli";
	String mail_id = "sachin@gmail.com";
	String title = "bus tickets";
	static File exdata = new File("F:\\KDF01.xls");
		
@Test(dataProvider="Exceldata")
public void testSteps(String TC_ID, String Step_No, String TC_Name, String Execute, String TestStepsDescripiton, String Keyword, String Input1, String Input2 )
	{
	
	if(Input2.equalsIgnoreCase("url")){
		Input2 = url;
	}
	if(Input2.equalsIgnoreCase("fcity")){
		Input2 = fcity;
	}
	if(Input2.equalsIgnoreCase("tcity")){
		Input2 = tcity;
	}
	if(Input2.equalsIgnoreCase("mail_id")){
		Input2 = mail_id;
	}
	if(Input2.equalsIgnoreCase("title")){
		Input2 = title;
	}
	
	Sagar_NewLib mmt = new Sagar_NewLib();
	if(Execute.equalsIgnoreCase("Y"))
	{
		
		if(Keyword.equalsIgnoreCase("launch_application"))
		web = mmt.launch_application(web, Input2);
		
		if(Keyword.equalsIgnoreCase("click_button"))
		mmt.click_button(web, Input1);
		
		if(Keyword.equalsIgnoreCase("wait_manage"))
		mmt.wait_manage(web);
		
		if(Keyword.equalsIgnoreCase("type_textbox"))
		mmt.type_textbox(web,Input1 ,Input2 );
		
		if(Keyword.equalsIgnoreCase("click_button"))
		mmt.click_button(web, Input1);
		
		if(Keyword.equalsIgnoreCase("get_title"))
		mmt.get_title(web,Input2);
	}
	
	}
	
@DataProvider
public static String[][] Exceldata() throws JXLException, IOException{
	
	
	Workbook ts = Workbook.getWorkbook(exdata);
	Sheet sh = (Sheet) ts.getSheet("TestSteps");
	
	Cell Sc = sh.findCell("Tag");
	int StartCol = Sc.getColumn();
	int StartRow = Sc.getRow();
	System.out.println("Start Tag is at= "+StartCol+","+StartRow);
	
	Cell Ec = sh.findCell("Tag",StartCol+1,StartRow+1,100,6400,false);
	int EndCol = Ec.getColumn();
	int EndRow = Ec.getRow();
	System.out.println("End Tag is at= "+EndCol+","+EndRow);

String [][] teststepsData = new String [EndRow - StartRow - 1][EndCol - StartCol - 1];
	System.out.println("Lenght of teststepsData array = "+teststepsData.length);
	
	int r = 0;
	for(int row = StartRow ; row < EndRow ; row++,r++)
	{
		int c = 0;
		for(int col = StartCol ; col < EndCol ; col++,c++)
		{
			
			teststepsData[r][c] = sh.getCell(col, row).getContents();
			
		}
	}
	return teststepsData;	
	}	
	
	
  @Test
  public void f() {
  }
}
