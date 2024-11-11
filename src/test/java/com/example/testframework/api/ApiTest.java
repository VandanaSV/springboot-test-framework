package com.example.testframework.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApiTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void testGetUserDetails() {
        Response response = apiService.getUserDetails("123");
        assertEquals(200, response.getStatusCode());
        // Additional assertions on the response body
    }
}

