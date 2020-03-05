package pl.akademiaspring.ksb2pracadomowa5zadanie2.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.akademiaspring.ksb2pracadomowa5zadanie2.model.WeatherDto;

@Controller
public class WeatherClient {

    private RestTemplate restTemplate;


    public WeatherClient() {
        this.restTemplate = new RestTemplate();
    }

    public WeatherDto getWeatherDtoByWoeid(Integer woeid) {
        return restTemplate.getForObject(
                "https://www.metaweather.com/api/location/" + woeid + "/",
                WeatherDto.class);
    }
}
