package Aug24Interface;

public class DataJPA implements DatabaseInterface {
    public boolean isConnected = false;

    @Override
    public void connect(String url, String username, String password) throws InterruptedException {
        System.out.println("\nConnecting to DataJPA......");
        Thread.sleep(1000);
        isConnected = true;
    }

    @Override
    public void disconnect() throws InterruptedException {
        if (isConnected = true) {
            System.out.println("Disconnecting from DataJPA......");
            Thread.sleep(1000);
            isConnected = false;
        }
    }

    @Override
    public void saveData(String data) throws InterruptedException {
        if (isConnected = true) {
            System.out.println("Saving data to DATA JPA: " + data);
            Thread.sleep(1000);
        } else {
            System.out.println("Cannot Save Data. Not Connected to  DATA JPA");
            Thread.sleep(1000);
        }
    }

    @Override
    public void retrieveData() throws InterruptedException {
        if (isConnected = true) {
            System.out.println("Retrieving data from DATA JPA: ");
            Thread.sleep(1000);
        } else {
            System.out.println("Cannot retrieve Data. Not Connected to  DATA JPA");
            Thread.sleep(1000);
        }
    }
}
