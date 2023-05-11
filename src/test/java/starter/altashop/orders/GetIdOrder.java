package starter.altashop.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoint for order by id")
    public String iSetTheGETApiEndpointForOrderById(){
        return url + "orders/11369";
    }
    @Step("I send HTTP api GET request for order by id")
    public void iSendHTTPApiGETRequestForOrderById(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6InNlbGEgcHV0cmkiLCJFbWFpbCI6InNlbGExMjNAZ21haWwuY29tIn0.DT0OGdYmlnfyr1_jUgnTewB2SMBlw-8dJip6ip6xTDU")
                .get(iSetTheGETApiEndpointForOrderById());
    }

    @Step("I receive valid HTTP response code 200 for get id data order")
    public void iReceiveValidHTTPResponseCodeForGetIdDataOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for id order")
    public void iReceiveValidDataForIdOrder(){

    }
}
