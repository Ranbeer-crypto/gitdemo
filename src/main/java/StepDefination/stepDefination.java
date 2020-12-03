package StepDefination;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.junit.runner.RunWith;

// @RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on net banking login page$")
    public void user_is_on_net_banking_login_page() throws Throwable {
      System.out.println("i am running");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
       //code to login
    	 System.out.println("i am login");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       //home page validation
    	 System.out.println("i am populated");
    }

    @And("^cards are displaying$")
    public void cards_are_displaying() throws Throwable {
       //card validation
    }

}