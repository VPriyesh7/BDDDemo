package api.cucumber.steps;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitionsForScenarioWithExample {
    private WebDriver driver;
    @Given("User is on Home page")
    public void User_is_on_Home_page() throws Throwable{
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^User Navigate to logIn page$")
    public void User_Navigate_to_logIn_page() throws Throwable {
        System.out.println("User_Navigate_To_LogIn_Page");
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_enters_and(String username, String password) throws Throwable {
        System.out.println("User name is " + username + "password is " + password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void Message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }
}
