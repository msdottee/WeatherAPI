package co.grandcircus.weatherApi.model;

public class Location {

	private String areaDescription;
	private String latitude;
	private String Longitude;
	
	public String getAreaDescription() {
		return areaDescription;
	}
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	
	@Override
	public String toString() {
		return areaDescription;
	}
	
}
