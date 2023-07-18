package com.automation.pages;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Objectives {
	WebDriver driver;
	@FindBy(id = "lbl_val_1")
	WebElement labelval1;
	@FindBy(id = "lbl_val_2")
	WebElement labelval2;
	@FindBy(id = "lbl_val_3")
	WebElement labelval3;
	@FindBy(id = "lbl_val_4")
	WebElement labelval4;
	@FindBy(id = "lbl_val_5")
	WebElement labelval5;
	@FindBy(id = "lbl_ttl_val")
	WebElement labelttlval;
	@FindBy(id = "txt_val_1")
	WebElement txtval1;
	@FindBy(id = "txt_val_2")
	WebElement txtval2;
	@FindBy(id = "txt_val_3")
	WebElement txtval3;
	@FindBy(id = "txt_val_4")
	WebElement txtval4;
	@FindBy(id = "txt_val_5")
	WebElement txtval5;
	@FindBy(id = "txt_ttl_val")
	WebElement txtttlval;

	public Objectives() {
		PageFactory.initElements(driver, this);

	}

	    public static void main(String[] args) {
	        String[] val = {"$122,365.24", "$599.00", "$850,139.99", "$23,329.50", "$566.27"};
	        int s = 0;

	        for (int i = 0; i < val.length; i++) {
	            String str = val[i].replaceAll("[^\\d.]", ""); 
	            double amount = Double.parseDouble(str);
	            Scanner in = new Scanner(System.in);
	            System.out.print("Enter a number for " + val[i] + ": ");
	            int n = in.nextInt();

	            s += n;
	        }

	        System.out.println("Total sum: " + s);
	    }
	

	    public void verifyValue1(String label1, String txt_val_1) {
	        String actualValue = driver.findElement(By.id("lbl_val_1")).getText();
	        assertEquals(txt_val_1, actualValue);
	    }
	    public void verifyValue2(String label2, String txt_val_2) {
	        String actualValue = driver.findElement(By.id("lbl_val_2")).getText();
	        assertEquals(txt_val_2, actualValue);
	    }
	    public void verifyValue3(String label3, String txt_val_3) {
	        String actualValue = driver.findElement(By.id("lbl_val_3")).getText();
	        assertEquals(txt_val_3, actualValue);
	    }
	    public void verifyValue4(String label4, String txt_val_4) {
	        String actualValue = driver.findElement(By.id("lbl_val_4")).getText();
	        assertEquals(txt_val_4, actualValue);
	    }
	    public void verifyValue5(String label5, String txt_val_5) {
	        String actualValue = driver.findElement(By.id("lbl_val_5")).getText();
	        assertEquals(txt_val_5, actualValue);
	    }
	    public void verifyValue6(String label5, String txt_ttl_val) {
	        String actualValue = driver.findElement(By.id("lbl_ttl_val")).getText();
	        assertEquals(txt_ttl_val, actualValue);
	    }

}
