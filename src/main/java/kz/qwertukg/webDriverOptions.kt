package kz.qwertukg

import org.openqa.selenium.chrome.ChromeOptions

open class DriverOptions(
    pathToDriver: String
) {
    init {
        System.setProperty("webdriver.chrome.driver", pathToDriver)
    }
}

class ChromeDriverSettings(
    pathToDriver: String,
    val driverOptions: ChromeOptions = ChromeOptions()
) : DriverOptions(pathToDriver)