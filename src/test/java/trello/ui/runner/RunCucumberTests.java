package trello.ui.runner;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import trello.ui.core.DriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
//                "html:reports/html/index.html",
//                "de.monochromata.cucumber.report.PrettyReports:reports/cucumber",
                "json:reports/cucumber-reports/cucumber.json",
                "rerun:reports/rerun/rerun.txt"
        },

        features = "src/test/resources/features-ui",
        glue = "trello.ui",
        tags = "@outline"
)
public class RunCucumberTests {
        @AfterClass
        public static void close(){
                DriverManager.getInstance().getDriver().quit();
        }

}
