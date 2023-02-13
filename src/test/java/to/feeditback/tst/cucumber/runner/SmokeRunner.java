package to.feeditback.tst.cucumber.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",    //feature file path from content root
        glue = "to/feeditback/tst/cucumber",                 //cucumber path from source root for step def file
        plugin = {"pretty","html:target/cucumber-report/cucumber.html",//I have added plugin to specify different formatting options for outpu report
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucumber.json"},
        tags ={"@smoke"}


)
public class SmokeRunner {
    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.9");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }

}
