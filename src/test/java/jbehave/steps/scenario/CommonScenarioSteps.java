package jbehave.steps.scenario;

import org.openqa.selenium.WebDriver;

import core.webdriver.WebDriverFactory;

/**
 * Created by AMBER on 14.01.2017.
 */
public class CommonScenarioSteps {
    protected WebDriverFactory webDriverFactory = WebDriverFactory.getInstance();

    protected WebDriver getDriver() {
        return webDriverFactory.getDriver();
    }
}
