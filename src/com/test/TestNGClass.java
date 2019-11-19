package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass {

@Parameters({"URL"})

/*
 @BeforeClass
 
public void launch() {
	System.out.println("BeforeClass");
}

@BeforeMethod
public void beforeMethodOne() {
	System.out.println("BeforeMethod");
}

@Test
public void aTest(String url) {
	System.out.println("Test");
	System.out.println("URL :"+url);
}

@AfterMethod
public void afterMethodOne() {
	System.out.println("AfterMethod");

}
@AfterClass
public void closeBrowser() {
	System.out.println("AfterClass");
}
*/

	@Test
	public void aTest(String url) {
		System.out.println("aTest");
		System.out.println("URL :"+url);
	}


	@Test
	public void bTest() {
		System.out.println("bTest");
	}

	@Test(groups="SmokeTesting")
	public void cTest() {
		System.out.println("cTest");
	}
}
