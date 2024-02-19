package hr.ferit.mttpp_ui_tests_selenium.msedge;

import org.testng.annotations.*;

import hr.ferit.mttpp_ui_tests_selenium.Params;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class BillPayingTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
    driver = new EdgeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Parameters({"username", "password"})
  @Test
  public void testPayingBill(String username, String password) throws Exception {
    driver.get(Params.MAIN_URL);
    driver.findElement(Params.LOGIN_USERNAME_BY).click();
    driver.findElement(Params.LOGIN_USERNAME_BY).clear();
    driver.findElement(Params.LOGIN_USERNAME_BY).sendKeys(username);
    driver.findElement(Params.LOGIN_PASSWORD_BY).click();
    driver.findElement(Params.LOGIN_PASSWORD_BY).clear();
    driver.findElement(Params.LOGIN_PASSWORD_BY).sendKeys(password);
    driver.findElement(Params.LOGIN_BUTTON_BY).click();
    driver.get(Params.OVERVIEW_URL);
    driver.findElement(Params.BILL_PAY_BY).click();
    driver.get(Params.BILL_PAY_URL);
    driver.findElement(Params.PAYEE_NAME_BY).click();
    driver.findElement(Params.PAYEE_NAME_BY).clear();
    driver.findElement(Params.PAYEE_NAME_BY).sendKeys("Example");
    driver.findElement(Params.PAYEE_ADDRESS_STREET_BY).click();
    driver.findElement(Params.PAYEE_ADDRESS_STREET_BY).clear();
    driver.findElement(Params.PAYEE_ADDRESS_STREET_BY).sendKeys("Example");
    driver.findElement(Params.PAYEE_ADDRESS_CITY_BY).click();
    driver.findElement(Params.PAYEE_ADDRESS_CITY_BY).clear();
    driver.findElement(Params.PAYEE_ADDRESS_CITY_BY).sendKeys("Example");
    driver.findElement(Params.PAYEE_ADDRESS_STATE_BY).click();
    driver.findElement(Params.PAYEE_ADDRESS_STATE_BY).clear();
    driver.findElement(Params.PAYEE_ADDRESS_STATE_BY).sendKeys("Example");
    driver.findElement(Params.PAYEE_ADDRESS_ZIPCODE_BY).click();
    driver.findElement(Params.PAYEE_ADDRESS_ZIPCODE_BY).clear();
    driver.findElement(Params.PAYEE_ADDRESS_ZIPCODE_BY).sendKeys("Example");
    driver.findElement(Params.PAYEE_PHONE_BY).click();
    driver.findElement(Params.PAYEE_PHONE_BY).clear();
    driver.findElement(Params.PAYEE_PHONE_BY).sendKeys("Example");
    driver.findElement(Params.PAYEE_ACCOUNT_NUMBER_BY).click();
    driver.findElement(Params.PAYEE_ACCOUNT_NUMBER_BY).clear();
    driver.findElement(Params.PAYEE_ACCOUNT_NUMBER_BY).sendKeys(Params.ACCOUNT_ID_TO_PAY_BILL_TO);
    driver.findElement(Params.VERIFY_ACCOUNT_BY).click();
    driver.findElement(Params.VERIFY_ACCOUNT_BY).clear();
    driver.findElement(Params.VERIFY_ACCOUNT_BY).sendKeys(Params.ACCOUNT_ID_TO_PAY_BILL_TO);
    driver.findElement(Params.BILL_AMMOUNT_BY).click();
    driver.findElement(Params.BILL_AMMOUNT_BY).clear();
    driver.findElement(Params.BILL_AMMOUNT_BY).sendKeys("40");
    driver.findElement(Params.FROM_ACCOUNT_ID_BY).click();
    new Select(driver.findElement(Params.FROM_ACCOUNT_ID_BY)).selectByIndex(0);
    driver.findElement(Params.SEND_PAYMENT_BY).click();
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
