package i.ua.mail100;

public class SimpleSingleton {
    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public static final SimpleSingleton getInstance(){
        if(instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

}
