package Aug24Interface;

public class Main {
    public static void main(String[] args) {

        DatabaseInterface db = new Hibernate();
        DatabaseInterface db2 = new DataJPA();
        db.connect("hibernate_URL", "Hibernate_user", "Hibernate_password");
        db.saveData("'Some Data for Hibernate'");
        db.retrieveData();
        db.disconnect();

        db2.connect("hibernate_URL", "Hibernate_user", "Hibernate_password");
        db2.saveData("'Some Data for DataJPA'");
        db2.retrieveData();
        db2.disconnect();
    }
}