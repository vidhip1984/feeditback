package to.feeditback.tst.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import to.feeditback.tst.propertyreader.PropertyReader;
import to.feeditback.tst.utility.Utility;

import java.io.IOException;

public class Hooks extends Utility {
    //This method will execute before each scenario
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }

    //This method will execute After each scenario
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();

    }
}
