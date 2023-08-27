package ClassAug23;

public interface database {
    public abstract void setup();

    public abstract void connect();

    public abstract void executeTransaction();

    public abstract void endSetup();

    public static final int timeout = 120;


}
