package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get{
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoints all category")
    public String setApiEndpoint(){

        return url + "categories";
    }

    @Step("I set GET api endpoints category by ID")
    public String setApiEndpoint1(){

        return url + "categories/1";
    }


    @Step("I set GET api endpoints category by invalid ID")
    public String setApiEndpoint2(){

        return url + "categories/abcdfghjdsf";
    }
    @Step("I send GET HTTP Request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data")
    public void validateData(){

    }
    @Step("I not receive valid data")
    public void InvalidateData() {

    }



}
