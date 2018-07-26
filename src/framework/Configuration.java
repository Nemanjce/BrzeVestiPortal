package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public static String chromeDriverPath;

    public static String mainSiteUrl;
    public static String adminPanelLogin;
    public static String adminUsername;
    public static String adminPassword;

    public static void init() throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("configuration.properties");
        properties.load(fis);

        mainSiteUrl = properties.getProperty("mainSiteUrl");
        adminPanelLogin = properties.getProperty("adminPanelLogin");
        adminUsername = properties.getProperty("adminUsername");
        adminPassword = properties.getProperty("adminPassword");
        chromeDriverPath = properties.getProperty("chromeDriverPath");

    }

}
