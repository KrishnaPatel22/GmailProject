package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {

	@FindBy(id = "identifierId") public WebElement searchField;
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div") public WebElement searchField2;
	@FindBy(name = "password") public WebElement searchField3;
	@FindBy(xpath="(//*[@class=\"ts\"])[2]") public WebElement MailsOnFirstPage;
	@FindBy(xpath ="//*[@id=\"identifierNext\"]/div/button/div[2]") public WebElement Next;
	@FindBy(xpath ="//*[@id=\"passwordNext\"]/div/button/div[2]") public WebElement Next2;
	@FindBy(xpath="(//*[@class=\"ts\"])[3]") public WebElement TotalMails; 
	@FindBy(xpath="(//*[@role=\"checkbox\"])[2]") public WebElement SelectForTrash;
	@FindBy(xpath="(//*[@class=\"asa\"])[8]") public WebElement MoveToButton;
	@FindBy(xpath="(//*[@role=\"menuitem\"])[18]") public WebElement Trash;
	@FindBy(xpath="//*[@class=\"CJ\"]") public WebElement More;
	@FindBy(xpath="(//*[@class=\"TO\"]/div/div[2]/span/a)[10]") public WebElement Trash2;
	@FindBy(xpath="(//*[@role=\"checkbox\"])[8]") public WebElement SelectForTrashToInbox;
	@FindBy(xpath="(//*[@class=\"asa\"])[16]") public WebElement MoveToButtonInTrash;
	@FindBy(xpath="(//*[@role=\"menuitem\"]/div)[28]") public WebElement Inbox;
	
	
	@FindBy(xpath="(//*[@role=\"button\"]/div[1])[7]") public WebElement MarkAsUnread;
	@FindBy(xpath="//*[@class=\"bsU\"]") public WebElement TotalUnreadEmail;
	
}