package Aug24Interface;
public class DataJPA implements DatabaseInterface{
    public boolean isConnected =false;
    @Override
    public void connect(String url, String username, String password)
    {System.out.println("\nConnecting to DataJPA......");
        isConnected = true;}
    @Override
    public void disconnect() {if (isConnected = true) {
        System.out.println("Disconnecting from DataJPA......");
        isConnected = false;}}
    @Override
    public void saveData(String data)
    {if (isConnected = true)
    {System.out.println("Saving data to DATA JPA: "+ data);} else
    {System.out.println("Cannot Save Data. Not Connected to  DATA JPA");}}
    @Override
    public void retrieveData() {if (isConnected = true)
    {System.out.println("Retrieving data from DATA JPA: ");}
    else
    {System.out.println("Cannot retrieve Data. Not Connected to  DATA JPA");
    }}}
