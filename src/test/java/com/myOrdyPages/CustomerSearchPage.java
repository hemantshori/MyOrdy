package com.myOrdyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerSearchPage {

		WebDriver driver = null;
		
		public CustomerSearchPage(WebDriver arg1) {
			driver = arg1;
		}

	public void enterInputFields(String arg1, String arg2)
	{
		DBUtilities enterDetails = new DBUtilities(driver);
		String myxpath = enterDetails.xpathMakerForInputField(arg1);
		driver.findElement(By.xpath(myxpath)).click();
		String myxpath2 = enterDetails.xpathMakerForInputField(arg1);
		driver.findElement(By.xpath(myxpath2)).sendKeys(arg2);
		System.out.println(myxpath);
	}
	}


