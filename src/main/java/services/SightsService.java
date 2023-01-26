package services;

import attraction.Cities;
import attraction.Sight;
import dao.CitiesDao;
import dao.SightsDao;

import java.util.List;
public class SightsService {
    private SightsDao sightsDao = new SightsDao();

    public SightsService() {
    }

    public Sight findSight(int id) {
        return sightsDao.findById(id);
    }

    public void saveSight(Sight sight) {
        sightsDao.save(sight);

    }

    public void deleteSight(Sight sight) {
        sightsDao.delete(sight);
    }

    public void updateSight(Sight sight) {
        sightsDao.update(sight);
    }

    public List<Sight> findAll() {
        return sightsDao.findAll();
    }

    public Sight findSightById(int id) {
        return sightsDao.findSightById(id);
    }



}
