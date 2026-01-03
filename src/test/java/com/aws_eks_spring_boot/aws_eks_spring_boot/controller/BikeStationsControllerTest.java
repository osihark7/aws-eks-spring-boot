package com.aws_eks_spring_boot.aws_eks_spring_boot.controller;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.aws_eks_spring_boot.StationsResponse;
import com.aws_eks_spring_boot.Utils.Constants;
import com.aws_eks_spring_boot.controller.BikeStationsController;

@WebMvcTest(BikeStationsController.class)
class BikeStationsControllerTest {

	@Autowired
	private MockMvc mockMvc;

	private MockedStatic<Constants> constantsMock;
	private RestTemplate mockRestTemplate;

	@BeforeEach
	void setUp() {
		mockRestTemplate = org.mockito.Mockito.mock(RestTemplate.class);
		constantsMock = mockStatic(Constants.class);
	}

	@AfterEach
	void tearDown() {
		constantsMock.close();
	}

	@Test
	void getStations_ReturnsOk() throws Exception {
		StationsResponse mockResponse = new StationsResponse();
		when(mockRestTemplate.getForObject(eq(Constants.PUBLI_BIKE_URL), eq(StationsResponse.class)))
				.thenReturn(mockResponse);
		mockMvc.perform(get("/api/stations")).andExpect(status().isOk());
	}
}
