

public class Main {

    public static void main(String[] args) {

        DatabaseConnection db = new DatabaseConnection();
        Animals Animal=new Animals();
        Animal.setName("Rex");

        System.out.println(Animal.getName());
    }
}