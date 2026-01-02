package com.aws_eks_spring_boot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {
	private int id;
    private String name;
    @JsonProperty("ebike_battery_level")
    private Double ebikeBatteryLevel;
    private VehicleType type;
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
	public Double getEbikeBatteryLevel() {
		return ebikeBatteryLevel;
	}
	public void setEbikeBatteryLevel(Double ebikeBatteryLevel) {
		this.ebikeBatteryLevel = ebikeBatteryLevel;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
    
    
}
