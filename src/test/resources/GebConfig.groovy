import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

environments {
    firefox {
        driver = { new FirefoxDriver() }
    }
    phantomJs {
        driver = { new PhantomJSDriver() }
    }
    chrome {
        driver = { new ChromeDriver() }
    }
}