package Aug24Interface;

interface DatabaseInterface {
    public abstract void connect(String url, String username, String password) throws InterruptedException;

    public abstract void disconnect() throws InterruptedException;

    public abstract void saveData(String data) throws InterruptedException;

    public abstract void retrieveData() throws InterruptedException;
}