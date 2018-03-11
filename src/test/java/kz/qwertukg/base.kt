package kz.qwertukg

import org.openqa.selenium.chrome.ChromeOptions

val settings = ChromeDriverSettings(
    pathToDriver = "c:/chromedriver.exe",
    driverOptions = ChromeOptions().apply { setHeadless(true) }
)

val settings2 = ChromeDriverSettings(
    pathToDriver = "/Users/alex/Downloads/chromedriver",
    driverOptions = ChromeOptions().apply { setHeadless(false) }
)