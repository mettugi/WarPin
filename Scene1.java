package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scene1 {
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
  public void testScene1() throws Exception {
    driver.get("https://www.ebay.com/");
    driver.findElement(By.id("gh-shop-ei")).click();
    driver.findElement(By.linkText("Cell phones & accessories")).click();
    driver.findElement(By.xpath("//div[@id='s0-26-9-0-1[0]-0-0-xCarousel-x-carousel-items']/ul/li[2]/a/p")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
    driver.findElement(By.xpath("//div[@id='c3-mainPanel-Screen%20Size']/span")).click();
    driver.findElement(By.id("c3-subPanel-Screen%20Size_5.0%20-%205.4%20in_cbx")).click();
    driver.findElement(By.xpath("//div[@id='c3-mainPanel-price']/span")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("3000000");
    driver.findElement(By.xpath("(//input[@value=''])[4]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("4000000");
    driver.findElement(By.xpath("//div[@id='c3-mainPanel-location']/span")).click();
    driver.findElement(By.xpath("(//input[@name='location'])[10]")).click();
    driver.findElement(By.xpath("//div[@id='c3-footerId']/div[2]/button")).click();
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
