package com.aws_eks_spring_boot;

import java.util.List;

import com.aws_eks_spring_boot.entity.Station;

public class StationsResponse {
	private List<Station> stations;
    public List<Station> getStations() { return stations; }
    public void setStations(List<Station> stations) { this.stations = stations; }
}
