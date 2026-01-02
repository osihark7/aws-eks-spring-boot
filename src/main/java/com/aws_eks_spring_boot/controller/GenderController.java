package com.aws_eks_spring_boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws_eks_spring_boot.resultDTO.GenderizeResponse;
import com.aws_eks_spring_boot.service.GenderizeService;

@RestController
@RequestMapping("/api")
public class GenderController {

	private final GenderizeService genderizeService;

	public GenderController(GenderizeService genderizeService) {
		this.genderizeService = genderizeService;
	}

	@GetMapping("/gender")
	public ResponseEntity<GenderizeResponse> getGender(@RequestParam String name) {

		GenderizeResponse response = genderizeService.getGenderByName(name);
		return ResponseEntity.ok(response);
	}

}
