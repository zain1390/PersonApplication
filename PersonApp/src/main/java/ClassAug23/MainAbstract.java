package ClassAug23;

public class MainAbstract {
    public static void main(String[] args) {
        database db = new DataJpa();
        db.setup();
        db.connect();
        db.executeTransaction();
        db.endSetup();
    }
}
