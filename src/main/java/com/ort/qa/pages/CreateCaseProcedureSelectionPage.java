package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.RepositoryPages;

public class CreateCaseProcedureSelectionPage extends RepositoryPages {
	
	
		 	
		 /*	Actions:
	 *	Select 1st Procedure
		- */
			
		 	public CreateCaseProcedureSelectionPage() 
			{
				PageFactory.initElements(driver, this);
			}
			
		 	
		    //Select the 27245 procedure
			public void  createCaseProcedureSelection() 
			{
				selectProceduree.click();
						
			}
			
			//Click on back button
			public void createCaseProcedureSelectionBack() 
			{
			back.click();
						
			}
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		
		

}
