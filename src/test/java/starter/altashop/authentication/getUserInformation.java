package starter.altashop.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class getUserInformation {
    protected String url = "https://altashop-api.fly.dev/api/auth/";

    @Step("I set GET user api endpoints")
    public String iSetGETUserApiEndpoints(){
        return url + "info";
    }
    @Step("I send a GET request to the user API endpoints")
    public void iSendAGETRequestToTheUserAPIEndpoints(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6InNlbGEgcHV0cmkiLCJFbWFpbCI6InNlbGExMjNAZ21haWwuY29tIn0.DT0OGdYmlnfyr1_jUgnTewB2SMBlw-8dJip6ip6xTDU")
                .get(iSetGETUserApiEndpoints());
    }
    @Step("I receive valid HTTP response code 200 for get user information")
    public void iReceiveValidHTTPResponseCodeForGetUserInformation(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data of the user")
    public void iReceiveValidDataOfTheUser(){

    }

}
