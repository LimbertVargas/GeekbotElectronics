package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public final class WebDriverManager {
    private static WebDriver webDriver;
    private static WebDriverManager instance;
    private static WebDriverWait webDriverWait;


    private WebDriverManager(){
        initialize();
    }

    public static WebDriverManager getInstance(){
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initialize() {
        this.webDriver = WebDriverFactory.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(DriverConfig.getInstance().getImplicitWait(), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, DriverConfig.getInstance().getExplicitWait());
        webDriver.get(URL);
    }

    public WebDriver getWebDriver(){
        return this.webDriver;
    }

    public void quitWebDriver(){
        webDriver.quit();
        webDriver = null;
    }
    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
