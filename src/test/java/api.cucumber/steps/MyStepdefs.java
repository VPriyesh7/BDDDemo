package api.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("User should be logged in and should be present at its own wall")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("user_should_be_logged_in_and_should_be_present_at_its_own_wall");
    }
    @When("I type the message as {string} in the text box")
    public void i_type_the_message_as_in_the_text_box(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the message should get posted")
    public void the_message_should_get_posted() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User supply the youTube link as {string} in the text box")
    public void user_supply_the_you_tube_link_as_in_the_text_box(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("Click on the post button")
    public void click_on_the_post_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("Then video should get posted on the user wall")
    public void then_video_should_get_posted_on_the_user_wall() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("the video should have proper thumbnail.")
    public void the_video_should_have_proper_thumbnail() {
        // Write code here that turns the phrase above into concrete actions
    }
}
