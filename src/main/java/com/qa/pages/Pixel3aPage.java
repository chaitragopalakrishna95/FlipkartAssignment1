package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.testbase.TestBase;

public class Pixel3aPage extends TestBase {

	@FindBy(xpath = "//button[contains(@class,'_2AkmmA _2Npkh4 _2MWPVK')]")
	WebElement addtocart;

	public Pixel3aPage() {
		PageFactory.initElements(driver, this);
	}

	public CartPage addToCart() throws InterruptedException
	{   Set<String> handles=driver.getWindowHandles();
	          Iterator<String> it=handles.iterator();
	          String parentWindowId=it.next();
	          String childWindowId=it.next();
		driver.switchTo().window(childWindowId);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Google Pixel 3a (Just Black, 64 GB)\"]")));
		addtocart.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Deliver to\"]")));
		return new CartPage();
	}

}
