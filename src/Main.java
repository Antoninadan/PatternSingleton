import i.ua.mail100.Configuration;

public class Main {

    public static void main(String[] args) {
        Configuration configuration = Configuration.getInstance();
        System.out.println(configuration.getProperty("db.host"));
    }
}
