package com.testautomation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testautomation.tests.PageBase;

public class LoginScript extends PageBase{

	@Test
	public void Logintest()
	{
		System.out.println("This is login test");
		Assert.assertTrue(false);
	}
}
