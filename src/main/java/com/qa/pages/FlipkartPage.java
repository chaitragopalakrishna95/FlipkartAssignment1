package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.testbase.TestBase;

public class FlipkartPage extends TestBase {
	
	Actions actions;
	
	@FindBy(xpath="//button[@class=\"_2AkmmA _29YdH8\"]")
	WebElement logincancel;
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	WebElement electronics;
	
	@FindBy(linkText="Pixel 3a | 3a XL")
	WebElement pixel;
	
	public FlipkartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public PixelPageList selectElectronics()
	{   
		logincancel.click();
		actions=new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Pixel 3a | 3a XL")));
		pixel.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=\"Pixel 3A Series\"]")));
		return new PixelPageList();
	}
}
