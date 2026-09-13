import java.sql.*;

public class Animals {


    private int animalId;
    private String microchipNumber;
    private String name;
    private int speciesId;
    private int breedId;
    private String sex_id;
    private Date date_of_birth;
    private Date estimated_birth_date;
    private String color;
    private double weight;
    private  int status_id;
    private  boolean sterilized;
    private  Date sterilization_date;
    private  Date intake_date;
    private Date found_date;
    private Date death_date;
    private Date created_at;
    private Date updated_at;
    private String description;
    private Boolean special_needs;

    public static void registerAnimal(){


    }

    public static void searchAnimal(){

    }

    public static void updateAnimal(){

    }

    public static void changeAnimalStatus(){

    }

    public static void getAnimalById() {

    }

    public static void getAllAnimals() {

    }


    public Animals() {
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getMicrochipNumber() {
        return microchipNumber;
    }

    public void setMicrochipNumber(String microchipNumber) {
        this.microchipNumber = microchipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(int speciesId) {
        this.speciesId = speciesId;
    }

    public int getBreedId() {
        return breedId;
    }

    public void setBreedId(int breedId) {
        this.breedId = breedId;
    }

    public String getSex_id() {
        return sex_id;
    }

    public void setSex_id(String sex_id) {
        this.sex_id = sex_id;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Date getEstimated_birth_date() {
        return estimated_birth_date;
    }

    public void setEstimated_birth_date(Date estimated_birth_date) {
        this.estimated_birth_date = estimated_birth_date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public Date getSterilization_date() {
        return sterilization_date;
    }

    public void setSterilization_date(Date sterilization_date) {
        this.sterilization_date = sterilization_date;
    }

    public Date getIntake_date() {
        return intake_date;
    }

    public void setIntake_date(Date intake_date) {
        this.intake_date = intake_date;
    }

    public Date getFound_date() {
        return found_date;
    }

    public void setFound_date(Date found_date) {
        this.found_date = found_date;
    }

    public Date getDeath_date() {
        return death_date;
    }

    public void setDeath_date(Date death_date) {
        this.death_date = death_date;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSpecial_needs() {
        return special_needs;
    }

    public void setSpecial_needs(Boolean special_needs) {
        this.special_needs = special_needs;
    }

    public Animals(int animalId, String microchipNumber, String name, int speciesId, int breedId, String sex_id, Date date_of_birth, Date estimated_birth_date, String color, double weight, int status_id, boolean sterilized, Date sterilization_date, Date intake_date, Date found_date, Date death_date, Date created_at, Date updated_at, String description, Boolean special_needs) {
        this.animalId = animalId;
        this.microchipNumber = microchipNumber;
        this.name = name;
        this.speciesId = speciesId;
        this.breedId = breedId;
        this.sex_id = sex_id;
        this.date_of_birth = date_of_birth;
        this.estimated_birth_date = estimated_birth_date;
        this.color = color;
        this.weight = weight;
        this.status_id = status_id;
        this.sterilized = sterilized;
        this.sterilization_date = sterilization_date;
        this.intake_date = intake_date;
        this.found_date = found_date;
        this.death_date = death_date;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.description = description;
        this.special_needs = special_needs;

    }
}
