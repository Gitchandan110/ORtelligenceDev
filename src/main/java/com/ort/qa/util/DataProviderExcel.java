package com.ort.qa.util;



import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.ort.qa.base.TestBase;



    public class DataProviderExcel extends TestBase  {
        

        static XSSFWorkbook excelWorkbook = null;
        static XSSFSheet excelSheet = null;
        static XSSFRow row = null;
        static XSSFCell cell = null;
        
        /* public Method m;
         */
        
        @DataProvider(name="NurseData")
        public static  Object [][] LoginNurse () throws IOException, NoSuchMethodException, SecurityException{
            
            Object[][] data = null;
            
            /* if(m.getName().equalsIgnoreCase("loginWithValidTest")
             * {
             */
   
                    
                data= getData(System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\ort_excel.xlsx","NurseData"); 
                
                return data;
                /*   }
          * return data;
            */
        }   
        
        @DataProvider(name="surgeonData")
        public static  Object [][] LoginSurgeon () throws IOException, NoSuchMethodException, SecurityException{
            
            Object[][] data = null;
            
            /*  if(m.getName().equalsIgnoreCase("loginWithValidTest"))
             *    {
             */
           
                    
                data= getData(System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\ort_excel.xlsx","SurgeonData"); 
                
                return data;
                /*    }
                 *  return data;
                 */
           
        }   
        
        @DataProvider(name="PatientData")
        public   Object [][] findPatientData () throws IOException, NoSuchMethodException, SecurityException{
            
            Object[][] data = null;
            
            /*   if(m.getName().equalsIgnoreCase("loginWithValidTest"))
             * {
             */
            
                    
                data= getData(System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\ort_excel.xlsx","PatientData"); 
                
                return data;
                /*  }
            *return data;
            */
        }   
        
        /*supplying data for a test method.
         */
        public static  Object[][] getData(String FilePath,String SheetName) throws IOException 
        {
            FileInputStream fis = new FileInputStream(FilePath); // Your .xlsx file name along with path
            excelWorkbook = new XSSFWorkbook(fis);
            /* Read sheet inside the workbook by its name
             */
            excelSheet = excelWorkbook.getSheet(SheetName); //Your sheet name
            /* Find number of rows in excel file
             */
            
            int rowCount = excelSheet.getLastRowNum() - excelSheet.getFirstRowNum()+1;
            int colCount = excelSheet.getRow(0).getLastCellNum();
            
            System.out.println(rowCount);
            System.out.println(colCount);
            
            Object data[][] = new Object[rowCount-1][colCount];
            for (int rNum = 5; rNum <= rowCount; rNum++) 
            {
                for (int cNum = 0; cNum < colCount; cNum++) 
                {
                	/* int index = excelWorkbook.getSheetIndex(SheetName);
                	 *  excelSheet = excelWorkbook.getSheetAt(index);
                	 */
                
                    row = excelSheet.getRow(rNum - 1);
                    
                    cell = row.getCell(cNum);
                    data[rNum - 5][cNum] = cell.getStringCellValue(); //Your sheet name?
                }
                System.out.println();
            }
            return data;
        }
        /* Function will always used as below. It returns the data from a cell - No need to make any changes
         */
    }
        
        




