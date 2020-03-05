package pl.akademiaspring.ksb2pracadomowa5zadanie2.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.akademiaspring.ksb2pracadomowa5zadanie2.client.WeatherClient;
import pl.akademiaspring.ksb2pracadomowa5zadanie2.model.WeatherDto;

@CrossOrigin
@RestController
@RequestMapping("/weather")
public class WeatherController {

    private WeatherClient weatherClient;

    WeatherController(
            WeatherClient weatherClient
    ) {
        this.weatherClient = weatherClient;
    }


    @GetMapping("/{woeid}")
    public ResponseEntity<WeatherDto> getWeatherInCityByWoeid(@PathVariable Integer woeid) {
        WeatherDto weatherDto = weatherClient.getWeatherDtoByWoeid(woeid);
        return new ResponseEntity<>(weatherDto, HttpStatus.OK);
    }
}
