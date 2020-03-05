package pl.akademiaspring.ksb2pracadomowa5zadanie2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.akademiaspring.ksb2pracadomowa5zadanie2.client.CityClient;
import pl.akademiaspring.ksb2pracadomowa5zadanie2.model.CityDto;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cities")
public class CityController {

    private CityClient cityClient;

    @Autowired
    CityController(
            CityClient cityClient
    ) {
        this.cityClient = cityClient;
    }


    @GetMapping(params = {"name"})
    public ResponseEntity<List<CityDto>> getCitesByName(@RequestParam("name") String cityName) {
        List<CityDto> cityDtoList = cityClient.getCitiesByNameList(cityName);
        return new ResponseEntity<>(cityDtoList, HttpStatus.OK);
    }
}
