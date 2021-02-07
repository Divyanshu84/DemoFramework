package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	XSSFWorkbook wb;
	public ExcelDataReader() {
		
		
		File src =new File("./TestData/Data.xlsx");
		try
		{
			FileInputStream fin=new FileInputStream(src);
			 wb=new XSSFWorkbook(fin);
		}
		
		catch(Exception e)
		
		{
			
			System.out.println(e.getMessage());
		}
	}

	
	public String getStringData(String sheetName, int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	
}
