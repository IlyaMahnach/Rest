package attraction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "cities")
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean metro;
    private String country;
    @Column(name = "name")
    private String name;

    private int population;

    @OneToMany(mappedBy = "cities", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)

    private List<Sight> sights;

    public Cities() {
    }

    public Cities(String name, int population, boolean metro, String country ) {
        this.name = name;
        this.population = population;
        this.metro = metro;
        this.country = country;
        sights = new ArrayList<>();
    }

    public void addSight(Sight sight) {
        sight.setCities(this);
        sights.add(sight);
    }

    public void removeSight(Sight sight) {
        sights.remove(sight);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int age) {
        this.population = population;
    }

    public void setMetro(boolean metro){
        this.metro = metro;
    }

    public boolean getMetro(){
        return metro;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public List<Sight> getSights() {
        return sights;
    }

    public void setSights(List<Sight> sights) {
        this.sights = sights;
    }

    @Override
    public String toString() {
        return "sight.Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", metro=" + metro +
                ", country=" + country +'\'' +
                '}';
    }
}
