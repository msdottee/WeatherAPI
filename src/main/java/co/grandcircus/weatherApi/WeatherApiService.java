package co.grandcircus.weatherApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.weatherApi.model.Forecast;

@Service
public class WeatherApiService {
	
	private RestTemplate rest = new RestTemplate();
	
	public Forecast getForecast() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3982&lon=-83.3725&FcstType=json";
		Forecast forecast = rest.getForObject(url, Forecast.class);
		return forecast;
		
	}

}
