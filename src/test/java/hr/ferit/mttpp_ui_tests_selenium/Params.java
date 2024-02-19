package hr.ferit.mttpp_ui_tests_selenium;

import org.openqa.selenium.By;

public class Params {

	public static final String MAIN_URL = "https://parabank.parasoft.com/parabank";
	public static final String OVERVIEW_URL = MAIN_URL + "/overview.htm";
	public static final String BILL_PAY_URL = MAIN_URL + "/billpay.htm";
	public static final String FIND_TRANSACTIONS_URL = MAIN_URL + "/findtrans.htm";
	public static final String REQUEST_LOAN_URL = MAIN_URL + "/requestloan.htm";
	public static final String OPEN_NEW_ACCOUNT_URL = MAIN_URL + "/openaccount.htm";
	public static final String REGISTER_URL = MAIN_URL + "/register.htm";
	public static final String TRANSFER_URL = MAIN_URL + "/transfer.htm";
	public static final String UPDATE_PROFILE_URL = MAIN_URL + "/updateprofile.htm";
	
	public static final String ACCOUNT_ID_TO_PAY_BILL_TO = "11111";
	
	public static final By LOGIN_USERNAME_BY = By.name("username");
	public static final By LOGIN_PASSWORD_BY = By.name("password");
	public static final By MONTH_BY = By.name("month");
	public static final By PAYEE_NAME_BY = By.name("payee.name");
	public static final By PAYEE_ADDRESS_STREET_BY = By.name("payee.address.street");
	public static final By PAYEE_ADDRESS_CITY_BY = By.name("payee.address.city");
	public static final By PAYEE_ADDRESS_STATE_BY = By.name("payee.address.state");
	public static final By PAYEE_ADDRESS_ZIPCODE_BY = By.name("payee.address.zipCode");
	public static final By PAYEE_PHONE_BY = By.name("payee.phoneNumber");
	public static final By PAYEE_ACCOUNT_NUMBER_BY = By.name("payee.accountNumber");
	public static final By VERIFY_ACCOUNT_BY = By.name("verifyAccount");
	public static final By BILL_AMMOUNT_BY = By.name("amount");
	public static final By FROM_ACCOUNT_ID_BY = By.name("fromAccountId");
	
	public static final By TRANSFER_AMMOUNT_BY = By.id("amount");
	public static final By LOAN_AMMOUNT_BY = By.id("amount");
	public static final By DOWN_PAYMENT_BY = By.id("downPayment");
	public static final By LOAN_FROM_ACCOUNT_ID_BY = By.id("fromAccountId");
	public static final By TRANSFER_FROM_ACCOUNT_ID_BY = By.id("fromAccountId");
	public static final By TRANSFER_TO_ACCOUNT_ID_BY = By.id("toAccountId");
	public static final By CRITERIA_FROM_DATE_BY = By.id("criteria.fromDate");
	public static final By CRITERIA_TO_DATE_BY = By.id("criteria.toDate");
	public static final By TYPE_BY = By.id("type");
	public static final By CUSTOMER_FIRST_NAME_BY = By.id("customer.firstName");
	public static final By CUSTOMER_LAST_NAME_BY = By.id("customer.lastName");
	public static final By CUSTOMER_ADDRESS_STREET_BY = By.id("customer.address.street");
	public static final By CUSTOMER_ADDRESS_CITY_BY = By.id("customer.address.city");
	public static final By CUSTOMER_ADDRESS_STATE_BY = By.id("customer.address.state");
	public static final By CUSTOMER_ADDRESS_ZIP_BY = By.id("customer.address.zipCode");
	public static final By CUSTOMER_PHONE_BY = By.id("customer.phoneNumber");
	public static final By CUSTOMER_SSN_BY = By.id("customer.ssn");
	public static final By CUSTOMER_USERNAME_BY = By.id("customer.username");
	public static final By CUSTOMER_PASSWORD_BY = By.id("customer.password");
	public static final By CUSTOMER_REPEATED_PASSWORD_BY = By.id("repeatedPassword");
	
	public static final By FIRST_ACCOUNT_IN_OVERVIEW_BY = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");
	public static final By SEND_PAYMENT_BY = By.xpath("//input[@value='Send Payment']");
	public static final By APPLY_NOW_BY = By.xpath("//input[@value='Apply Now']");
	public static final By FIND_TRANSANCTIONS_BUTTON_BY = By.xpath("//div[@id='rightPanel']/div/div/form/div[7]/button");
	public static final By OPEN_NEW_ACCOUNT_BUTTON_BY = By.xpath("//input[@value='Open New Account']");
	public static final By CUSTOMER_FORM_UPPER_BY = By.xpath("//form[@id='customerForm']/table/tbody/tr/td[2]");
	public static final By CUSTOMER_FORM_LOWER_BY = By.xpath("//form[@id='customerForm']/table/tbody/tr[6]/td[2]");
	
	public static final By REGISTER_BUTTON_BY = By.xpath("//input[@value='Register']");
	public static final By GO_BUTTON_BY = By.xpath("//input[@value='Go']");
	public static final By LOGIN_BUTTON_BY = By.xpath("//input[@value='Log In']");
	public static final By UPDATE_PROFILE_BUTTON = By.xpath("//input[@value='Update Profile']");
	public static final By TRANSFER_BUTTON_BY = By.xpath("//input[@value='Transfer']");
	
	public static final By REGISTER_BY = By.linkText("Register");
	public static final By BILL_PAY_BY = By.linkText("Bill Pay");
	public static final By FIND_TRANSACTIONS_BY = By.linkText("Find Transactions");
	public static final By REQUEST_LOAN_BY = By.linkText("Request Loan");
	public static final By OPEN_NEW_ACCOUNT_BY = By.linkText("Open New Account");
	public static final By LOG_OUT_BY = By.linkText("Log Out");
	public static final By TRANSFER_FUNDS_BY = By.linkText("Transfer Funds");
	public static final By UPDATE_CONTACT_INFO_BY = By.linkText("Update Contact Info");
	
	public static final String TYPE_OF_ACCOUNT = "CHECKING"; 
}
