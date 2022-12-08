package step_definitions;


import io.cucumber.java.en.When;

public class basePageSteps {
    @When("I do something")
    public void DoSomething()
    {
        System.out.print("Hello, it looks like I'm working! Well done!");
    }

}
