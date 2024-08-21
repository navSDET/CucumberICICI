package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefination.CommonComponent.driver;

public class SeleniumBase
{
    static WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

    public static void waitUntilClickable(WebElement element)
    {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));
           }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public  static void hightlightElemet(WebElement element)
    {
        try
        {
            JavascriptExecutor jse= (JavascriptExecutor) driver;
            jse.executeScript("argument[0].setAttribute('style',background:yellow;border:2px solid red');",element);
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void waitUntilVisible(WebElement element)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

}
