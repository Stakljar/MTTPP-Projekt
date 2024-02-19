# Selenium testing for website https://parabank.parasoft.com/parabank/index.htm

## How to setup project in Eclipse:

###### Prerequisites:
1. Eclipse plugin TestNG for Eclipse installed
2. Apache maven binary downloaded, extracted and added bin directory of Apache maven binary directory to Path in system variables (for running tests in terminal)

###### Steps:
1. Clone this repository
2. Open Eclipse and go to File -> Open Projects from File System... -> Select Path to your file and click Finish
3. Make sure chrome and edge drivers are downloaded and configured so that they are available inside project (directly added to project or via Path in system variables)
4. Update maven project if necessary, right click on pom.xml -> Maven -> Update Project... or select Project -> Update Maven Project

To run tests right click on testng.xml -> Run As -> TestNG Suite or open terminal, change directory to project's directory and type mvn test

Tests are supported for Chrome and Windows Edge browsers

## Tests:
**Registration:** Selecting registration option, filling form and submitting<br><br>
**Viewing account activity:** Logging in, selecting Accounts Overview, selecting first account, selecting activity period for December and submitting<br><br>
**Paying bill:** Logging in, selecting Bill Pay, filling form and leaving account from which to pay to default and submitting<br><br>
**Finding transactions:** Logging in, selecting Find Transactions, filling dates in section Find by Date range where first date comes before second one and submitting<br><br>
**Loan request:** Logging in, selecting Request Loan, filling Loan amount and Down Payment numbers and submitting<br><br>
**Opening new account:** Logging in, selecting Open New Account selecting CHECKING type and submitting<br><br>
**Transfering funds:** Logging in, selecting Transfer Funds, filling in Amount number and submitting<br><br>
**Updating contact info:** Logging in, selecting Update Contact Info, changing Address: field and submitting<br><br>


