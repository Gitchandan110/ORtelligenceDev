/*	Created by Piyush Sadawarti on 25/05/2021
 * 	Modified by Piyush Sadawarti on 26/05/2021 - Removed commented method for Numeric cell data.
 *  Modified by Piyush Sadawarti on 26/05/2021 - Added methods @ testDataString, testDataNumeric 
 *  
 */	

package com.ort.qa.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataUtility 
{
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public ExcelDataUtility(String excelPath, String sheetName)
	{
		try 
		{
			wb = new XSSFWorkbook(excelPath);
			sheet = wb.getSheet(sheetName);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args)
	{
//		getRowCount();
//		getColCount();
//		getCellDataString();
//		getCellDataNumber();
	}	
		
//	Get row count
	public static int getRowCount()
		{
			int rowCount = 0;
			try
			{
				rowCount = sheet.getPhysicalNumberOfRows();
//				System.out.println("No of rows: "+rowCount);
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return rowCount;
		}
		
//	Get column count
		public static int getColCount()
		{
			int colCount = 0;
			try
			{
				colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//				System.out.println("No of columns: "+colCount);
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return colCount;
		}
		
//		Get cell data - String
		public static String getCellDataString(int rowNum, int colNum)
		{
//			Initialization String cellData.
			String cellData = null;
			try
			{
//				Declare String cellData.
				cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//				System.out.println("Cell data is: "+ cellData);
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return cellData;
		}
		
//		Get cell data - Number
		public static int getCellDataNumber(int rowNum, int colNum)
		{
//			Initialization int cellData.
			int cellData = 0;
			try
			{
//				Declare int cellData
				cellData = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			}
//			handle exceptions
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return cellData;
		}
		
/*		Method testDataString
 * 		Parameters @ String sheetName, int i, int j
 * 		return data
*/	
		public static String testDataString(String sheetName, int i, int j)
		{
//			Excel Workbook Path
			String excelPath = "D:\\BITBUCKET\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\ort_excel.xlsx";
//			ExcelDataUtility page object - excel, declaration to method.
			ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
//			For future use:
//			int rowCount = excel.getRowCount();
//			int colCount = excel.getColCount();

//			String data - storing cell value.
			String data = excel.getCellDataString(i,j);
			return data;
		}
		
/*		Method testDataString
 * 		Parameters @ String sheetName, int i, int j
 * 		return data
 */	
		public static String testDataNumeric(String sheetName, int i, int j)
		{
//			Excel Workbook Path
			String excelPath = "D:\\BITBUCKET\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\ort_excel.xlsx";
//			ExcelDataUtility page object - excel, declaration to method.		
			ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
//			For future use:		
//			int rowCount = excel.getRowCount();
//			int colCount = excel.getColCount();
			
//			String data - storing cell value.		
			String data = String.valueOf(excel.getCellDataNumber(i,j));
			return data;
		}
	
}
	

