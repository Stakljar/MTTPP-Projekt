package hr.ferit.mttpp_ui_tests_selenium.msedge;

import org.testng.annotations.*;

import hr.ferit.mttpp_ui_tests_selenium.Params;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class RegistrationTest {
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
  public void testRegistration(String username, String password) throws Exception {
    driver.get(Params.MAIN_URL);
    driver.findElement(Params.REGISTER_BY).click();
    driver.get(Params.REGISTER_URL);
    driver.findElement(Params.CUSTOMER_FORM_UPPER_BY).click();
    driver.findElement(Params.CUSTOMER_FIRST_NAME_BY).click();
    driver.findElement(Params.CUSTOMER_FIRST_NAME_BY).clear();
    driver.findElement(Params.CUSTOMER_FIRST_NAME_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_LAST_NAME_BY).click();
    driver.findElement(Params.CUSTOMER_LAST_NAME_BY).clear();
    driver.findElement(Params.CUSTOMER_LAST_NAME_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_ADDRESS_STREET_BY).click();
    driver.findElement(Params.CUSTOMER_ADDRESS_STREET_BY).clear();
    driver.findElement(Params.CUSTOMER_ADDRESS_STREET_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_ADDRESS_CITY_BY).click();
    driver.findElement(Params.CUSTOMER_ADDRESS_CITY_BY).clear();
    driver.findElement(Params.CUSTOMER_ADDRESS_CITY_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_ADDRESS_STATE_BY).click();
    driver.findElement(Params.CUSTOMER_ADDRESS_STATE_BY).clear();
    driver.findElement(Params.CUSTOMER_ADDRESS_STATE_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_FORM_UPPER_BY).click();
    driver.findElement(Params.CUSTOMER_ADDRESS_ZIP_BY).click();
    driver.findElement(Params.CUSTOMER_ADDRESS_ZIP_BY).clear();
    driver.findElement(Params.CUSTOMER_ADDRESS_ZIP_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_PHONE_BY).click();
    driver.findElement(Params.CUSTOMER_PHONE_BY).clear();
    driver.findElement(Params.CUSTOMER_PHONE_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_SSN_BY).click();
    driver.findElement(Params.CUSTOMER_SSN_BY).clear();
    driver.findElement(Params.CUSTOMER_SSN_BY).sendKeys("Example");
    driver.findElement(Params.CUSTOMER_USERNAME_BY).click();
    driver.findElement(Params.CUSTOMER_USERNAME_BY).clear();
    driver.findElement(Params.CUSTOMER_USERNAME_BY).sendKeys(username);
    driver.findElement(Params.CUSTOMER_PASSWORD_BY).click();
    driver.findElement(Params.CUSTOMER_PASSWORD_BY).clear();
    driver.findElement(Params.CUSTOMER_PASSWORD_BY).sendKeys(password);
    driver.findElement(Params.CUSTOMER_REPEATED_PASSWORD_BY).click();
    driver.findElement(Params.CUSTOMER_REPEATED_PASSWORD_BY).clear();
    driver.findElement(Params.CUSTOMER_REPEATED_PASSWORD_BY).sendKeys(password);
    driver.findElement(Params.REGISTER_BUTTON_BY).click();
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
