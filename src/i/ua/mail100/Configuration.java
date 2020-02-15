//Мне приходится чаще всего использовать этот паттерн при работе с конфигурацией.
//        Иногда конфигурацию программы удобно хранить в файле.
//        Допустим, это будет простой текстовый файл "props.txt" со строками типа "ключ=значение".
//        Нам нужно гарантировать, что конфигурация в программе будет в единственном экземпляре.
//        Вторую мы бы и так не создали, но нужно запретить это делать пользователю класса
package i.ua.mail100;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
    private static Configuration instance = null;

    private Properties props = null;

    private Configuration() {
        props = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    new File("props.txt"));
            props.load(fis);
        }
        catch (Exception e) {
            // обработайте ошибку чтения конфигурации
        }
    }

    public synchronized static Configuration getInstance() {
        if (instance == null)
            instance = new Configuration();
        return instance;
    }

    // получить значение свойства по имени
    public synchronized String getProperty(String key) {
        String value = null;
        if (props.containsKey(key))
            value = (String) props.get(key);
        else {
            // сообщите о том, что свойство не найдено
        }
        return value;
    }
}
