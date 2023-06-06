package week6;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
public static String[][] readExcel(String filename) throws Exception {
	//open workbook and mention path
	XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
	//go the sheet
	XSSFSheet sheet = wb.getSheetAt(0);
	// get row count
	int rowcount = sheet.getLastRowNum();
	System.out.println("No.of rows:"+rowcount);
	//get cloumncount
	int cloumncount = sheet.getRow(0).getLastCellNum();
	System.out.println("No.of columns:"+cloumncount);
	//to get specific data
//	XSSFCell cell = sheet.getRow(1).getCell(0);
//	String firstdata = cell.getStringCellValue();
//	System.out.println(firstdata);
	
	//create 2D array with row count,cloumncount
	String[][] data=new String[rowcount][cloumncount];
	
	// to get all values, use nested loop
	//no need to include header (starts i=1)
	
	
	for(int i=1;i<=rowcount;i++) {
		XSSFRow row = sheet.getRow(i); 
		for(int j=0;j<cloumncount;j++) { 
			String stringCellValue =row.getCell(j).getStringCellValue();
			 System.out.println(stringCellValue); 
			 //assign stringcellvalue to data array
			 data[i-1][j]=stringCellValue;
			 }
		}

wb.close();
return data;
	
}
	
	
}
