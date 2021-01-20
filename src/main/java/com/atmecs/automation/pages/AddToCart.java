package com.atmecs.automation.pages;

import java.util.Properties;

import com.atmecs.automation.constants.Constants;
import com.atmecs.automation.helper.ElementHelper;
import com.atmecs.automation.testsuit.SetUp;
import com.atmecs.automation.utils.PropertyReader;

public class AddToCart extends SetUp {
	Properties Location_path;
	Properties Data_path;
	Properties validate_path;
	
	public void addtocart() throws InterruptedException {
		Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
		Data_path = PropertyReader.readProperty(Constants.CONFIG_PATH);
		Thread.sleep(3000);
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
}
}
