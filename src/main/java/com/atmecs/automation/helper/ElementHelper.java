package com.atmecs.automation.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementHelper {
	
	WebDriver driver;
	
	public ElementHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void closeAdWindow(WebDriver driver, String xpath, String xpthCloseBtn) throws InterruptedException{

		   if (driver.findElement(By.xpath(xpath)).isDisplayed())
		     {
		      driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
		         }
		 driver.findElement(By.xpath(xpthCloseBtn)).click();
		 driver.switchTo().parentFrame();
		}

	public static void enterElement(WebDriver driver, String xpath)
	{
		driver.findElement(By.xpath(xpath));	
	}
	
	
	//this method is for click on page element
	public static void elementClick(WebDriver driver,String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();	
	}
	
	//This method is used to send data 
	public static void elementSendKeys(WebDriver driver,String xpath,String key)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}
	
	//this method is used to select element by id
	public static void selectElementById(WebDriver driver,String idPath)
	{
		driver.findElement(By.id(idPath)).click();
	}
	
	public static void checkIfDisplayed(WebDriver driver, String key)
	{
		driver.findElement(By.id(key)).click();
	}
	public static String getText(WebDriver driver, String xpath)
	{
		String text = driver.findElement(By.xpath(xpath)).getText();
		return text;
	}
	
	public static void selectFromDropDown(WebDriver driver,String webElement,String value)
	{
		Select choose=new Select(driver.findElement(By.xpath(webElement)));
		choose.selectByValue(value);

	}
	
	public static void selectByVisibleText(WebDriver driver,String webElement,String value)
	{
		Select choose=new Select(driver.findElement(By.xpath(webElement)));
		choose.selectByVisibleText(value);

	}
  public static void enterElement(WebDriver driver,String xpath,String value)
  {
	 WebElement element=driver.findElement(By.xpath(xpath));
	 element.sendKeys(value);
	 element. sendKeys(Keys.ARROW_DOWN);
	 element. sendKeys(Keys.ENTER);
  }
}
