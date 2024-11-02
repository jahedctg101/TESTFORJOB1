package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"C:\\Batch2021-JUNE-SDET\\Intelij\\openHRM_Project1\\src\\test\\resources\\features"},
        glue = {"stepdefination"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }

)


    public class Runner {

    }

