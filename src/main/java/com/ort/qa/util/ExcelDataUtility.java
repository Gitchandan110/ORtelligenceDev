/*	Created by Piyush Sadawarti on 25/05/2021
 * 	Modified by Piyush Sadawarti on 26/05/2021 - Removed commented method for Numeric cell data.
 *  Modified by Piyush Sadawarti on 26/05/2021 - Added methods @ testDataString, testDataNumeric 
 *  Modified by Piyush Sadawarti on 27/05/2021 - Wb path moved outside methods. Redefined 
 *  Modified by Piyush Sadawarti on 27/05/2021 - Redefined getRowCount() , getColCount() methods.
 *   
 *   
 *   
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
//	Excel Workbook Path
	public static String excelPath = "E:\\BitBucket\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\ort_excel.xlsx";
	
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
/*		getRowCount();
 *		getColCount();
 *		getCellDataString();
 *		getCellDataNumber();
 *			
 *			
 */		
	}	
		

//	Get cell data - String
	public static String getCellDataString(int rowNum, int colNum)
	{
//		Initialization String cellData.
		String cellData = null;
		try
		{
//			Declare String cellData.
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//			System.out.println("Cell data is: "+ cellData);
		}
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
		
//	Get cell data - Number
	public static int getCellDataNumber(int rowNum, int colNum)
	{
//		Initialization int cellData.
		int cellData = 0;
		try
		{
//			Declare int cellData
			cellData = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		}
//		handle exceptions
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	
/*	Method testDataString
 * 	Parameters @ String sheetName, int i, int j
 * 	return data
*/	
	public static String testDataString(String sheetName, int i, int j)
	{
		
//		ExcelDataUtility page object - excel, declaration to method.
		ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
//		String data - storing cell value.
//		String data = excel.getCellDataString(i,j);
//		return data;
		
		String data = null;
		try
		{
//			Declare String cellData.
			data = excel.getCellDataString(i,j);
			System.out.println("Cell data is: "+ data);
		}
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return data;
	}
//	}
		
/*	Method testDataString
 * 	Parameters @ String sheetName, int i, int j
 * 	return data
 */	
	public static String testDataNumeric(String sheetName, int i, int j)
	{
		
//		ExcelDataUtility page object - excel, declaration to method.		
		ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
//		String data - storing cell value.		
		String data = String.valueOf(excel.getCellDataNumber(i,j));
		return data;
	}
	
//	Get row count
	public static int getRowCount(String sheetName)
	{
		ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
		sheet = wb.getSheet(sheetName);
		{
			int data = 0;
			try
			{
				data = sheet.getPhysicalNumberOfRows();
				System.out.println("Total no of rows: "+data);
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return data;
		}
	}
	
//	Get column count
	public static int getColCount(String sheetName)
	{
		ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
		sheet = wb.getSheet(sheetName);
		{
			int data = 0;
			try
			{
				data = sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println("Total no of columns: "+data);
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return data;
		}
	}
	
}
	
// .........................................................................
///* Created by Piyush Sadawarti on 24/05/2021
// *  
// * 
// * 
// * 
// */
//package com.ort.qa.util;
//
//public class ExcelDataProvider 
//{
//	public static void main(String[] args)
//	{
//		String excelPath = "D:\\BITBUCKET\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\ort_excel.xlsx";
//		testDataString(excelPath, "SearchPatient");
//		
//	}
////	Get cell data
//	public static void testDataString(String excelPath, String sheetName)
//	{
//		ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
//		int rowCount = excel.getRowCount();
//		int colCount = excel.getColCount();
//		
////		Get data in object array. Use of loop.
////		String cellData = excel.getCellDataString(1,0);
////		System.out.println("Cell Data is: "+cellData);
//		for (int i = 1; i < rowCount; i++)
//		{
//			for (int j = 0; j < colCount; j++)
//			{
//				String cellData = excel.getCellDataString(i, j);
//				System.out.println("Cell Data is: "+cellData);
//			}
//		}
//		
//	}
//
//	
//	
//	
//	
//}

