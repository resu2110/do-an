package org.spring.smarthome.web.model;

public class LightSensor {
	private final String position;
	private final int photonValue;
	
	public LightSensor(String post, int photon){
		this.position = post;
		this.photonValue = photon;
	}

	public String getPosition() {
		return position;
	}

	public int getPhotonValue() {
		return photonValue;
	}	
}
