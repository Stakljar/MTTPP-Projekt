package hr.ferit.mttpp_ui_tests_selenium.chrome;

import org.testng.annotations.*;

import hr.ferit.mttpp_ui_tests_selenium.Params;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class AccountActivityViewTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Parameters({"username", "password"})
  @Test
  public void testAccountActivityView(String username, String password) throws Exception {
    driver.get(Params.MAIN_URL);
    driver.findElement(Params.LOGIN_USERNAME_BY).click();
    driver.findElement(Params.LOGIN_USERNAME_BY).clear();
    driver.findElement(Params.LOGIN_USERNAME_BY).sendKeys(username);
    driver.findElement(Params.LOGIN_PASSWORD_BY).click();
    driver.findElement(Params.LOGIN_PASSWORD_BY).clear();
    driver.findElement(Params.LOGIN_PASSWORD_BY).sendKeys(password);
    driver.findElement(Params.LOGIN_BUTTON_BY).click();
    driver.get(Params.OVERVIEW_URL);
    driver.findElement(Params.FIRST_ACCOUNT_IN_OVERVIEW_BY).click();
    driver.findElement(Params.MONTH_BY).click();
    new Select(driver.findElement(Params.MONTH_BY)).selectByVisibleText("December");
    driver.findElement(Params.GO_BUTTON_BY).click();
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
