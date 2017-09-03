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
inline fun driver(driver: WebDriver, init: WebDriver.() -> Unit) {
    try {
        driver.init()
    } finally {
        driver.close()
    }
}

/*
* Web Driver Chrome
* */
inline fun chromeDriver(init: WebDriver.() -> Unit) {
    val driver = ChromeDriver()

    try {
        driver.init()
    } finally {
        driver.close()
    }
}

/*
* Web Driver Chrome with path to driver
* */
inline fun chromeDriver(pathToDriver: String, init: WebDriver.() -> Unit) {
    System.setProperty("webdriver.chrome.driver", pathToDriver)
    val driver = ChromeDriver()

    try {
        driver.init()
    } finally {
        driver.close()
    }
}

/*
* Web Driver FireFox
* */
inline fun firefoxDriver(init: WebDriver.() -> Unit) {
    val driver = FirefoxDriver()

    try {
        driver.init()
    } finally {
        driver.close()
    }
}

/*
* Web Driver FireFox with path to driver
* */
inline fun firefoxDriver(pathToDriver: String, init: WebDriver.() -> Unit) {
    System.setProperty("webdriver.firefox.driver", pathToDriver)
    val driver = FirefoxDriver()

    try {
        driver.init()
    } finally {
        driver.close()
    }
}