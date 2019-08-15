package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.pages.CartPage;
import com.qa.pages.FlipkartPage;
import com.qa.pages.Pixel3aPage;
import com.qa.pages.PixelPageList;
import com.qa.testbase.TestBase;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CartPageTest extends TestBase {

	FlipkartPage flipkart;
	PixelPageList pixellist;
	Pixel3aPage pixel3a;
	CartPage cart;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		this.driver = initDriver();
		flipkart = new FlipkartPage();
		pixellist = flipkart.selectElectronics();
		pixel3a = pixellist.clickPixel3a();
		cart = pixel3a.addToCart();

	}

	@Test(priority = 1)
	public void testAddIconandgetAmount() throws InterruptedException  {

		cart.clickOnAddIconAndgetAmount();

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}
}
