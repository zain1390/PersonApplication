package ClassAug23;

public class HibernateDb implements database {
    @Override
    public void setup() {
        System.out.println("Hibernate Setup "+ timeout);
    }

    @Override
    public void connect() {
        System.out.println("Hibernate Connect");

    }

    @Override
    public void executeTransaction() {
        System.out.println("HibernateE Execute Transaction");

    }

    @Override
    public void endSetup() {
        System.out.println("Hibernate End Setup");

    }
}

