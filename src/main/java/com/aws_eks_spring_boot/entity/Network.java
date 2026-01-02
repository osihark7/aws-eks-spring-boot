package com.aws_eks_spring_boot.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Network {
	private int id;
    private String name;
    @JsonProperty("background_img")
    private String backgroundImg;
    @JsonProperty("logo_img")
    private String logoImg;
    private List<Object> sponsors;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBackgroundImg() {
		return backgroundImg;
	}
	public void setBackgroundImg(String backgroundImg) {
		this.backgroundImg = backgroundImg;
	}
	public String getLogoImg() {
		return logoImg;
	}
	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}
	public List<Object> getSponsors() {
		return sponsors;
	}
	public void setSponsors(List<Object> sponsors) {
		this.sponsors = sponsors;
	}
    
}
