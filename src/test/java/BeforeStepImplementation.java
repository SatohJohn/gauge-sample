import com.codeborne.selenide.WebDriverRunner;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.BeforeSuite;
import org.apache.commons.lang3.SystemUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BeforeStepImplementation {
    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        if (SystemUtils.IS_OS_MAC) {
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_mac");
        } else if (SystemUtils.IS_OS_WINDOWS) {
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_windows.exe");
        } else if (SystemUtils.IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_linux");
        }

        options.addArguments("--no-experiments",
                "--disable-translate",
                "--disable-plugins",
                "--disable-extensions",
                "--no-default-browser-check",
                "--clear-token-service",
                "--disable-default-apps",
                "--enable-logging",
//                "--headless", "--disable-gpu", // この2つがあるとheadlessになる。落ちた状態が見たい場合は外すと良いかと
                "test-type");
        ChromeDriver chromeDriver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(chromeDriver);
    }

    @BeforeSpec
    public void beforeSpec() {
    }

    @BeforeScenario
    public void beforeScenario() {
    }

    @BeforeStep
    public void beforeStep() {
    }

}

