package services;

import attraction.Cities;
import attraction.Sight;
import dao.CitiesDao;

import java.util.List;

public class CitiesService {

    private CitiesDao citiesDao = new CitiesDao();

    public CitiesService() {
    }

    public Cities findCities(int id) {
        return citiesDao.findById(id);
    }

    public void saveCities(Cities cities) {
        citiesDao.save(cities);

    }

    public void deleteCities(Cities cities) {
        citiesDao.delete(cities);
    }

    public void updateCities(Cities cities) {
        citiesDao.update(cities);
    }

    public List<Cities> findAll() {
        return citiesDao.findAll();
    }

    public Sight findSightById(int id) {
        return citiesDao.findSightById(id);
    }


}