package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.testbase.TestBase;

public class CartPage extends TestBase {

	JavascriptExecutor js;

	@FindBy(xpath = "//button[@class=\"wNrY5O\" and text()=\"+\"]")
	WebElement addicon;

	@FindBy(xpath = "//span[@class=\"pMSy0p XU9vZa\"]")
	WebElement amount;

	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddIconAndgetAmount() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Google Pixel 3a (Just Black, 64 GB)\"]")));
		addicon.click();
		Thread.sleep(1000);
        System.out.println(amount.getText());
	}

}
