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
fun driver(driver: WebDriver, init: WebDriver.() -> Unit = {}): WebDriver {
    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}

/*
* Web Driver Chrome
* */
fun chromeDriver(init: WebDriver.() -> Unit = {}): ChromeDriver {
    val driver = ChromeDriver()

    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}

/*
* Web Driver Chrome with path to driver
* */
fun chromeDriver(path: String, init: WebDriver.() -> Unit = {}): ChromeDriver {
    System.setProperty("webdriver.chrome.driver", path)
    val driver = ChromeDriver()

    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}

/*
* Web Driver FireFox
* */
fun firefoxDriver(init: WebDriver.() -> Unit = {}): FirefoxDriver {
    val driver = FirefoxDriver()

    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}

/*
* Web Driver FireFox with path to driver
* */
fun firefoxDriver(path: String, init: WebDriver.() -> Unit = {}): FirefoxDriver {
    System.setProperty("webdriver.chrome.driver", path)
    val driver = FirefoxDriver()

    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}