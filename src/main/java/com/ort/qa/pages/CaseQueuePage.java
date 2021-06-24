package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.RepositoryPages;

public class CaseQueuePage extends  RepositoryPages {
	
	
	public CaseQueuePage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	public void checkCaseQueue(String Status, String lastName, String firstName, String MRN, String Speciality) throws InterruptedException
	
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		
		patientMRN.sendKeys(MRN);
		Thread.sleep(2000);
		
		specialitySelection.sendKeys(Speciality);
		Thread.sleep(2000);
	}
}
