package steps;

import BaseUtility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestNGListener;
import runner.testNg;

import java.io.IOException;

import static runner.testNg.config;
import static runner.testNg.loadConfig;

public class Hooks extends BaseClass {

    private BaseClass base;

    public Hooks (BaseClass base)  {

        this.base = base;

}

    @Before
    public void InitializeTest() {
        testNg.checkConfig();
        System.out.println("Opening the browser");
        String browserName = testNg.getBrowserType();

        switch (browserName) {
            case "chrome":
                base.driver = new ChromeDriver();
                base.driver.manage().window().maximize();

                break;
            case "edge":
                base.driver = new EdgeDriver();
                base.driver.manage().window().maximize();

                break;
            case "firefox":
                base.driver = new FirefoxDriver();
                base.driver.manage().window().maximize();

                break;
        }
    }
    @After
    public void TearDownTest(Scenario scenario ) throws IOException {
              System.out.println("Closing the Browser");
     //   base.driver.close();

    }}




