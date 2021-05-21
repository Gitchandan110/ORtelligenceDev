package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseAffectedAreaPage extends TestBase
{

 /*	x path for Hip.
 */
	
   @FindBy(xpath="//area[@id='trauma22']")
public WebElement hip;
   
 /* x path for Femur.
 */

   @FindBy(xpath="//area[@id='trauma24']")
   WebElement femur;
	
	   
 /* x path for Distal Femur.
 */
	
	@FindBy(xpath="//area[@id='trauma24']")
	WebElement distalFemur ;
	
 /*for Trauma area x path for Patella.
 */

    @FindBy(xpath="//area[@id='trauma28']")
	public WebElement patella;
	   
	
 /* x path for Proximal Tibia
 */
	
	@FindBy(xpath="//area[@id='trauma30']")
	WebElement proximalTibia;
	
 /* x path for Tibia
 */
	
	@FindBy(xpath="//area[@id='trauma30']")
	WebElement tibia ;
	
 /* x path for Distal Tibia 
 */
	 
	@FindBy(xpath="//area[@id='trauma34']")
	WebElement distalTibia ;
	
 /* x path for Ankle 
 */

	@FindBy(xpath="//area[@id='trauma36']")
	WebElement ankle;
	
 /* x path for Foot 
 */

	@FindBy(xpath="//area[@id='trauma38']")
	WebElement foot ;
	
 /*	x path for HipLeft.
 */
		
	@FindBy(xpath="//area[@id='trauma21']")
	public WebElement hipLeft;
	   
 /*	x path for FemurLeft.
 */
		
	@FindBy(xpath="//area[@id='trauma23']")
	WebElement femurLeft ;
		
 /* x path for PatellaLeft.
 */

   @FindBy(xpath="//area[@id='trauma27']")
   public WebElement patellaLeft;
   
 /* x path for ProximalTibiaLeft.
 */
	
   @FindBy(xpath="//area[@id='trauma29']")
   public WebElement proximalTibiaLeft;
	   
 /* x path for TibiaLeft
 */
   	
   	@FindBy(xpath="//area[@id='trauma31']")
   	WebElement tibiaLeft ;
   	
 /* x path for DistalTibiaLeft 
 */
   		 
   	@FindBy(xpath="//area[@id='trauma33']")
   	WebElement distalTibiaLeft ;
   		
 /* x path for AnkleLeft 
 */

   	@FindBy(xpath="//area[@id='trauma35']")
   	WebElement ankleLeft;
   		
	
 /* x path for FootLEFT 
 */

	@FindBy(xpath="//area[@id='trauma37']")
	WebElement footLeft ;
	
 /* x path for Right hand
 * Proximal Humerus 
 */

	@FindBy(xpath="//area[@id='trauma4']")
	WebElement proximalHumerus ;
	
 /* x path for HumerusRight
 */

	@FindBy(xpath="//area[@id='trauma6']")
	WebElement humerusRight ;	
	
 /* x path for Distal HumerusRight.
 */
		
	@FindBy(xpath="//area[@id='trauma8']")
	WebElement distalHumerusRight ;	
	
 /* x path for ProximalForeramRight.
 */
			
   @FindBy(xpath="//area[@id='trauma10']")
   WebElement proximalForeramRight ;	
		
 /* x path for ForeramRight.
 */
   			
    @FindBy(xpath="//area[@id='trauma12']")
    WebElement foreramRight ;	
    
 /* x path for WristRight.
 */
       			
    @FindBy(xpath="//area[@id='trauma14']")
    WebElement wristRight ;	   		
	
 /* x path for Left Hand
 * Proximal Humerus 
 */  
    
    @FindBy(xpath="//area[@id='trauma3']")
	WebElement proximalHumerusLeft ;  
    
 /* x path for HumerusLeft
 */

   @FindBy(xpath="//area[@id='trauma5']")
   WebElement humerusLeft ;
   
 /* x path for Distal Humerusleft.
 */
   		
   @FindBy(xpath="//area[@id='trauma7']")
   WebElement distalHumerusLeft ;	
   
 /* x path for ProximalForeramLeft.
 */
   			
   @FindBy(xpath="//area[@id='trauma9']")
   WebElement proximalForeramLeft ;
   
 /* x path for ForeramLeft.
 */
      			
   @FindBy(xpath="//area[@id='trauma11']")
   WebElement foreramLeft ;	
          
  /* x path for WristLeft.
  */
          			
   @FindBy(xpath="//area[@id='trauma13']")
   WebElement wristLeft ;	      	    
////	Distal Femur
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Patella
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Proximal Tibia
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Tibia
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Distal Tibia 
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Ankle
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Foot
//	@FindBy(xpath="")
//	WebElement ;
//
////	Speciality =  Arthroplasty .................................................................................
//	
////	Shoulder
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Elbow
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Hand
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Hip
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Knee
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Ankle
//	@FindBy(xpath="")
//	WebElement ;
//	
//	
//	
////	Speciality = Spine .................................................................................
////	Cervical
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Thoracic
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Lumbar
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Occiput
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Sacrum
//	@FindBy(xpath="")
//	WebElement ;
//	
//
//	
////	Speciality = Sports .................................................................................
////	Shoulder
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Humerus
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Elbow
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Forearm
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Wrist/Hand
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Hip
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Femur
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Knee
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Tibia
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Ankle
//	@FindBy(xpath="")
//	WebElement ;
//	
////	Foot
//	@FindBy(xpath="")
//	WebElement ;
//	
////	...........................................................................................................
////	Back
//	@FindBy(xpath="")
////	WebElement ;	
	
	
	
	public CreateCaseAffectedAreaPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public void Clickonheap()
	{
		hip.click();
	}
}
