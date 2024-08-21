package PageObject;

import Base.SeleniumBase;
import Utilities.Configuration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefination.CommonComponent.driver;

public class LandingPage {

//    @FindBy(how = How.XPATH,using= "//input[@id='search-chatInput']") private WebElement inputProduct;
   @FindBy(xpath = "//input[@id='search-chatInput']") private WebElement inputProduct;
   @FindBy(xpath = "//div[@id='panelCarousel']//div[text()='Calculator']") private WebElement buttonCalculator;

   public LandingPage(WebDriver driver){
       PageFactory.initElements(driver, this);
   }


   public void openApplication()
   {
       driver.get(Configuration.getPropertyFromKey("URL"));
   }

   public void searchProduct(String product) throws InterruptedException {
       SeleniumBase.waitUntilClickable(inputProduct);
       SeleniumBase.waitUntilVisible(inputProduct);
//       SeleniumBase.hightlightElemet(inputProduct);
       inputProduct.sendKeys(product);
       Thread.sleep(3000);
       inputProduct.sendKeys(Keys.ENTER);

   }
   public void clickCalculatorButton() throws InterruptedException {
       SeleniumBase.waitUntilVisible(buttonCalculator);
       SeleniumBase.waitUntilClickable(buttonCalculator);
//       SeleniumBase.hightlightElemet(buttonCalculator);
       buttonCalculator.click();
       Thread.sleep(3000);
   }

   public void navigateToCalculatorPage(int id)
   {
       Configuration.switchToChildWindow(id);
   }
}
