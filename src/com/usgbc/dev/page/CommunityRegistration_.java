package com.usgbc.dev.page;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.usgbc.dev.Base;

public class CommunityRegistration_ extends Base{
	public WebDriver driver;
	public CommunityRegistration_ (WebDriver driver) {
		this.driver = driver;
	}
	
	
//	@FindBy(id = "edit-community-name")private WebElement Community_Name;
	
   
    public By Community_Name = By.id ("edit-community-name");
    public WebElement getCommunity_Name() {
    	return driver.findElement(Community_Name);
    }
    
    public By Attention = By.id ("edit-attention-to");
    public WebElement getAttention() {
    	return driver.findElement(Attention);
    }
    
    public By Company = By.id ("edit-company");
    public WebElement getCompany() {
    	return driver.findElement(Company);
    }
    
    public By Country = By.name ("address[country_code]");
    public WebElement getCountry() {
    	return driver.findElement(Country);
    }
    
   
    public By Street_Address = By.xpath(".//*[@class='address-line1 form-text required']");
    public WebElement getStreet_Address() {
    	return driver.findElement(Street_Address);
    }
    public By Street_Address2 = By.xpath(".//*[@class='address-line2 form-text required']");
    public WebElement getStreet_Address2() {
    	return driver.findElement(Street_Address2);
    }
    
    public By City = By.name("address[locality]");
    public WebElement getCity() {
    	return driver.findElement(City);
    }
    
    public By Zip_code = By.name("address[postal_code]");
    public  WebElement getZip_code() {
    	return driver.findElement(Zip_code);
    }
    
    public By State = By.xpath(".//*[@class='administrative-area form-select required']");
    public  WebElement getState() {
    	return driver.findElement(State);
    }
    
    public By Is_student = By.name ("is_student");
    public  WebElement getIs_student() {
    	return driver.findElement(Is_student);
    }
    
    public By Full_time_student_no = By.id ("edit-is-student-n");
    public  WebElement getFull_time_student_no() {
    	return driver.findElement(Full_time_student_no);
    }
    
    public By Full_time_student_yes = By.id ("edit-is-student-y");
    public  WebElement getFull_time_student_yes() {
    	return driver.findElement(Full_time_student_yes);
    }
    
    public By School = By.id ("edit-school");
    public  WebElement getSchool() {
    	return driver.findElement(School);
    }
    
    public By Student_ID  = By.id ("edit-student-id");
    public  WebElement getStudent_ID() {
    	return driver.findElement(Student_ID);
    }
    
    public By Graduation  = By.id ("edit-graduation-date");
    public  WebElement getGraduation() {
    	return driver.findElement(Graduation);
    }
  
    public By Emerging_Professional_no = By.id ("edit-is-emerging-prof-n");
    public  WebElement getEmerging_Professional_no() {
    	return driver.findElement(Emerging_Professional_no);
    }
    
    public By Emerging_Professional_yes = By.id ("edit-is-emerging-prof-y");
    public  WebElement getEmerging_Professional_yes() {
    	return driver.findElement(Emerging_Professional_yes);
    }
    
    public By Birthday = By.id ("edit-emerging-prof-bday");
    public  WebElement getBirthday() {
    	return driver.findElement(Birthday);
    }
    
    public By Terms = By.id ("edit-terms");
    public WebElement getTerms() {
    	return driver.findElement(Terms);
    }
    
    public By Other = By.id ("edit-how-did-you-hear-5");
    public WebElement getOther() {
    	return driver.findElement(Other);
    }
    
    public By Describe = By.id ("edit-how-did-you-hear-text");
    public WebElement getDescribe() {
    	return driver.findElement(Describe);
    }
    
    public By Continue = By.id ("edit-submit");
    public WebElement getContinue() {
    	return driver.findElement(Continue);
    }
    public By Cancel = By.id ("edit-cancel");
    public WebElement getCancel() {
    	return driver.findElement(Cancel);
    }
   
}
