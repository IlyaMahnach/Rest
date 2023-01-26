import attraction.Cities;
import attraction.Sight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SightsController {

    private SightsRepository sightsRepository;

    @Autowired
    public SightsController(SightsRepository sightsRepository) {
        this.sightsRepository = sightsRepository;
    }

    @GetMapping("/sight/all")
    public List<Sight> allCities() {
        return sightsRepository.findAll();
    }

    @DeleteMapping("/sight/1")
    public void deleteCities(@PathVariable(name = "1") Sight sight) {
        sightsRepository.delete(sight);
    }
}
