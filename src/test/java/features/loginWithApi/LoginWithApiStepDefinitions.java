package test.java.features.loginWithApi;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.pages.LoginPageApi;

public class LoginWithApiStepDefinitions {

    @When("^Enter correct username and password with api$")
    public void enterCorrectUsernameAndPasswordWithApi() {
        LoginPageApi.setup();
        LoginPageApi.login(LoginPageApi.correctUsername, LoginPageApi.correctPasword);
    }

    @Then("^Check the success login with api$")
    public void checkTheSuccessLoginWithApi() {
        LoginPageApi.control(LoginPageApi.succesResponse);
    }

    @When("^Enter uncorrect username and correct password with api$")
    public void enterUncorrectUsernameAndCorrectPasswordWithApi() {
        LoginPageApi.setup();
        LoginPageApi.login(LoginPageApi.wwrongUsername, LoginPageApi.correctPasword);
    }

    @Then("^Check the fail login with api$")
    public void checkTheFailLoginWithApi() {
        LoginPageApi.control(LoginPageApi.failedResponse);
    }

    @When("^Enter correct username and uncorrect password with api$")
    public void enterCorrectUsernameAndUncorrectPasswordWithApi() {
        LoginPageApi.setup();
        LoginPageApi.login(LoginPageApi.correctUsername, LoginPageApi.wrongPassword);
    }

    @When("^Enter uncorrect username and uncorrect password with api$")
    public void enterUncorrectUsernameAndUncorrectPasswordWithApi() {
        LoginPageApi.setup();
        LoginPageApi.login(LoginPageApi.wwrongUsername, LoginPageApi.wrongPassword);
    }
}
