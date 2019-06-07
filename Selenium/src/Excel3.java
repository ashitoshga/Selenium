import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class Excel3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\INPUTSHEET.xls");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = null;
		Workbook= new HSSFWorkbook(inputStream);
		Sheet sht = (Sheet) Workbook.getSheetAt(0);
		
		int rowCount = ((org.apache.poi.ss.usermodel.Sheet) sht).getLastRowNum()-((org.apache.poi.ss.usermodel.Sheet) sht).getFirstRowNum();
		System.out.println(rowCount);
		

	}

}
