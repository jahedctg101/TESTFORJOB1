package stepdefination;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.inPatientWard;
import pages.openHRM_LogIN;

public class openHrmLogIn extends Base {
    openHRM_LogIN logIN = new openHRM_LogIN();
    inPatientWard ipw = new inPatientWard();
    @Given("employee is in landing page")
    public void employee_is_in_landing_page() {
        // Write code here that turns the phrase above into concrete actions
       navigateURL("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Given("employee enter username and password")
    public void employee_enter_username_and_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        logIN.validCredential("Admin","Admin123");
        Thread.sleep(3000);
        ipw.clickOninpatient();
    }

//    @Given("employee enter valid password")
//    public void employee_enter_valid_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @When("employee click on login button")
    public void employee_click_on_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        logIN.clickOnLoginButton();
    }

    @Then("Verify employee login successfully")
    public void verify_employee_login_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login Successfuly");
    }
}
