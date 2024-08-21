package StepDefination;


import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static StepDefination.CommonComponent.driver;

public class SetupTearDown {
    @Before
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

//        @After
//         public static void close(){
//            driver.quit;
//        }
}
