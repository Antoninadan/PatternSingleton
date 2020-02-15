package i.ua.mail100;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance = null;

    private DoubleCheckedLockingSingleton() {
    }

    public static synchronized DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
