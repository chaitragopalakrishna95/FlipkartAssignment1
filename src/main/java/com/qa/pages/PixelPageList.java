package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.testbase.TestBase;

public class PixelPageList extends TestBase {
	
	@FindBy(xpath="//div[contains(text(),'Google Pixel 3a (Just Black, 64 GB)')]")
	WebElement pixel3a;
	
	public PixelPageList()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Pixel3aPage clickPixel3a()
	{
		pixel3a.click();
		return new Pixel3aPage();
	}

}
