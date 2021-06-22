package com.ort.qa.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.ort.qa.base.TestBase;

public class DataProviderExcel extends TestBase {

	static XSSFWorkbook excelWorkbook = null;
	static XSSFSheet excelSheet = null;
	static XSSFRow row = null;
	static XSSFCell cell = null;

	
	@DataProvider(name = "NurseData")
	public static Object[][] loginNurse() throws IOException,  SecurityException {

		Object[][] data = null;
    	data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx", "NurseData");
		System.out.println(data);
		return data;
	
	}

	@DataProvider(name = "LoginUsers")
	public static Object[][] loginSurgeon() throws IOException,  SecurityException {

		Object[][] data = null;
		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"LoginUsers");

		return data;
		
	}
	@DataProvider(name = "SearchCaseFlow")
	public static Object[][] searchCases() throws IOException, SecurityException {

		Object[][] data = null;
		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"SearchCaseFlow");

		return data;
		
	}

	@DataProvider(name = "OpenCases")
	public static Object[][] searchCasesflow() throws IOException,  SecurityException {

		Object[][] data = null;
		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"OpenCases");

		return data;
		
	}
	
	

	@DataProvider(name = "PatientData")
	public Object[][] findPatientData() throws IOException,  SecurityException {

		Object[][] data = null;

		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"PatientData");

		return data;
		
	}
	
	@DataProvider(name = "LongFlow")
	public Object[][] findPatientDataLongFlow() throws IOException,  SecurityException {

		Object[][] data = null;

		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"LongFlow");

		return data;
		
	}
	
	@DataProvider(name = "ProcedureSelectionFlow")
	public Object[][] findPatientDataProcedureSelectionFlow() throws IOException,  SecurityException {

		Object[][] data = null;

		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"ProcedureSelectionFlow");

		return data;
		
	}
	
	@DataProvider(name = "PreferenceCardSelectionFlow")
	public Object[][] findPatientPreferenceCardSelectionFlow() throws IOException,  SecurityException {

		Object[][] data = null;

		data = getData(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\ort_excel.xlsx",
				"PreferenceCardSelectionFlow");

		return data;
		
	}
	
	

	/*
	 * Supplying data for a test method.
	 */

	public static Object[][] getData(String filePath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(filePath); // Your .xlsx file name along with path
		excelWorkbook = new XSSFWorkbook(fis);

		/*
		 * Read sheet inside the workbook by its name
		 */

		excelSheet = excelWorkbook.getSheet(sheetName);

		/*
		 * Find number of rows in excel file
		 */

		int rowCount = excelSheet.getLastRowNum() - excelSheet.getFirstRowNum() + 1;
		int colCount = excelSheet.getRow(0).getLastCellNum();
		int rowCheckCount = 1;
		
		for (int rNum = 1; rNum < rowCount; rNum++) {

			for (int cNum = 0; cNum < colCount; cNum++) {

				int index = excelWorkbook.getSheetIndex(sheetName);
				excelSheet = excelWorkbook.getSheetAt(index);

				// row = excelSheet.getRow(rNum - 1);
				row = excelSheet.getRow(rNum);

				cell = row.getCell(cNum);
				cell.setCellType(CellType.STRING);
				if(cell.getStringCellValue().equalsIgnoreCase("Active")) {
					rowCheckCount++;
				}
			}
		}
		
		

		System.out.println(rowCount+"::::::::rowCheckCount::::::"+rowCheckCount);
		System.out.println(colCount);

		Object data[][] = new Object[rowCheckCount - 1][colCount];
		int rowCheckCountRow =0;
		Boolean activeFlag= false;
		for (int rNum = 1; rNum < rowCount; rNum++) {
			activeFlag = false;
			for (int cNum = 0; cNum < colCount; cNum++) {

				int index = excelWorkbook.getSheetIndex(sheetName);
				excelSheet = excelWorkbook.getSheetAt(index);

				// row = excelSheet.getRow(rNum - 1);
				row = excelSheet.getRow(rNum);

				cell = row.getCell(cNum);
				cell.setCellType(CellType.STRING);
				if(cell.getStringCellValue().equalsIgnoreCase("Active")) {
					activeFlag = true;
					rowCheckCountRow++;
				}
				if(activeFlag) {
					System.out.println(rowCheckCountRow+":::Inside::2::>>>>>>>>>>"+cell.getStringCellValue());
					data[rowCheckCountRow - 1][cNum] = cell.getStringCellValue(); // Yoursheet name?
				}
			}
		}
		System.out.println("::::data:::"+data.length);
		return data;

	}

	/* if (cell == null) {
         celldata = " ";
     } else {
         celldata = cell.getStringCellValue();
     }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
