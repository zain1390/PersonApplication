package Aug24Interface;

import java.util.concurrent.TimeUnit;

public class Hibernate implements DatabaseInterface {
    public boolean isConnected = false;

    @Override
    public void connect(String url, String username, String password) throws InterruptedException {
        System.out.println("\nConnecting Hibernate......");
        Thread.sleep(1000);
        isConnected = true;
    }

    @Override
    public void disconnect() throws InterruptedException {
        if (isConnected = true) {
            System.out.println("Disconnecting from Hibernate......");
            Thread.sleep(1000);
            isConnected = false;
        }
    }

    @Override
    public void saveData(String data) throws InterruptedException {
        if (isConnected = true) {
            System.out.println("Saving data to Hibernate: " + data);
            TimeUnit.SECONDS.sleep(1);
        } else {
            System.out.println("Cannot Save Data. Not Connected to  Hibernate");
            Thread.sleep(1000);
        }
    }

    @Override
    public void retrieveData() throws InterruptedException {
        if (isConnected = true) {
            System.out.println("Retrieving data from Hibernate: ");
            Thread.sleep(1000);
        } else {
            System.out.println("Cannot retrieve Data. Not Connected to  Hibernate");
            Thread.sleep(1000);
        }
    }
}