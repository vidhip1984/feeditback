package to.feeditback.tst.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import to.feeditback.tst.utility.Utility;

public class SeachForVenuePage extends Utility {
    //To genetarate a log
    private static final Logger log = LogManager.getLogger(SeachForVenuePage.class.getName());

    //Constructor for Pagefactory to initialize an object
    public SeachForVenuePage() {
        PageFactory.initElements(driver, this);
    }

    //Finding a search for venue message from web page
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Search for venue')]")
    WebElement searchForVenutText;

    // created a method to get text from webelement search for venue message from webpage
    public String getSearchForVenutText() {
        log.info("Search for a venue text  " + searchForVenutText.toString());
        return getTextFromElement(searchForVenutText);
    }

}
