package com.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFile extends LocatorsFile implements DataFile{

	public WebDriver driver;
	public WebDriverWait wait;
	public Actions builder;
	String totalMail;
	
	public void openBrowser() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GmailMainProject\\ProjectData\\chromedriver.exe");		
		driver = new ChromeDriver();
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		wait = new WebDriverWait(driver,100);
		PageFactory.initElements(driver, this);
		

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	public void openURL() throws Exception {	
		
		driver.get(URL);
		Thread.sleep(2000);
	}
	
	public void invalidLogin() throws InterruptedException {
		
	   	Thread.sleep(1000);
	   	searchField.sendKeys(email);	
	   	searchField.sendKeys(Keys.ENTER); 
    	Thread.sleep(1000);
    	String ActualError = searchField2.getText();
    	System.out.println(ActualError);
        String ExpectedError="Couldn't find your Google Account";

        Assert.assertEquals(ActualError, ExpectedError);
    }
	
    public void validLogin() throws InterruptedException {
		
	   	Thread.sleep(1000);
	   	searchField.sendKeys(email2);
        Next.click();
  
    	searchField3.sendKeys(abc);
	   	Next2.click();
	   	Thread.sleep(1000);
	}
	
    public void mailOnFirstPage() throws InterruptedException {
	
    	
    	Thread.sleep(5000);
        String MailOnFirstPage = wait.until(ExpectedConditions.visibilityOf(MailsOnFirstPage)).getText();
        System.out.println("Total Number of mails on 1st page :"+ MailOnFirstPage);
	
    }
    public void totalMail() throws InterruptedException {
	
    	
    	Thread.sleep(2000);
        String totalMail = TotalMails.getText();
        System.out.println("Total Mails :" + totalMail);
	
     }
 
 public void InboxToTrash() throws InterruptedException {
		
 	 Thread.sleep(2000);
 	 SelectForTrash.click();
 	 MoveToButton.click();
 	 Trash.click();
 	 System.out.println("Total Mails After moving 1 email InboxToTrash:" + totalMail);
 }
 
 public void TrashToInbox() throws InterruptedException {
	 
	 More.click();
	 Trash2.click();
 	 SelectForTrashToInbox.click();
 	 MoveToButtonInTrash.click();
 	 Inbox.click();
 	 System.out.println("Total Mails After moving 1 email TrashToInbox:" + totalMail);
 }
 
 public void readUnread() throws InterruptedException {
		
	 Thread.sleep(2000);
 	 SelectForTrash.click();
 	 MarkAsUnread.click();
 	System.out.println("Total Unread Emails:" + TotalUnreadEmail);
 	 
     
	
}
    



}






