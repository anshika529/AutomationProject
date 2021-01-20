package com.atmecs.automation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.automation.pages.AddToCart;

public class AddToCartTest {
	@Test
	public void addtocartTest() throws Exception
	{
		AddToCart add=new AddToCart ();
		add.addtocart();
		
	}
}
