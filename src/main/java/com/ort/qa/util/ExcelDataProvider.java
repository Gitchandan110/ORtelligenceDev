/* Created by Piyush Sadawarti on 24/05/2021
 *  
 * 
 * 
 * 
 */
package com.ort.qa.util;

public class ExcelDataProvider 
{
	public static void main(String[] args)
	{
		String excelPath = "D:\\BITBUCKET\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\ort_excel.xlsx";
		testDataString(excelPath, "SearchPatient");
		
	}
//	Get cell data
	public static void testDataString(String excelPath, String sheetName)
	{
		ExcelDataUtility excel = new ExcelDataUtility(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
//		Get data in object array. Use of loop.
//		String cellData = excel.getCellDataString(1,0);
//		System.out.println("Cell Data is: "+cellData);
		for (int i = 1; i < rowCount; i++)
		{
			for (int j = 0; j < colCount; j++)
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.println("Cell Data is: "+cellData);
			}
		}
		
	}

	
	
	
	
}
