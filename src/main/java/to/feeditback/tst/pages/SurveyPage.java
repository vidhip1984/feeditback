package to.feeditback.tst.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import to.feeditback.tst.utility.Utility;

import java.sql.Driver;
import java.time.Duration;

public class SurveyPage extends Utility {

    private static final Logger log = LogManager.getLogger(SurveyPage.class.getName());

    //Constructor for Pagefactory to initialize an object
    public SurveyPage() {
        PageFactory.initElements(driver, this);
    }

    //Finding xpath for Not got a code? webelement
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Not got a code?')]")
    WebElement notGotACodeLink;
    //Finding feedback code field from webpage
    @CacheLookup
    @FindBy(xpath = "//input[@autocapitalize='none'and @autocomplete='on']")
    WebElement feedbackCodeField;

    //Finding next button from webpage
    @CacheLookup
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[1]")
    WebElement nextButton;
    //Finding Invalid PIN message from webpage
    @CacheLookup
    @FindBy(className = "validationErrorMessage")
    WebElement invalidPinMessage;

    //This method will click on Not got a code?
    public void clickOnNotGotACodeLink() {
        try {
            clickOnElement(notGotACodeLink);
        } catch (Exception e) {
            clickOnElement(notGotACodeLink);
        }
        log.info("Clicking on Not got a code link : " + notGotACodeLink.toString());

    }

    //This method will enter code into enter your code field
    public void enterTextToFeedbackCodeField(String code) {
        sendTextToElement(feedbackCodeField, code);
    }

    //This method will click on next button
    public void clickOnNExtButton() {
        clickOnElement(nextButton);
    }

    //This method will get error message
    public String getInvaliPinMessage() {
        return getTextFromElement(invalidPinMessage);
    }
}


