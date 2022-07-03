package runner;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;
//import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@CucumberOptions (features = {"./src/test/resources/features"},
        plugin =  {"html:target/cucumberA/cucumber.html"},
        // plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
       tags = ("@Regression"),
        glue = "steps") //{"@test"})

public class testNg extends AbstractTestNGCucumberTests {
    public static Properties config = null;
    private static org.openqa.selenium.Cookie c = null;

    public static void loadConfig() {
        config = new Properties();
        try {
            FileInputStream in = new FileInputStream(System.getProperty("user.dir") +
                    "/src/test/resources/configs/config.properties");
            config.load(in);
            setupBrowser();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowserType() {

        return config.getProperty("browserType");
    }

    public static void setupBrowser() {
        String browserType = config.getProperty("browserType");
        String osName = System.getProperty("os.name");

        switch (browserType) {
            case "chrome":
                if (osName.startsWith("Mac")) {
                    WebDriverManager.chromedriver().operatingSystem(OperatingSystem.MAC).setup();
                }
                if (osName.startsWith("Windows")) {
                    WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
                }
                break;

            case "edge":
                if (osName.startsWith("Mac")) {
                    WebDriverManager.edgedriver().operatingSystem(OperatingSystem.MAC).setup();
                }
                if (osName.startsWith("Windows")) {
                    WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).setup();
                }
                break;

            case "firefox":
                if (osName.startsWith("Mac")) {
                    WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.MAC).setup();
                }
                if (osName.startsWith("Windows")) {
                    WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
                }
                break;
        }
    }
    public static void checkConfig() {
        if (config == null || config.isEmpty()) {
            loadConfig();
        }
    }

}




