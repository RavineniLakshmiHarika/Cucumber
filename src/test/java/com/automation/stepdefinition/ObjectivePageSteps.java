package com.automation.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectivePageSteps {
	private WebDriver driver;

    @Given("I am on the relevant page")
    public void navigateToPage() {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		driver = new ChromeDriver(co);
        driver.get("URL");
    }

    @Then("I should see the value1 {string} as {string}")
    public void verifyValue1(String label1, String txt_val_1) {
        String actualValue = driver.findElement(By.id("lbl_val_1")).getText();
        assertEquals(txt_val_1, actualValue);
    }
    @Then("I should see the value2 {string} as {string}")
    public void verifyValue2(String label2, String txt_val_2) {
        String actualValue = driver.findElement(By.id("lbl_val_2")).getText();
        assertEquals(txt_val_2, actualValue);
    }
    @Then("I should see the value3 {string} as {string}")
    public void verifyValue3(String label3, String txt_val_3) {
        String actualValue = driver.findElement(By.id("lbl_val_3")).getText();
        assertEquals(txt_val_3, actualValue);
    }
    @Then("I should see the value4 {string} as {string}")
    public void verifyValue4(String label4, String txt_val_4) {
        String actualValue = driver.findElement(By.id("lbl_val_4")).getText();
        assertEquals(txt_val_4, actualValue);
    }
    @Then("I should see the value5 {string} as {string}")
    public void verifyValue5(String label5, String txt_val_5) {
        String actualValue = driver.findElement(By.id("lbl_val_5")).getText();
        assertEquals(txt_val_5, actualValue);
    }
    @Then("I should see the value5 {string} as {string}")
    public void verifyValue6(String label5, String txt_ttl_val) {
        String actualValue = driver.findElement(By.id("lbl_ttl_val")).getText();
        assertEquals(txt_ttl_val, actualValue);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
