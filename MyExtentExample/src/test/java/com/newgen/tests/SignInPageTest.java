package com.newgen.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.newgen.base.TestBase;
import com.newgen.pages.BasePage;
import com.newgen.pages.SignInPage;

public class SignInPageTest extends TestBase {

	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;

	@BeforeClass
	public void setUp() {
		//Get driver
		driver = getDriver();
	}

	@Test
	public void verifySignInFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		signInPage = basePage.clickSignInBtn();
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");
	}

	@Test
	public void SignInPageTestOne() {
		System.out.println("Hey I am in example test One");
	}

	@Test
	public void SignInPageTestTwo() {
		System.out.println("Hey I am in example test two");
	}

	@Test
	public void SignInPageTestThree() {
		System.out.println("Hey I am in example test three");
	}
}