package com.example.testframework.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public Response getUserDetails(String userId) {
        return RestAssured
                .given()
                .baseUri("https://api.your-service.com")
                .get("/users/" + userId);
    }
}

