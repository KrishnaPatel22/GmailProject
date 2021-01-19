package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
	
	PageFile pf = new PageFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		pf.closeBrowser();
	}
	
    @Test (priority = 1)
    public void login() throws InterruptedException
    {
    	pf.invalidLogin();
    	System.out.println("Login Done Successfully with inValid Credentials");
    }
    
    @Test(priority = 2)
    public void login2() throws InterruptedException
    {
    	pf.validLogin();
    	System.out.println("Login Done Successfully with Valid Credentials");
     }
    
    @Test (priority = 3)
    public void mail() throws InterruptedException
    {
    	pf.validLogin();
    	pf.mailOnFirstPage();
    	pf.totalMail();
    	
    }
    
    @Test (priority = 4)
    public void trashMail() throws InterruptedException
    {
    	pf.validLogin();
    	pf.InboxToTrash();
    	pf.totalMail();
    	pf.TrashToInbox();
    	pf.totalMail();
    }
    
    @Test (priority = 5)
    public void ReadUnread() throws InterruptedException
    {
    	pf.validLogin();
    	pf.readUnread();
    }
    
    
    
}