package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.utility.ExcelLibrary;



public class BaseClass {
	public  WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.out.println("Starts here");
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Jars Drivers//drivers//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		//driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(70000, TimeUnit.MILLISECONDS);
		System.out.println("Browser is launched");
		
	}
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//		}
	
	
//	@DataProvider(name ="creds")
//	
//	public Object[][] getexceldata(){
//		
//		int rows = obj1.getRowCount("Sheet1");
//		int Cols = obj1.getColumnCount("Sheet1");
//		
//		Object[][] data= new Object[rows][Cols];
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<Cols;j++) {
//				data[i][j] = obj1.getCellData("Sheet1", j, i+1);
//			}
//		}
//		return data;
//		
//	
		
	}
	


