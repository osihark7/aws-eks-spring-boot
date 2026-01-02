package com.aws_eks_spring_boot.Utils;

import org.springframework.web.client.RestTemplate;

public class Constants {

	public final static RestTemplate restTemplate = new RestTemplate();
	public static final String PUBLI_BIKE_URL = "https://api.publibike.ch/v1/public/partner/stations";
}
