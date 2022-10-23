package com.TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.BaseClass;

public class TestCases extends BaseClass{
SoftAssert Object = new SoftAssert();
	@Parameters({"Firstname","Lastname","passwd", "phone_mobile"})
	@Test
	public void testmethod(String Firstname, String Lastname, String passwd, String phone_mobile) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Sign in"))));
		
		JavascriptExecutor AB = (JavascriptExecutor)driver;
		AB.executeScript("window.scroll(0,200)");
		Thread.sleep(20000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("WOMEN"))).build().perform();
		Assert.assertTrue(true);
		Thread.sleep(20000);
		Actions act2 = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("DRESSES"))).build().perform();
		Assert.assertTrue(true);
		Thread.sleep(20000);
		Actions act3 = new Actions(driver);
		act3.moveToElement(driver.findElement(By.linkText("T-SHIRTS"))).build().perform();
		Assert.assertTrue(true);
		Thread.sleep(20000);
		
		
		String Url = driver.getCurrentUrl();
		String expected  = "https://";
		Object.assertEquals(Url, expected);
		Object.assertFalse(false);
		Thread.sleep(20000);
		
			String title = driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.linkText("Sign in")).click();
			
			driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
			Thread.sleep(20000);
			
			WebElement alert1 = driver.findElement(By.id("create_account_error"));
			String msg = alert1.getText();
			
			System.out.println(msg);
			String mailaccount = "sanjusharma.tih@gmail.com" ;
				WebElement mail = driver.findElement(By.id("email_create"));
				mail.sendKeys(mailaccount);
			 
			 Thread.sleep(20000);
			 System.out.println("mail has been submitted");
			 
			 driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	

			 
			 driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
			 
			 driver.findElement(By.id("id_gender1")).click();	
			 
			
			Thread.sleep(20000);
			
			driver.findElement(By.id("customer_firstname")).sendKeys(Firstname);
			Thread.sleep(10000);
			driver.findElement(By.id("customer_lastname")).sendKeys(Lastname);
			Thread.sleep(10000);
			driver.findElement(By.id("email")).isDisplayed();
			Assert.assertTrue(true);
			Thread.sleep(10000);
			driver.findElement(By.id("passwd")).sendKeys(passwd);
			
			WebElement dropdown1 = driver.findElement(By.id("days"));
			Select select1 = new Select(dropdown1);
			select1.selectByIndex(2);
			Thread.sleep(10000);
			WebElement dropdown2 = driver.findElement(By.id("months"));
			Select select2 = new Select(dropdown2);
			select2.selectByIndex(11);
			Thread.sleep(10000);
			WebElement dropdown3 = driver.findElement(By.id("years"));
			Select select3 = new Select(dropdown3);
			select3.selectByIndex(3);;
			
			WebElement checkbox1= driver.findElement(By.id("newsletter"));
			checkbox1.click();
			System.out.println(checkbox1.isSelected());
			
			driver.findElement(By.id("company")).sendKeys("INFOcity");
			driver.findElement(By.name("address1")).sendKeys("P.O : NextRoad, SweetLake");
			driver.findElement(By.name("city")).sendKeys("Banglore");
			
			WebElement statedropdown = driver.findElement(By.id("id_state"));
			Select select4 = new Select(statedropdown);
			select4.selectByIndex(4);
			
			WebElement post= driver.findElement(By.id("postcode"));
			post.sendKeys("00000");
			
		WebElement country = driver.findElement(By.id("id_country"));
			System.out.println(country.isDisplayed());
			
			WebElement othertext = driver.findElement(By.id("other"));
			othertext.clear();
			othertext.sendKeys("Jenkins extent report");
			
			WebElement phone = driver.findElement(By.id("phone"));
			phone.sendKeys("55551111");
			System.out.println(phone);
			
			driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);
			
			WebElement add = driver.findElement(By.id("alias"));
			add.clear();
			add.sendKeys("My address");
			driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	}
	

	
}
