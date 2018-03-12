package kz.qwertukg

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

/**
 * Selenium Kotlin Builder
 * Created by Daniil Rakhmatulin
 * http://daniil.rakhmatulin.kz
 */

/*
* Web Driver
* */
inline fun <T : WebDriver> driver(driver: T, init: T.() -> Unit) {
    try {
        driver.init()
    } finally {
        driver.close()
    }
}

/*
* Web Driver Chrome
* */
fun chromeDriver(init: WebDriver.() -> Unit) = driver(ChromeDriver(), init)

/*
* Web Driver Chrome with path to driver
* */
fun chromeDriver(
    settings: ChromeDriverSettings,
    init: ChromeDriver.() -> Unit
) {
    return driver(ChromeDriver(settings.driverOptions), init)
}

/*
* Web Driver FireFox
* */
inline fun firefoxDriver(init: WebDriver.() -> Unit) = driver(FirefoxDriver(), init)

/*
* Web Driver FireFox with path to driver
* */
inline fun firefoxDriver(pathToDriver: String, init: WebDriver.() -> Unit) {
    System.setProperty("webdriver.firefox.driver", pathToDriver)
    driver(FirefoxDriver(), init)
}