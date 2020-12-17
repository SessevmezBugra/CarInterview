package com.interview.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.http.HttpStatus.OK;


import com.interview.constant.CarConstants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void createCar() {
        final ResponseEntity<String> carResponse = testRestTemplate.postForEntity(
                "/car?carType=" + CarConstants.SEDAN_TYPE, null, String.class);
        assertNotNull(carResponse);
        final String responseSentence = carResponse.getBody();
        assertEquals(carResponse.getStatusCode(), OK);
        assertEquals(responseSentence, CarConstants.SEDAN_TYPE + " Car has produced.");
    }
}
