import attraction.Cities;
import attraction.Sight;
import services.CitiesService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        CitiesService citiesService = new CitiesService();
        Cities cities = new Cities("Томск",556500, false, "Россия");
        citiesService.saveCities(cities);
        Sight chehov = new Sight("Чехов", 2004, "Необычная скульптура писателя.", "Памятник");
        chehov.setCities(cities);
        cities.addSight(chehov);
        Sight woodruble = new Sight("Деревянный рубль", 2008, "Монумент из дерева, посвященный национальной валюте.", "Памятник");
        woodruble.setCities(cities);
        cities.addSight(woodruble);
        citiesService.updateCities(cities);
//        CitiesService citiesService = new CitiesService();
//        Cities cities = new Cities("Masha",26);
//        citiesService.saveCities(cities);
//        Sight ferrari = new Sight("Ferrari", "red");
//        cities.addSight(ferrari);
//        Sight ford = new Sight("Ford", "black");
//        ford.setCities(cities);
//        cities.addSight(ford);
//        citiesService.updateCities(cities);
//        cities.setName("Sasha");
//        citiesService.updateCities(cities);
    }
}