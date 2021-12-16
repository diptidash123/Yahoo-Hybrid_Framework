package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;

public class Pomyahoo extends Basepage implements Autoconstant
{
 @FindBy(xpath="(//input[@type='text'])[1]")
 private WebElement firstnametextfield;
 
 @FindBy(xpath="(//input[@type='text'])[2]")
 private WebElement lastnametextfield;
 
 @FindBy(xpath="(//input[@type='text'])[3]")
 private WebElement emailtextfield;
 
 @FindBy(xpath="//input[@type='password']")
 private WebElement passwordtextfield;
 
 @FindBy(xpath="//select[@type='select']")
 private WebElement dropdownlist;
 
 @FindBy(xpath="(//input[@type='tel'])[1]")
 private WebElement mobilenotextfield;
 
 @FindBy(xpath="//select[@id='usernamereg-month']")
 private WebElement birthmonthdropdownlist;
 
 @FindBy(xpath="(//input[@type='tel'])[2]")
 private WebElement daytesxtfield;
 
 @FindBy(xpath="(//input[@type='tel'])[3]")
 private WebElement yeartextfield;
 
 @FindBy(xpath="(//input[@type='text'])[4]")
 private WebElement gendertextfield;
 
 public Pomyahoo(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

 public void enterdetails() throws IOException, InterruptedException
 {
	 firstnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 0));
	 lastnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 1));
	 emailtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 2));
	 Thread.sleep(5000);
	 passwordtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 3));
	 selectbyindex(dropdownlist, 6);
	 //selectbyvisibletext(dropdownlist, "+93");
	 mobilenotextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 4));
	 birthmonthdropdownlist.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 5));
	 daytesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 6));
	 yeartextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 7));
	 gendertextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 8));
 }
}
