package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit {
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
  public void testEdit() throws Exception {
    driver.get("https://gist.github.com/mettugi/a4907193f69844e48cdb6e314d3c3e7f");
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.xpath("//div[@id='gists']/div[2]/div[2]/div[2]/div/div[5]/div/div/div/div/div[5]/div/pre")).click();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdyfjghkj");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdyfjghk");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdyfjgh");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdyfjg");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdyfj");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdyf");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstdy");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rstd");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rst");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("rs");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("r");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("t");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("th");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("thi");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this i");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is j");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is ju");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is jus");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just t");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just te");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just tes");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nt");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nth");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthi");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis t");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis te");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis tes");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis te");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis tex");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text j");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text ju");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text jus");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just t");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just to");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just to");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just to t");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just to te");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just to tes");
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).clear();
    driver.findElement(By.xpath("//textarea[@name='gist[contents][][value]']")).sendKeys("this is just test\nthis text just to test");
    // ERROR: Caught exception [unknown command [editContent]]
    driver.findElement(By.xpath("//div[@id='gists']/div[3]/div[2]/div[2]/div/div[5]/div/div/div/div/div[5]/div")).click();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("t");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("th");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("thi");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this i");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is j");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is ju");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is jus");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is just");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is just");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is just t");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is just te");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is just tes");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("this is just test");
    // ERROR: Caught exception [unknown command [editContent]]
    driver.findElement(By.xpath("(//button[@type='submit'])[7]")).click();
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
