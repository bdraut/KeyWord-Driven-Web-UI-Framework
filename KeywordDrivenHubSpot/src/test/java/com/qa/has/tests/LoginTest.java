package com.qa.has.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;

public class LoginTest {

	@Test
	public void loginTest()
	{
		KeyWordEngine keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
}
