package steps.elements;

import BaseUtility.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import pages.elements.textBoxPage;

public class textBoxSteps extends BaseClass {
    public BaseClass base;
    public pages.elements.textBoxPage TextBoxPage;


    public textBoxSteps(BaseClass base) throws Exception {
        this.base = base;
        TextBoxPage = new textBoxPage(base.driver);
    }

        @Given("I am on the Landing Page {string}")
    public void iAmOnTheLandingPage(String arg0) {
        base.driver.navigate().to(arg0);
    }

    @When("I click on click on Elements")
    public void iClickOnClickOnElements() {
   // TextBoxPage.Elements();
    }

    @And("I click on Text Box link")
    public void iClickOnTextBoxLink() {
        TextBoxPage.TextBox();
    }
    @And("I enter First Name {string}")
    public void iEnterFirstName(String arg0) {
        TextBoxPage.Enter_FirstNameField(arg0);
    }

    @And("I enter Email Address {string}")
    public void iEnterEmailAddress(String arg0) {
        TextBoxPage.Enter_userEmail(arg0);
    }

    @And("I enter Current Address {string}")
    public void iEnterCurrentAddress(String arg0) {
        TextBoxPage.CurrentAddress(arg0);
    }

    @And("I enter Permanent Address {string}")
    public void iEnterPermanentAddress(String arg0) {
        TextBoxPage.PermanetAddress(arg0);
    }

    @And("I click Submit")
    public void iClickSubmit() {
        System.out.println("Last Test");
        TextBoxPage.Submit();
      //  TextBoxPage.Submit();
    }

    @Then("details are submitted successfully")
    public void detailsAreSubmitedSuccessfully() {
        System.out.println("Last Test");
    }

}
