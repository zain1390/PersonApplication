package Aug24Interface;
interface DatabaseInterface {
    public abstract void connect(String url, String username, String password);
    public abstract void disconnect();
    public abstract void saveData(String data);
    public abstract void retrieveData();}