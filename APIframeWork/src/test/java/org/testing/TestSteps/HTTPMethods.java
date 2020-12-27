package org.testing.TestSteps;

import java.util.Properties;

import static com.jayway.restassured.RestAssured.*;
import  com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
}
	
public Response PostRequest(String bodyData, String URIName)
{
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodyData)
	.when()
	.post(pr.getProperty(URIName));
	return res;
}
}
