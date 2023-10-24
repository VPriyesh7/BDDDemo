package api.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;

public class PostStep {

    @Given("^user should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable{
        //System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
        throw new PendingException();
    }
    @When("^I type the message in the box$")
    public void i_type_the_message_in_the_box() {
        System.out.println("i_type_the_message_in_the_box");
    }
    @Then("^The message should get posted.$")
    public void the_message_should_get_posted() {
        System.out.println("the_message_should_get_posted");
    }
    @And("^Click on post Button$")
    public void click_on_post_button() {
        System.out.println("click_on_post_button");
    }
}






