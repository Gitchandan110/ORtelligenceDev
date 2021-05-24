/* Modified by Piyush Sadawarti on 24/05/2021
 * 
 * 
 * 
 * 
 * 
 * */

package com.ort.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import com.ort.qa.base.TestBase;

public class ExcelUtility extends TestBase
{
	
	public static String  TESTDATA_SHEET_PATH="E:\\BitBucket\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\ort excel.xls";
	static Workbook book;
	static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		/*System.out.println(sheet.getLastRowNum() + "--------" +
		 * sheet.getRow(0).getLastCellNum());
		 */
	
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				/*System.out.println(data[i][k]);
			
				 */
			}
		}
		return data;
	}
	
//	Data provider added by Piyush Sadawarti on 24/05/2021:
	public void dataProvider(String sheetPath, String sheetName, int row, int cell) throws IOException
	{
		File source = new File(sheetPath); 
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(row).getCell(cell).getStringCellValue();
		return;
	}
	


}	

	
	
	
	
	
	
	


