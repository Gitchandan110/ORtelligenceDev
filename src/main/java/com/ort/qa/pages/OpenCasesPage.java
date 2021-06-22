package com.ort.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.RepositoryPages;

public class OpenCasesPage extends RepositoryPages {
	

	
	
	
	public OpenCasesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userOpenCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException
	
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		
		patientMRN.sendKeys(MRN);
		Thread.sleep(2000);
		
		specialitySelection.sendKeys(Speciality);
		Thread.sleep(2000);
		
		caseNumbers.sendKeys(CaseNumber);
		Thread.sleep(2000);
		
		
	}
}
