package com.atmecs.automation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.automation.pages.SignInPage;
import com.atmecs.automation.testsuit.SetUp;

public class SignInTest extends SetUp{
	@Test
	public void signInTest() throws Exception
	{
		SignInPage run=new SignInPage();
		run.SignIn();
		
	}
}
