package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scene2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testScene2() throws Exception {
    driver.get("https://www.ebay.com/");
    driver.findElement(By.id("gh-ac")).click();
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("macbook");
    driver.findElement(By.id("gh-btn")).click();
    driver.findElement(By.id("gh-ac")).click();
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("tablets");
    driver.findElement(By.id("gh-btn")).click();
    driver.findElement(By.id("gh-ac")).click();
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("tablets & networking");
    driver.findElement(By.id("gh-btn")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
