package com.aws_eks_spring_boot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aws_eks_spring_boot.resultDTO.GenderizeResponse;

@Service
public class GenderizeService {

    private static final String GENDERIZE_URL =
            "https://api.genderize.io?name={name}";

    private final RestTemplate restTemplate;

    public GenderizeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GenderizeResponse getGenderByName(String name) {
        return restTemplate.getForObject(
                GENDERIZE_URL,
                GenderizeResponse.class,
                name
        );
    }
}

