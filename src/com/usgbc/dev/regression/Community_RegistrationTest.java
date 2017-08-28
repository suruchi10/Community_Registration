package com.usgbc.dev.regression;

import com.usgbc.dev.Base;
import com.usgbc.dev.BrokenLink;
import com.usgbc.dev.business.CommunityRegistration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Community_RegistrationTest extends BrokenLink{
	
	@Test
	public void test1() {
		
		BrokenLink bl =new BrokenLink();
		BrokenLink.BrokenLinkCheck("http://dev-dynamic-usgbc.pantheonsite.io/community/registration");
	}
	@Test
	public void test2() throws InterruptedException {
		String url ="http://dev-dynamic-usgbc.pantheonsite.io/community/registration";
		Base b =new Base();
		WebDriver driver = b.getDriver(url);
	    CommunityRegistration cr = PageFactory.initElements(driver, CommunityRegistration.class);    
	    cr.formFillUp();
	
	    
	}
	
}
