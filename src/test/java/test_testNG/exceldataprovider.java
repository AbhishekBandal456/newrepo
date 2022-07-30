package test_testNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {

public static String readexeldata(String sheetname,int row,int cell ) throws Exception {
		
		String path ="C:\\Users\\HP\\eclipse-workspace\\batch_11_project2\\test data\\dataexcel.xlsx";
		FileInputStream file=new FileInputStream( path);
		XSSFWorkbook wb = new XSSFWorkbook( file);
	
	String data=wb.getSheet(sheetname ).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
}
