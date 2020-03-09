/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */
package core.selenium;

import core.selenium.webdrivers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * WebDriverManager class, this class is responsible for creating an instance of a browser.
 *
 * @author Limbert Vargas
 * @version 0.0.1
 */
public final class WebDriverManager {
    private WebDriver webDriver;
    private static WebDriverManager instance;
    private WebDriverWait webDriverWait;

    /**
     * Constructor of WebDriverManager
     */
    private WebDriverManager() {
        initialize();
    }

    public static WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initialize() {
        this.webDriver = BrowserFactory.getBrowser(WebDriverConfig.getInstance().getBrowserName()).initDriver();
        this.webDriver.manage().window().maximize();
        this.webDriver.manage()
                .timeouts().implicitlyWait(WebDriverConfig.getInstance().getImplicitWait(), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, WebDriverConfig.getInstance().getExplicitWait());
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
