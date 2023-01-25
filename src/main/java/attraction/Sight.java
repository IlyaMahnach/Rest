package attraction;

import javax.persistence.*;

@Entity
@Table(name = "sight")
public class Sight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
    private String type;
    @Column (name = "name")
    private String name;

    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Cities cities;

    public Sight() {
    }

    public Sight(String name, int year, String description, String type) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.type = type;
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

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }
    public Cities getCities() {
        return cities;
    }

    public void setCities(Cities cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return description + " " + name + "" + type;

    }
}