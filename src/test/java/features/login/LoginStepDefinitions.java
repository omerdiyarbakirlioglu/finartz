package test.java.features.login;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.pages.*;
import test.java.test.ParentFunctions;

import java.nio.file.attribute.UserPrincipalLookupService;

public class LoginStepDefinitions extends ParentFunctions {

    UserPage UserPage;
    private String FirstProductName;
    private String BasketNameProduct;

    public static final int MIN_LENGTH = 3;
    public static final int MAX_LENGTH = 20;

    @Before
    public void before() {
        setUp();
        UserPage = new UserPage(driver, wait);
}

    @After
    public void after() {
        tearDown();
    }

    @Given("^user is on the login page$")
    public void userIsOnTheLoginPage() {
        UserPage.openHepsiburada();
        System.out.println("User om Website");
    }

    @When("^Login the page$")
    public void loginThePage() {
    }

    @And("^Control the tab title$")
    public void controlTheTabTitle() {
        UserPage.tabTitle();
    }

    @And("^Control the page title$")
    public void controlThePageTitle() {
        UserPage.pageTitle();
    }

    @And("^Control the Status Message$")
    public void controlTheStatusMessage() {
        UserPage.controllStatusMessage(UserPage.statusMessageFirst);
    }

    @And("^Click Test Login button$")
    public void clickTestLoginButton() {
        UserPage.clickTestButton();
    }

    @And("^Enter Username$")
    public void enterUsername() {
        UserPage.enterUsername(UserPage.correctUsermame);
    }

    @And("^Enter uncorrect username$")
    public void enterUncorrectUsername() {
        UserPage.enterUsername(UserPage.uncorrectUsername);
    }

    @And("^Enter correct password$")
    public void enterCorrectPassword() {
        UserPage.enterPassword(UserPage.correctPassword);
    }

    @And("^Enter correct username$")
    public void enterCorrectUsername() {
        UserPage.enterUsername(UserPage.correctUsermame);
    }

    @And("^Enter uncorrect password$")
    public void enterUncorrectPassword() {
        UserPage.enterPassword(UserPage.uncorrectPassword);
    }

    @And("^Check the fail login$")
    public void checkTheFailLogin() {
        UserPage.controllStatusMessage(UserPage.statusMessageFailed);
    }

    @And("^Check the success login$")
    public void checkTheSuccessLogin() {
        UserPage.controllStatusMessage(UserPage.statusMessageSuccess);
    }
}