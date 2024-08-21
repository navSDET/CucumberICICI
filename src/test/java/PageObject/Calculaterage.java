package PageObject;

import Base.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculaterage
{
    @FindBy(xpath = "//input[@id='amount_input_emi_calc']")
    private WebElement LoanAmount;

    @FindBy(xpath = "//input[@id='roi_input_emi_calc']")
    private WebElement InterestRate;

    @FindBy(xpath = "//div[@class='tenure-months-input pos-rel']//input")
    private WebElement Year;

    public Calculaterage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void inputLoanAmount(int loan)
    {
        SeleniumBase.waitUntilClickable(LoanAmount);
        SeleniumBase.waitUntilVisible(LoanAmount);
        LoanAmount.click();
        LoanAmount.sendKeys(Keys.BACK_SPACE);
        LoanAmount.clear();
//        SeleniumBase.hightlightElemet(LoanAmount);
        LoanAmount.sendKeys(String.valueOf(loan));

    }

    public void inputInterestRate(double ROI) throws InterruptedException {
        SeleniumBase.waitUntilClickable(InterestRate);
        SeleniumBase.waitUntilVisible(InterestRate);
        InterestRate.click();
        InterestRate.sendKeys(Keys.BACK_SPACE);
        InterestRate.clear();
        Thread.sleep(3000);
//        SeleniumBase.hightlightElemet(InterestRate);
        InterestRate.sendKeys(String.valueOf(ROI));

    }

    public void inputTenure(int tenure) throws InterruptedException {
        SeleniumBase.waitUntilClickable(Year);
        SeleniumBase.waitUntilVisible(Year);
        Year.clear();
        Thread.sleep(3000);
//        SeleniumBase.hightlightElemet(Year);
        Year.sendKeys(String.valueOf(tenure));
    }

}
