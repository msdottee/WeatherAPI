package co.grandcircus.weatherApi.model;

import java.util.List;

public class ForecastPeriod {

	List<String> tempLabel;
	List<String> startPeriodName;
	
	public ForecastPeriod() {
		
	}
	
	public ForecastPeriod(List<String> tempLabel, List<String> startPeriodName) {
		super();
		this.tempLabel = tempLabel;
		this.startPeriodName = startPeriodName;
	}
	public List<String> getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(List<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	public List<String> getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	
	@Override
	public String toString() {
		return "ForecastPeriod [tempLabel=" + tempLabel + ", startPeriodName=" + startPeriodName + "]";
	}
	
}
