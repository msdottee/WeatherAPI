package co.grandcircus.weatherApi.model;

import java.util.List;

public class DailyWeather {
	
	private List<String> temperature;
	private List<String> weather;
	private List<String> text;

	public DailyWeather() {
		
	}
	
	public DailyWeather(List<String> temperature, List<String> weather) {
		super();
		this.temperature = temperature;
		this.weather = weather;
	}
	
	public List<String> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<String> temperature) {
		this.temperature = temperature;
	}
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	
	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "DailyWeather [temperature=" + temperature + ", weather=" + weather + "]";
	}

}
