package to.feeditback.tst.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import to.feeditback.tst.pages.SeachForVenuePage;
import to.feeditback.tst.pages.SurveyPage;

public class SurveySteps {

    @Given("^I am on survey page$")
    public void iAmOnSurveyPage() {
    }
    @When("^I click on Not got a code\\?$")
    public void iClickOnNotGotACode() {
        //This method will click on Not got a code?
        new SurveyPage().clickOnNotGotACodeLink();
    }

    @Then("^I should be navigated to Search for venue page successfully$")
    public void iShouldBeNavigatedToSearchForVenuePageSuccessfully() {
        // created a method to get text from webelement search for venue message from webpage
        //used Assert to validate expected and actual result
        Assert.assertEquals("Search for venue",new SeachForVenuePage().getSearchForVenutText());
    }

    @When("^When I enter a code \"([^\"]*)\" into a feedback code text field$")
    public void whenIEnterACodeIntoAFeedbackCodeTextField(String code)throws InterruptedException  {
        Thread.sleep(3000);
        //This method will enter code into enter your code field
        new SurveyPage().enterTextToFeedbackCodeField(code);
    }

    @Then("^Next button should be highlighted and I should be able to click on next buttton$")
    public void nextButtonShouldBeHighlightedAndIShouldBeAbleToClickOnNextButtton() {
        //This method will click on next button
        new SurveyPage().clickOnNExtButton();
    }
    @And("^An invalid PIN was supplied message should appear When entered code is invalid$")
    public void anInvalidPINWasSuppliedMessageShouldAppearWhenEnteredCodeIsInvalid() {
        //used Assert to validate expected and actual result
        Assert.assertEquals("An invalid PIN was supplied",new SurveyPage().getInvaliPinMessage());
    }

}
