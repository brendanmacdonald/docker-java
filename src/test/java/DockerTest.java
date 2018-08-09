import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerTest {

    private static Capabilities chromeCapabilities = DesiredCapabilities.chrome();
    private static Capabilities firefoxCapabilities = DesiredCapabilities.firefox();

    @Test
    public void main() throws MalformedURLException {
        RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
        RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxCapabilities);

        // run against chrome
        chrome.get("https://www.google.com");
        System.out.println(chrome.getTitle());

        // run against firefox
        firefox.get("https://www.google.com");
        System.out.println(firefox.getTitle());

        chrome.quit();
        firefox.quit();
    }
}