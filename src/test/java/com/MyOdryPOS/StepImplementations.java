package com.MyOdryPOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.myOrdyPages.AddToCartPage;
import com.myOrdyPages.CustomerSearchPage;
import com.myOrdyPages.DBUtilities;
import com.myOrdyPages.LoginPage;
import com.myOrdyPages.MenuPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepImplementations {
	WebDriver driver;
	
	@Before()
	  public void startUp() {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	  }

	  @After()
	  public void tearDown() {
	    driver.quit();
	  }
	
	@Given("^I am  on \"([^\"]*)\" POS$")
	public void I_am_on_POS(String arg1) throws Throwable {
		LoginPage home = PageFactory.initElements(driver, LoginPage.class);
		home.navigateTo();
	}
	
	@And("^I click on \"([^\"]*)\" option$")
	public void I_click_on_option(String arg1) throws Throwable {
		LoginPage home = PageFactory.initElements(driver, LoginPage.class);
		//home.clickButton(arg1);
		Thread.sleep(10000);
		home.clickButton(arg1);
      }
	
	@And("^I click on Menu item category \"([^\"]*)\"$")
	public void I_click_on_Menu_item_category(String arg1) throws Throwable {
    MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
    System.out.println("Clicking on " +arg1);  // to do remove later
    menuPage.clickButton(arg1);
	}



	@And("^I click on \"([^\"]*)\" button$")
	public void I_click_on_button(String arg1) throws Throwable {
		AddToCartPage menuItemPage = PageFactory.initElements(driver, AddToCartPage.class);
		menuItemPage.clickButton(arg1);
	
		// following is to shift control on windows popup

	}

	@Given("^I enter \"([^\"]*)\" details as \"([^\"]*)\"$")
	public void I_enter_details_as(String arg1, String arg2) throws Throwable {
		CustomerSearchPage enterValue = PageFactory.initElements(driver, CustomerSearchPage.class);
	    enterValue.enterInputFields(arg1,arg2);
	}
	@Then("^I should view message \"([^\"]*)\"$")
	public void I_should_view_message(String arg1) throws Throwable {
	    DBUtilities txtPresent = PageFactory.initElements(driver, DBUtilities.class);
	    txtPresent.isTextPresent(arg1);
	    
	}
}



