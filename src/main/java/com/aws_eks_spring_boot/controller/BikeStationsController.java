package com.aws_eks_spring_boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws_eks_spring_boot.StationsResponse;
import com.aws_eks_spring_boot.Utils.Constants;


@RestController
@RequestMapping("/api")
public class BikeStationsController {

	@GetMapping("/stations")
    public ResponseEntity<StationsResponse> getStations() {
		System.out.println("Bike Station get..");
        StationsResponse response = Constants.restTemplate.getForObject(Constants.PUBLI_BIKE_URL, StationsResponse.class);
        return ResponseEntity.ok(response);
    }
}
