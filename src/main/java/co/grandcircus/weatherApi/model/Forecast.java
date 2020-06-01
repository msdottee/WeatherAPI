package co.grandcircus.weatherApi.model;

public class Forecast {
	
	private String productionCenter;
	private Location location;
	private ForecastPeriod time;
	private DailyWeather data;
	
	public String getProductionCenter() {
		return productionCenter;
	}
	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ForecastPeriod getTime() {
		return time;
	}
	public void setTime(ForecastPeriod time) {
		this.time = time;
	}
	public DailyWeather getData() {
		return data;
	}
	public void setData(DailyWeather data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WhereForecastWasProcduced [productionCenter=" + productionCenter + ", location=" + location
				+ ", forecastPeriod=" + time + ", dailyWeather=" + data + "]";
	}
	

}
