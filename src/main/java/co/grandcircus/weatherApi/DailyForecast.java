package co.grandcircus.weatherApi;

public class DailyForecast {
	
	private String day;
	private String textForecast;
	
	public DailyForecast(String day, String textForecast) {
		super();
		this.day = day;
		this.textForecast = textForecast;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTextForecast() {
		return textForecast;
	}
	public void setTextForecast(String textForecast) {
		this.textForecast = textForecast;
	}
	

}
