package ClassAug23;

public class DataJpa implements database {

    @Override
    public void setup() {
        System.out.println("Data JPA Setup " + timeout);
    }

    @Override
    public void connect() {
        System.out.println("Data JPA Connect");
    }

    @Override
    public void executeTransaction() {
        System.out.println("Data JPA ExecuteTransation");
    }

    @Override
    public void endSetup() {
        System.out.println("Data JPA End Setup");
    }
}
