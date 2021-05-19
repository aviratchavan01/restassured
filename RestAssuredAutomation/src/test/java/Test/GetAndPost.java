package Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class GetAndPost {
	
	//@Test
	public void testGet()
	{
		baseURI="https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).
		body("data[1].first_name",equalTo("Lindsay")).
		body("data.first_name",hasItems("George","Lindsay"));
	}







@Test

public void testpost(){

	Map<String, Object> map=new HashMap<String, Object>();
			
	map.put("name","Raghav");
	map.put("Job", "Teacher");
	
	JSONObject request=new JSONObject(map);
	
	System.out.println(request.toJSONString());
	

}
}