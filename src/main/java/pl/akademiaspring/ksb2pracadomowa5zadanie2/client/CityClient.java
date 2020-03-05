package pl.akademiaspring.ksb2pracadomowa5zadanie2.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.akademiaspring.ksb2pracadomowa5zadanie2.model.CityDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CityClient {

    private RestTemplate restTemplate;


    public CityClient() {
        this.restTemplate = new RestTemplate();
    }


    public List<CityDto> getCitiesByNameList(String cityName) {
        CityDto[] cityDtosTable = restTemplate.getForObject(
                "https://www.metaweather.com/api/location/search/?query=" + cityName,
                CityDto[].class);

        if(cityDtosTable != null)
            return Arrays.asList(cityDtosTable);
        else
            return new ArrayList<>();
    }
}
