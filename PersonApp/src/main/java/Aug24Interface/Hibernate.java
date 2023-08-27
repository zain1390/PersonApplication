package Aug24Interface;

public class Hibernate implements DatabaseInterface {
    public boolean isConnected =false;
    @Override
    public void connect(String url, String username, String password) {
        System.out.println("\nConnecting Hibernate......");
        isConnected = true;}
    @Override
    public void disconnect() {
        if (isConnected = true)
        {System.out.println("Disconnecting from Hibernate......");
            isConnected = false;}}
    @Override
    public void saveData(String data) {
        if (isConnected = true){System.out.println("Saving data to Hibernate: "+ data);}
        else {System.out.println("Cannot Save Data. Not Connected to  Hibernate");}}
    @Override
    public void retrieveData() {
        if (isConnected = true)
        {System.out.println("Retrieving data from Hibernate: ");} else
        {System.out.println("Cannot retrieve Data. Not Connected to  Hibernate");}}}
