package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class TicketStepDefs {
    @Given("from RIX to SFO")
    public void set_airport() {

    }

    @When("we are buying ticket")
    public void buy_ticket() {

    }

    @Then("flight route:")
    public void select_airport(Map<String, String> params) {

    }

    @Then("passenger Nr. {int} personal information is:")
    public void type_personal_info(Map<String, String> params) {

    }

    @Then("travel date is:")
    public void select_date(Map<String, String> params) {

    }

    @Then("destination is:")
    public void check_destination(Map<String, String> params) {

    }

    @Then("ticket price is:")
    public void check_price(Map<String, String> params) {

    }

    @Then("seat number for passenger Nr. {int} is:")
    public void select_seat(Map<String, Integer> params) {

    }

    @Then("successful order message is:")
    public void check_message(String text) {

    }
}
