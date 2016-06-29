package com.myOrdyPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DBUtilities {
	
		// TODO Auto-generated constructor stub
	


	 static WebDriver driver = null;
	
	
	
	//constructor
	 public DBUtilities (WebDriver dr){
			driver = dr;
			}
	 
	 
	 // following will take 2 args  from cucumber and one from page and then compare both messages
	 public static  void checkElement(String arg1, String arg2) {
		 Assert.assertEquals(arg1, arg2);
	 System.out.println("Successfully displayed element" +arg2 );
	   
	 }
	 
	 // following will take 2 args both strings and then compare them, basically used for text on UI
	 public static  void checkMessage(String arg1, String arg2) {
		 Assert.assertEquals(arg1, arg2);
	 System.out.println("Successfully displayed message" +arg2 );
	   
	 }
	   
	    	
	 
	 // following will check if the element exist on the screen
	 	 public static void checkElementPresentMessage(String arg1){
	 		 
		 System.out.println("***Page Element " + arg1.toUpperCase() +" is displayed successfully***");
	 }
	 	 // differnt from above this checks for webelement
	 	 public static void checkWebElementPresent(WebElement arg1){
	 		 
			 System.out.println("***Page Element " + arg1 +" is displayed successfully***");
		 }
		 
	// action performed on element(coming as arg)
	 	 public static void actionPerformedClick (String arg1)
	 	 {
	 		System.out.println("Successfully displayed Link" +arg1 );
	 		 System.out.println("Clicking on " +arg1.toUpperCase());
	 		 
	 	 }
	
	
	

	 public static void writeLog(String message) {
	    	
	    	String timeStamp = new SimpleDateFormat("[dd/MM/yyyy HH:mm:ss]").format(new Date(0));
	    	System.out.println(timeStamp + " " + message);
	    	
	    }
	 
	 

	 public static void hitEnter() {
	    	
		 Actions action = new Actions(driver); 
		   action.sendKeys(Keys.ENTER).build().perform();
	    	
	    }
	 
	 
	 // capture date and time

			 public static String DNT(String[] args) {

				   DateFormat dateFormat = new SimpleDateFormat("ddMMYYYYHHmmss");
				
				  
				   //get current date time with Calendar()
				   Calendar cal = Calendar.getInstance();
				   String datentime = dateFormat.format(cal.getTime());
				   return datentime;

			  }
			 
			 public static void uploadAnAttachmentFile() throws AWTException, InterruptedException
			 {
				 StringSelection ss = new StringSelection("C:\\Users\\HShori.DBRESULTS\\Desktop\\Jeetu Todos");
	                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	                // perform keystrokes
	                Robot robot = new Robot();
	                robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	                Thread.sleep(500);
	                robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	                Thread.sleep(500);
	                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	                Thread.sleep(500);
	                robot.keyPress(java.awt.event.KeyEvent.VK_V);
	                Thread.sleep(500);
	                robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	                Thread.sleep(500);
	                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	                Thread.sleep(500);
	                robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	                Thread.sleep(500);
	                robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			 }

			 
			 public static String scrollOnTopOfPage()
			 {
	
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("scroll(0, -250);");
				
				return null;
			 }
 // this function takes a variable and returns the xpath
			 
			 public String xpathMaker(String buttonName)
			    {
				String xpath = "//*[text()='"+buttonName+"']";
				 return xpath;
			    
			    }
			 

}