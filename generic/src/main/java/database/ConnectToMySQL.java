package database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectToMySQL {

    public static Connection connect = null;

    public static Properties loadPropertiesForMe() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("C:\\Users\\wormi\\IdeaProjects\\pocketsMobileTest\\generic\\src\\main\\resources\\database.properties");
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    public static Connection connectToMySQL() throws IOException, ClassNotFoundException, SQLException {
    Properties prop = loadPropertiesForMe();
    String mysqlDriver = prop.getProperty("MYSQL-driver");
    String mysqlUrl = prop.getProperty("MYSQL-url");
    String mysqlUser = prop.getProperty("MYSQL-username");
    String mysqlPass = prop.getProperty("MYSQL-password");
    Class.forName(mysqlDriver);
    connect = DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPass);
    return connect;
    }
}
