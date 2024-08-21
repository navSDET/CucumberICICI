package StepDefination;

import PageObject.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefination.CommonComponent.driver;

public class LandingStepPage
{
    private final LandingPage landingPage;

    public LandingStepPage(){
        landingPage=new LandingPage(driver);
    }

    @Given("^User enters Application URL$")
    public void user_enters_application_url() {
        landingPage.openApplication();
    }
    @When("^User enters (.+) in search box$")
    public void user_enters_car_loan_in_search_box(String product) throws InterruptedException {
       landingPage.searchProduct(product);
    }
    @And("^User clicks on calculator button$")
    public void user_clicks_on_calculator_button() throws InterruptedException {
        landingPage.clickCalculatorButton();
    }
    @Then("^User navigates to (.+) page$")
    public void user_navigates_to_calculator_page(int id) {
        landingPage.navigateToCalculatorPage(id);
    }

}
