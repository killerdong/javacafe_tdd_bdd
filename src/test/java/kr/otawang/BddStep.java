package kr.otawang;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BddStep {
    String input;
    int actualAnswer;

    @Given("^빈 문자열$")
    public void inputIsEmpty() {
        input = "";
    }

    @Given("^([^빈].*) 문자열$")
    public void inputIsString(String str) {
        input = str;
    }


    @When("^문자열 계산기에서 입력 받았을 받을 때$")
    public void stringCalculatorGetInput() {
        StringCalculator cal = new StringCalculator();
        actualAnswer = cal.add(input);
    }

    @Then("^([0-9]+) 값이 나온다.$")
    public void stringCalculator(int expectedAnswer) {
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
