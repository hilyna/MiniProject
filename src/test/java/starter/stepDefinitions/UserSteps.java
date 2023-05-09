package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;


public class UserSteps{
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Delete delete;

    @Given("I set GET api endpoints all category")
    public void setGetApiEndpoint() {
        get.setApiEndpoint();
    }

    @Given("I set GET api endpoints category by ID")
    public void setGetApiEndpoint1() {

        get.setApiEndpoint1();
    }

    @Given("I set GET api endpoints category by invalid ID")
    public void setGetApiEndpoint2() {
        get.setApiEndpoint2();
    }

    @When("I send GET HTTP Request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }

    @Then("I receive valid HTTP response code 400")
    public void receiveInvalidHttpResponse() {
        get.validateHttpResponseCode400();
    }

    @And("I receive valid data")
    public void receiveValidData() {
        get.validateData();

    }

    @And("I not receive valid data")
    public void InvalidData() {
        get.InvalidateData();

    }

    @Given("I set POST api endpoint new category")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }

    @Given("I set POST api endpoint invalid new category")
    public void setPostApiEndpoint1(){
        post.setPostApiEndpoint1();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHTTPRequest();
    }

    @When("I send POST HTTP request invalid")
    public void sendPostHTTPRequest1(){
        post.sendPostHTTPRequest1();
    }

    @Then("I receive Post valid HTTP response code 200")
    public void receiveValidHTTPResponse(){
        post.receiveValidHTTPResponsePost();
    }

    @Then("I receive valid HTTP response code 500")
    public void receiveValidHTTPResponse1(){
        post.receiveValidHTTPResponsePost1();
    }

    @And("I receive valid data post")
    public void ValidaData() {
        post.ValidaData();

    }
    @And("I not receive valid data post")
    public void ValidDataNew(){
        post.ValidDataNew();

    }

    @Given("I set DELETE api endpoint")
    public void setDeleteApiEndpoints(){
        delete.setDeleteApiEndpoints();
    }

    @When ("I send DELETE HTTP request")
    public void sendDelete(){
        delete.setDelete();
    }

    @Then ("I receive valid HTTP response code 200 for delete")
    public void validateHttpResponseCode200(){
        delete.validateHttpResponse200();
    }

}

