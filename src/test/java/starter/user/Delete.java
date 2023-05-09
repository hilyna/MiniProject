package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete{

    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoint")
    public String setDeleteApiEndpoints(){
        return url + "categories/1";
    }

    @Step("I send DELETE HTTP request")
    public void setDelete(){

        SerenityRest.given().delete(setDeleteApiEndpoints());
    }
    @Step("I receive valid HTTP response code 200 for delete")
    public void validateHttpResponse200(){

        restAssuredThat(response -> response.statusCode(200));
    }
}
