package com.myOrdyPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver = null;

	public LoginPage(WebDriver dr) {
		driver = dr;
	}

	public void navigateTo() throws InterruptedException {
		driver.get("http://jrange-dev.jrange.com/myordy-pos/");
	}

	public MenuPage clickButton(String arg1) throws Throwable {
		
		if (arg1.equals("Submit Order") || arg1.equals("Save Customer")) {
			DBUtilities createXpath = new DBUtilities(driver);
			String myxpath = createXpath.xpathMaker(arg1);
			driver.findElement(By.xpath(myxpath)).click();
			Thread.sleep(3000);
			// for popup
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);}
		
		if (arg1.equals("Search Order")) {
			Thread.sleep(6000);
			driver.switchTo().activeElement();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}else{
			DBUtilities createXpath = new DBUtilities(driver);
			String myxpath = createXpath.xpathMaker(arg1);
			driver.findElement(By.xpath(myxpath)).click();
		}

		return PageFactory.initElements(driver, MenuPage.class);
	}
}
