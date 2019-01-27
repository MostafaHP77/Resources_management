package Data.User;

public class Manager {
    private static Manager ourInstance = new Manager();

    public static Manager getInstance() {
        return ourInstance;
    }

    private Manager() {
    }
}
