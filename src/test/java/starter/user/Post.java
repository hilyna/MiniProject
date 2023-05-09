package starter.user;

import java.util.*;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Post{

    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST api endpoint new category")
    public String setPostApiEndpoint(){
        return url + "categories";

    }

    @Step("I set POST api endpoint invalid new category")
    public String setPostApiEndpoint1(){
        return url + "categories";

    }

    @Step("I set POST api endpoint")
    public void sendPostHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","gaming");
        requestBody.put("description","for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I set POST api endpoint invalid")
    public void sendPostHTTPRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama","Sony PS5");
        requestBody.put("deskripsi","play has no limits");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint1());
    }


    @Step("I receive Post valid HTTP response code 200")
    public void receiveValidHTTPResponsePost(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 500")
    public void receiveValidHTTPResponsePost1(){

        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I receive valid data post")
    public void ValidaData(){

    }

    @Step("I not receive valid data post")
    public void ValidDataNew(){

    }
}

