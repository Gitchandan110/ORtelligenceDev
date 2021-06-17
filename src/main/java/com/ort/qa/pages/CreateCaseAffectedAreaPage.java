package com.ort.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseAffectedAreaPage extends TestBase
{

 /*	x path for Speciality = Trauma.
 * x path for Hip
 */
	
   @FindBy(xpath="//area[@id='trauma22']")
    WebElement hip;
   
   /* x path for Clavicle
    * written by Priyanka
   */ 
   
   @FindBy(xpath="//area[@id='trauma2']")
   public WebElement clavicle;
   
 /* x path for Femur.
 */

   @FindBy(xpath="//area[@id='trauma24']")
   WebElement femur;
	
	   
 /* x path for Distal Femur.
  * both line have same xpath (22 and24)
  * changed xpath: xpath written by Saurabh:  @FindBy(xpath="//area[@id='trauma24']")
  * xpath written by Priyanka:  @FindBy(xpath="//area[@id='trauma26']"
 */
	
	@FindBy(xpath="//area[@id='trauma26']")
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
	
	@FindBy(xpath="//area[@id='trauma32']")
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
   
   
/* x path for Pelvis/AcetabulumRight
*/
    			
   @FindBy(xpath="//area[@id='trauma18']")
   WebElement pelvisAcetabulumRight;	

 /* x path for Pelvis/AcetabulumLeft
 */
       			
   @FindBy(xpath="//area[@id='trauma17']")
   WebElement pelvisAcetabulumLeft;	
  
  /*	x path for Speciality =  Arthroplasty...........................................................................
  * x path for HipRight
  */
   
   @FindBy(xpath="//area[@id='arthroplasty7']")
   public WebElement hipRight;
   
   /* x path for HipRight
    * Added by Priyanka
   */
   
   @FindBy(xpath="//area[@id='arthroplasty6']")
   public WebElement hipLeftArthroplasty;
   /* x path for Knee
   */
   
   @FindBy(xpath="//area[@id='arthroplasty9']")
   public WebElement knee;
   
   /* x path for Ankle
   */
   
   @FindBy(xpath="//area[@id='arthroplasty11']")
   public WebElement ankleRight;
  	 
   /* x path for KneeLeft
   */
   
   @FindBy(xpath="//area[@id='arthroplasty8']")
   public WebElement kneeLeft;
   
   /* x path for AnkleLeft
   */
   
   @FindBy(xpath="//area[@id='arthroplasty10']")
   public WebElement ankleLeftAr;
   
   /* x path for Right hand
   * Shoulder
   */
   
   @FindBy(xpath="//area[@id='arthroplasty1']")
   public WebElement shoulder;
   
   /* x path for Elbow
   */
  	 
   @FindBy(xpath="//area[@id='arthroplasty3']")
   public WebElement elbow;
   
   /* x path for  Hand
   */
   
   @FindBy(xpath="//area[@id='arthroplasty5']")
   public WebElement hand;
   
   /* x path for Left hand
   * Shoulder
   */
   
   @FindBy(xpath="//area[@id='arthroplasty']")
   public WebElement shoulderLeft;
   
   /* x path for ElbowLeft
   */
  	 
   @FindBy(xpath="//area[@id='arthroplasty2']")
   public WebElement elbowLeft;
   
   /* x path for Left Hand
   */
   
   @FindBy(xpath="//area[@id='arthroplasty5']")
   public WebElement leftHand;
   
   /*	x path for Speciality =  Spine...........................................................................
   * x path for Occiput
   */
   
   @FindBy(xpath="//area[@id='spine8']")
   public WebElement occiput;
   
   /* x path for Cervical
   */
   
   @FindBy(xpath="//area[@id='spine2']")
   public WebElement cervical;
   

   /* x path for Thoracic
   */
   
   @FindBy(xpath="//area[@id='spine4']")
   public WebElement thoracic;
   
   /* x path forLumbar
   */
   @FindBy(xpath="//area[@id='spine6']")
   public WebElement lumbar;
   
   /* x path for Sacrum
   */
   @FindBy(xpath="//area[@id='spine10']")
   public WebElement sacrum;
    
   /* x path for OcciputLeft
   */
    
   @FindBy(xpath="//area[@id='spine7']")
   public WebElement occiputLeft;
    
   /* x path for CervicalLeft
   */
    
   @FindBy(xpath="//area[@id='spine1']")
   public WebElement cervicalLeft;
    

   /* x path for Thoracicleft
   */
    
   @FindBy(xpath="//area[@id='spine3']")
   public WebElement thoracicleft;
    
   /* x path forLumbarLeft
   */
    
   @FindBy(xpath="//area[@id='spine5']")
   public WebElement lumbarLeft;
     
   /* x path for SacrumLeft
   */
     
   @FindBy(xpath="//area[@id='spine9']")
    public WebElement sacrumleft;
   
   /*	x path for Speciality = Sports .................................................................................
    * x path for Shoulder
    */
   
   @FindBy(xpath="//area[@id='sports2']")
   public WebElement shoulderSp;
   
   /* x path for Humerus
    */
   
   @FindBy(xpath="//area[@id='sports4']")
   public WebElement humerusSp;
   
   /* x path for Elbow
    */
   
   @FindBy(xpath="//area[@id='sports6']")
   public WebElement elbowSp;
   
   /* x path for Forearm
    */
   
   @FindBy(xpath="//area[@id='sports8']")
   public WebElement forearmSp;
   
   
   /* x path for ShoulderLeft
    */
   
   @FindBy(xpath="//area[@id='sports1']")
   public WebElement shoulderSpLeft;
   
   /* x path for Humerus
    */
   
   @FindBy(xpath="//area[@id='sports3']")
   public WebElement humerusSpLeft;
   
   /* x path for ElbowLeft
    */
   
   @FindBy(xpath="//area[@id='sports5']")
   public WebElement elbowSpLeft;
   
   /* x path for ForearmLeft
    */
   
   @FindBy(xpath="//area[@id='sports7']")
   public WebElement forearmSpLeft;
   
   /* x path for Hip
    */
   
   @FindBy(xpath="//area[@id='sports14']")
   public WebElement hipSp;
   
   /* x path for Femur
    */
   
   @FindBy(xpath="//area[@id='sports16']")
   public WebElement femurSp;
   
   /* x path for Knee
    */
   
   @FindBy(xpath="//area[@id='sports18']")
   public WebElement kneeSp;
   
   /* x path for Tibia
    */
   
   @FindBy(xpath="//area[@id='sports20']")
   public WebElement tibiaSp;
   
   /* x path for Ankle
    */
   
   @FindBy(xpath="//area[@id='sports22']")
   public WebElement ankleSp;
   
   /* x path for Foot
    */
   
   @FindBy(xpath="//area[@id='sports24']")
   public WebElement footSp;
   
   /* x path for HipLeft
    */
   
   @FindBy(xpath="//area[@id='sports13']")
   public WebElement hipSpLeft;
   
   /* x path for FemurLeft
    */
   
   @FindBy(xpath="//area[@id='sports15']")
   public WebElement femurSpLeft;
   
   /* x path for KneeLeft
    */
   
   @FindBy(xpath="//area[@id='sports17']")
   public WebElement kneeSpLeft;
   
   /* x path for Tibia
    */
   
   @FindBy(xpath="//area[@id='sports19']")
   public WebElement tibiaSpLeft;
   
   
   /* x path for AnkleLeft
    */
   
   @FindBy(xpath="//area[@id='sports21']")
   public WebElement ankleSpLeft;
   
   /* x path for Foot
    */
   
   @FindBy(xpath="//area[@id='sports23']")
   public WebElement footSpLeft;
   

//	Speciality = Sports .................................................................................
//	Shoulder
	@FindBy(xpath="//area[@id='sports2']")
	WebElement shoulderSpRight;
	
////	Humerus
	@FindBy(xpath="//area[@id='sports4']")
	 WebElement humerusSpRight ;
//	
//	Elbow
	@FindBy(xpath="//area[@id='sports6']")
	WebElement elbowSpRight ;
//	
////	Forearm
	@FindBy(xpath="//area[@id='sports8']")
	WebElement forearmSpRight;
	
//	Wrist/Hand-------pending

	
//	Hip
	@FindBy(xpath="//area[@id='sports14']")
	WebElement hipSpRight ;
	
//	Femur
	@FindBy(xpath="//area[@id='sports16']")
	WebElement femurSpRight ;
	
//	Knee
	@FindBy(xpath="//area[@id='sports18']")
	WebElement kneeSpRight;
	
//	Tibia
	@FindBy(xpath="//area[@id='sports20']")
	WebElement tibiaSpRight;
	
////	Ankle
	@FindBy(xpath="//area[@id='sports22']")
	WebElement ankleSpRight ;
	
//	Foot
	@FindBy(xpath="//area[@id='sports24']")
	WebElement footSpRight ;
	

//	Back-------pending

	
	
	
	public CreateCaseAffectedAreaPage() 
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnhip()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", hip);
		
		
		
		
		
	}




}
