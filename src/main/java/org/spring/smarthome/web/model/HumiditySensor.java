package org.spring.smarthome.web.model;

public class HumiditySensor {
	private final String location;
	private final int temperature;
	
	public HumiditySensor(String loc, int temp){
		this.location = loc;
		this.temperature = temp;
	}

	public String getLocation() {
		return location;
	}

	public int getTemperature() {
		return temperature;
	}
}
