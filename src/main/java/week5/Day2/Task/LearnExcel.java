package week5.Day2.Task;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public String[][] learnExcel(String filename) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wB = new XSSFWorkbook("./data/"+filename+".xlsx");
		//open sheet
		XSSFSheet sheet = wB.getSheet("Sheet1");
		//last used row count 
		int rowCount = sheet.getLastRowNum();
		//last used Column Count 
		int ColumnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][ColumnCount];
		//for rows
		for (int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			//for Column
			for ( int j=0;j<ColumnCount;j++) {
				//go to cell 
				XSSFCell cell = row.getCell(j);
				//read data from cell in string type 
				data[i-1][j] = cell.getStringCellValue();
				
			}
		}
		return data;
	}

}
