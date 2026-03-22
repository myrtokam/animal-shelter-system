package Animal_Management;

public class Animal {

private  String ID;
private  String Code;
private  String Name;
private String Species;
private AnimalCategory Category;
private  Gender Gender;
private  double age;
private  double weight;
private  AnimalBasicInfo BasicInfo;
private  AnimalStatus status;
private  IntakeInfo IntakeInfo;
private  HealthProfile HealthProfile;
private Location Location;


    public Animal(String ID, String code, String name, String species, String category, String gender, double age, double weight, String basicInfo, String status, String intakeInfo, String healthProfile, String location) {
        this.ID = ID;
        Code = code;
        Name = name;
        Species = species;
        this.age = age;
        this.weight = weight;
    }

}

