import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {

    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        // Write code here that turns the phrase above into concrete actions
        Calculator calc = new Calculator();
//        throw new io.cucumber.java.PendingException();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
//        Calculator calc = new Calculator();
        calc.push(int1);
        calc.push(int2);
        calc.push("+");
    }


    @Then("the result is {int}")
    public void the_result_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
