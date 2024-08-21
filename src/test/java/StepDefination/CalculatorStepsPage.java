package StepDefination;

import PageObject.Calculaterage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static StepDefination.CommonComponent.driver;


public class CalculatorStepsPage
{
    private final Calculaterage calculatorpage;

    public CalculatorStepsPage()
    {
        calculatorpage = new Calculaterage(driver);
    }

    @And("^User enters loan (.+)$")
    public void user_enters_loan_amount(int loanAmount)
    {
        calculatorpage.inputLoanAmount(loanAmount);
    }
    @And("^User Enters rate of (.+)$")
    public void user_enters_rate_of_interest(double rate) throws InterruptedException {
     calculatorpage.inputInterestRate(rate);
    }
    @And("^User enters tenure as (.+)$")
    public void user_enters_tenure(int tenure) throws InterruptedException {
        calculatorpage.inputTenure(tenure);
    }
    @Then("^User prints respective values$")
    public void user_prints_respective_values()
    {

    }

}
