package stepdefination;

import base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {
    @Before
    public void setup(){
      driver = new ChromeDriver();
      driver.manage().window().maximize();
    }
    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed())
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//        scenario.attach(src, "image/png", "screenshot");
            scenario.attach(src, "image/png", "screenshot");
//        scenario.log("This is my failed test case screenshot");
            scenario.log("This is failed test case screenshot");
//        scenario.log("scenario" + scenario.getName());
            scenario.log("Scenario name is " + scenario.getName());
        }//if
        driver.close();
    }//teardown
}
