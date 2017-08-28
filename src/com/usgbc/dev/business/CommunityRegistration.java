package com.usgbc.dev.business;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.usgbc.dev.BrokenLink;
import com.usgbc.dev.page.CommunityRegistration_;

public class CommunityRegistration extends CommunityRegistration_{

	public CommunityRegistration(WebDriver driver) {
		super(driver);		
	}
	
	//for country india (105)
	public void formFillUp() throws InterruptedException {
		
		//for selecting community name
		Select community = new Select(getCommunity_Name());
		List<WebElement> Commlist=community.getOptions();
		System.out.println("ITEMS in dropdown are:");
		
		for(int i=0;i<Commlist.size();i++)          
		    {
		        System.out.println(Commlist.get(i).getText());
		    }
		community.selectByIndex(2);
		String commValue=community.getFirstSelectedOption().getText();
		System.out.println("Selected item is:" +commValue);
		
		//for selecting country
		Select country = new Select(getCountry());
		List<WebElement> list=country .getOptions();
		System.out.println("total country:" + list.size());
		country.selectByIndex(105);
		Thread.sleep(5000);
		//String conValue=country.getFirstSelectedOption().getText();
		//System.out.println("Selected item is:" +conValue);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
		
		
		// for street address
		getStreet_Address().sendKeys("green street");
		getStreet_Address2().sendKeys("malibu towne");

		//for city
     	getCity().sendKeys("gurgaon");

       
       // for zip code
		getZip_code().sendKeys("122001");
		Thread.sleep(2000);
		
		//for state
		//getState().click();
		Select state= new Select(getState());
    	List<WebElement> list2=state .getOptions();
			
		System.out.println("Total state:" + list2.size());
		state.selectByIndex(8);
		
		
		
		//for full time student  radio button
	    List<WebElement>radioButton =driver.findElements(By.name("is_student")); 
	    System.out.println("Total radio Button for full time student:"+ radioButton.size());
	    boolean bValue = false;
	    bValue = radioButton.get(0).isSelected();
	    if(bValue = true){
	    	radioButton.get(1).click();
	    	getSchool().clear();
			getSchool().sendKeys("Carmel");
		    getStudent_ID().clear();
			getStudent_ID().sendKeys("12");
			getGraduation().clear();
			getGraduation().sendKeys("2020-05-21");		
		 }else {
			radioButton.get(0).click();	
		}
	
		//for emerging professional radio button
	    List<WebElement>radioButton2 =driver.findElements(By.name("is_emerging_prof")); 
	    System.out.println("Total radio Button emerging professional:"+ radioButton2.size());
	    boolean bValue2 = false;
	    bValue = radioButton2.get(0).isSelected();
	    if(bValue = true){ 
	    	radioButton2.get(1).click();
	    	getBirthday().clear();
	    	getBirthday().sendKeys("1992-03-10");
		 }else {
			 radioButton.get(0).click();
		 }
	    
	    // for checkboxes
	    getOther().click();
	    getDescribe().sendKeys("Whatsapp");
	    
	    // for selecting terms
	    boolean terms =getTerms().isSelected();
	    if (terms == false)
	    	getTerms().click();
	    
	    Thread.sleep(5000);
	    getContinue().click();
	    
	    Thread.sleep(5000);
	    String URL = driver.getCurrentUrl();

	   
	   if (URL.equalsIgnoreCase("http://dev-dynamic-usgbc.pantheonsite.io/community/registration")) {
		   
		  System.out.println("Form failed to submit succesfully :- Test Failed");

		   
	   } else {
		   
		   Assert.assertEquals(URL, "http://dev-dynamic-usgbc.pantheonsite.io/signin" );
		   System.out.println("Form  submit succesfully :- Test Passed");
		   Thread.sleep(3000);
		   String CurrentURL=driver.getCurrentUrl();
		   System.out.println(" Checking Broken Link of Current Url:" +CurrentURL);
		   BrokenLink bl =new BrokenLink();
			BrokenLink.BrokenLinkCheck(CurrentURL);   
		   
	   }
	   
	   
	    
     }
	
	
		
}


