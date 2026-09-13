public class AnimalDAO {

    private DatabaseConnection databaseConnection;

    public AnimalDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public boolean registerAnimal(Animals animal) {
        return true;
    }
}