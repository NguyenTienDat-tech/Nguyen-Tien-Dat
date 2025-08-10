import java.util.ArrayList;
public class Pet {
    private ArrayList<Pet> getArrayList = new ArrayList<>();
    private final double overWeight = 30;
    private String name;
    private double weight;
    private String species;

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }



    public String getName() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printInfor() {
        System.out.println("ten loai: " + this.name + " loai: " + this.species + " can nang: " + this.weight);
    }

    public boolean inOverweight() {
        if(this.weight > 10) {
            return true;
        }
        return false;
    }

    public String getBasicInfo() {
        return name + " " + species;
    }


}
