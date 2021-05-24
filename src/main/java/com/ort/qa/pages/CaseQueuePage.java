/* Created by Piyush Sadawarti on 24/05/2021
 * 
 * 
 * 
 * */
package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CaseQueuePage extends TestBase
{
//	(multiple Cases, we need to click on the specific Case)
//	Case number 
	@FindBy(xpath="(//a[@class='a-pointer'])[1]")
	WebElement caseNumber;
		
//	Procedure
	@FindBy(xpath="(//a[@class='a-pointer'])[2]")
	WebElement caseProcedure;

//	Surgery Date and Time
	@FindBy(xpath="(//a[@class='a-pointer'])[3]")
	WebElement caseDateTime;
	
//	Surgeon Name 
	@FindBy(xpath="(//a[@class='a-pointer'])[4]")
	WebElement caseSurgeon;
	
//	MNR
	@FindBy(xpath="(//a[@class='a-pointer'])[5]")
	WebElement caseMNR;
	
//	Patient 
	@FindBy(xpath="(//a[@class='a-pointer'])[6]")
	WebElement casePatientName;
	
//	Class 
	@FindBy(xpath="(//a[@class='a-pointer'])[7]")
	WebElement caseClass;
	
//	Scheduled / Un-scheduled 
	@FindBy(xpath="")
	WebElement caseScheduledStatus;
	
//	Status 
	@FindBy(xpath="")
	WebElement caseStatus;
		
//	Actions:
//	Page factory
	public CaseQueuePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CaseQueueCaseInformation(String procedureText,String caseDateTimeText,String caseSurgeonText,String caseMNRText,String casePatientNameText,String caseClassText,String caseScheduledStatusText,String caseStatusText)
	{
		procedureText = caseProcedure.getText();
		System.out.println("Procedure details are: "+procedureText);
		caseDateTimeText = caseDateTime.getText();
		System.out.println("Surgery date and time details are: "+caseDateTimeText);
		caseSurgeonText = caseSurgeon.getText();
		System.out.println(" details are: "+caseSurgeonText);
		caseMNRText = caseMNR.getText();
		System.out.println(" details are: "+caseMNRText);
		casePatientNameText = casePatientName.getText();
		System.out.println(" details are: "+casePatientNameText);
		caseClassText = caseClass.getText();
		System.out.println(" details are: "+caseClassText);
		caseScheduledStatusText = caseScheduledStatus.getText();
		System.out.println(" details are: "+caseScheduledStatusText);
		caseStatusText = caseStatus.getText();
		System.out.println(" details are: "+caseStatusText);
	}

}
