package i.ua.mail100;

public final class LazyHolderSingleton {
    private LazyHolderSingleton() {
    }

    private static class Holder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return Holder.instance;
    }
}