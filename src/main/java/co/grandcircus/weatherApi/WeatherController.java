package co.grandcircus.weatherApi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.weatherApi.model.Forecast;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherApiService weatherApi;
	
	@RequestMapping("/")
	public String showWeatherForecast(Model model) {
		Forecast forecast = weatherApi.getForecast();
		List<DailyForecast> dailyForecastList = new ArrayList<>();
		for (int i = 0; i < forecast.getData().getText().size(); i++) {
			DailyForecast dailyForecast = new DailyForecast(
					forecast.getTime().getStartPeriodName().get(i),
					forecast.getData().getText().get(i));
			dailyForecastList.add(dailyForecast);
		}
		
		model.addAttribute("forecast", forecast);
		model.addAttribute("dailyForecastList", dailyForecastList);
		
		return "index";
	}
	

}
