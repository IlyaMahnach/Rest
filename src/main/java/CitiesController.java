import attraction.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitiesController {

    private CitiesRepository citiesRepository;

    @Autowired
    public CitiesController(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    @GetMapping("/cities/all")
    public List<Cities> allCities() {
        return citiesRepository.findAll();
    }
}