package com.atmecs.automation.pages;

import java.util.Properties;

import com.atmecs.automation.constants.Constants;
import com.atmecs.automation.helper.ElementHelper;
import com.atmecs.automation.testsuit.SetUp;
import com.atmecs.automation.utils.PropertyReader;

public class SignInPage extends SetUp {
	Properties Location_path;
	Properties Data_path;
	Properties validate_path;
	
	public void SignIn() throws InterruptedException {
		Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
		Data_path = PropertyReader.readProperty(Constants.CONFIG_PATH);
		Thread.sleep(3000);
		
		//Sign In 
		ElementHelper.elementClick(driver, Location_path.getProperty("SignIn"));
		ElementHelper.enterElement(driver, Location_path.getProperty("EmailCreate"), Data_path.getProperty("Email"));			
		ElementHelper.elementClick(driver, Location_path.getProperty("CreateAccount"));
		
		Thread.sleep(3000);
		//Personal Info
		ElementHelper.elementClick(driver, Location_path.getProperty("Gender"));
		ElementHelper.enterElement(driver, Location_path.getProperty("FName"), Data_path.getProperty("FirstName"));
		ElementHelper.enterElement(driver, Location_path.getProperty("LName"), Data_path.getProperty("LastName"));
		ElementHelper.enterElement(driver, Location_path.getProperty("Password"), Data_path.getProperty("Pwd"));
		
		Thread.sleep(2000);
		ElementHelper.elementClick(driver, Location_path.getProperty("DOBDate"));
		ElementHelper.elementClick(driver, Location_path.getProperty("DOBMonth"));
		ElementHelper.elementClick(driver, Location_path.getProperty("DOBYear"));
		
		Thread.sleep(2000);
		ElementHelper.enterElement(driver, Location_path.getProperty("Address1"), Data_path.getProperty("Address"));
		ElementHelper.enterElement(driver, Location_path.getProperty("CityPath"), Data_path.getProperty("City"));
		ElementHelper.elementClick(driver, Location_path.getProperty("State"));
		ElementHelper.enterElement(driver, Location_path.getProperty("PostalCode"), Data_path.getProperty("Postal"));
		ElementHelper.elementClick(driver, Location_path.getProperty("Country"));
		ElementHelper.enterElement(driver, Location_path.getProperty("MobilePhone"), Data_path.getProperty("Mobile"));
		ElementHelper.enterElement(driver, Location_path.getProperty("AliasAddress"), Data_path.getProperty("Alias"));
		ElementHelper.enterElement(driver, Location_path.getProperty("Password"), Data_path.getProperty("Pwd"));
		ElementHelper.elementClick(driver, Location_path.getProperty("Register"));
		ElementHelper.elementClick(driver, Location_path.getProperty("HomeButton1"));
		Thread.sleep(2000);
		
		//Add To Cart
		ElementHelper.elementClick(driver, Location_path.getProperty("BestSeller"));
		ElementHelper.elementClick(driver, Location_path.getProperty("Product1"));
		ElementHelper.elementClick(driver, Location_path.getProperty("QuantityPlus"));
		ElementHelper.elementClick(driver, Location_path.getProperty("Size"));
		ElementHelper.elementClick(driver, Location_path.getProperty("AddToCartButton"));
		ElementHelper.elementClick(driver, Location_path.getProperty("ContinueShopping"));
		ElementHelper.elementClick(driver, Location_path.getProperty("Women"));
		ElementHelper.elementClick(driver, Location_path.getProperty("DressesIcon"));
		ElementHelper.elementClick(driver, Location_path.getProperty("SummerDresses"));
		ElementHelper.elementClick(driver, Location_path.getProperty("SummerProduct1"));
		ElementHelper.elementClick(driver, Location_path.getProperty("Size"));
		Thread.sleep(2000);
//		
//		//Check Out
//		ElementHelper.elementClick(driver, Location_path.getProperty("AddToCartButton"));			
//		ElementHelper.elementClick(driver, Location_path.getProperty("CheckOut"));
//		ElementHelper.elementClick(driver, Location_path.getProperty("ProceedToCheckOut"));
//		ElementHelper.elementClick(driver, Location_path.getProperty("NextCheckOut"));
//		ElementHelper.elementClick(driver, Location_path.getProperty("CheckBox"));
//		ElementHelper.elementClick(driver, Location_path.getProperty("NextButton"));
//		Thread.sleep(2000);
//		
//		//Payment to Proceed
//		ElementHelper.elementClick(driver, Location_path.getProperty("PayByCheck"));
//		ElementHelper.elementClick(driver, Location_path.getProperty("ConfirmMyOrder"));
//		Thread.sleep(2000);
//		
//		}
	}
}
