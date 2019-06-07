import java.io.File;
import java.io.IOException;

import jxl.JXLException;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ExcelFunction {

	public static void main(String[] args) throws JXLException, IOException {
		File sKR = new File("F:\\INPUTSHEET.xls"); //assigning variable sKR for File
		System.out.println(sKR.getName());
		
		//Get Workbook- USE only jxl import *******
		@SuppressWarnings("static-access")
		Workbook wbKR = Workbook.getWorkbook(sKR);
		
		wbKR.getSheet(0);
		System.out.println(wbKR.getSheet(0).getName());
		
		//Printing data of particular cell
	/*	System.out.println(wbKR.getSheet(0).getCell(0,1).getContents());  */                         
	//.getcell(column num,row num)
		//store total number of rows and columns
		int c =wbKR.getSheet(0).getColumns();	//Store total count of columns to variable c
		int r =wbKR.getSheet(0).getRows();
		System.out.println("Total Columns= "+c);
		System.out.println("Total Rows= "+r);
		
		//Print data from Excel using nested for loop ***
		for(int i = 0; i<r; i++ ){                                                              //outer loop is for 'Rows'
			for(int j = 0; j<c; j++){                                                           //Inner loop is for 'Columns'
				System.out.print(wbKR.getSheet(0).getCell(j,i).getContents());                  //this will print value of each cell
				System.out.print(" ");                                                        
			}
			System.out.println(" ");
		}
		

	}

}
