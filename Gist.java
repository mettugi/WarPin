package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gist {
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
  public void testGist() throws Exception {
    driver.get("https://gist.github.com/");
    driver.findElement(By.name("gist[contents][][name]")).click();
    driver.findElement(By.name("gist[contents][][name]")).clear();
    driver.findElement(By.name("gist[contents][][name]")).sendKeys("test");
    driver.findElement(By.xpath("//div[@id='gists']/div[2]/div/div[2]/div/div[5]")).click();
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("l");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lo");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lor");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lore");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem i");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ip");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ips");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsu");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum g");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gf");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfa");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfaj");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajg");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgw");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgwk");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgwka");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgwkal");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgwkalw");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgwkalwa");
    driver.findElement(By.name("gist[contents][][value]")).clear();
    driver.findElement(By.name("gist[contents][][value]")).sendKeys("lorem ipsum gfajgwkalwaw");
    // ERROR: Caught exception [unknown command [editContent]]
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
    driver.findElement(By.xpath("//div[@id='gists']/div[3]/div/div[2]/div/div[5]")).click();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("r");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rs");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rst");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstd");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdy");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyf");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyfj");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyfjg");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyfjgh");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyfjghk");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyfjghkj");
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='gist[contents][][value]'])[2]")).sendKeys("rstdyfjghkjk");
    // ERROR: Caught exception [unknown command [editContent]]
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
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
