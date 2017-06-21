package kz.qwertukg

import org.openqa.selenium.*
import org.openqa.selenium.support.ui.*
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

/**
 * Selenium Kotlin Builder
 * Created by Daniil Rakhmatulin on 21.06.2017.
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

fun chromeDriver(init: WebDriver.() -> Unit = {}): WebDriver {
    val driver = ChromeDriver()

    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}

fun firefoxDriver(init: WebDriver.() -> Unit = {}): WebDriver {
    val driver = FirefoxDriver()

    try {
        driver.init()
        return driver
    } finally {
        driver.close()
    }
}

/*
* Find element by
* */

fun WebDriver.element(by: By, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(by)
    element.init()
    return element
}

fun WebElement.element(by: By, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(by)
    element.init()
    return element
}

/*
* Find element by class
* */

fun WebDriver.elementByClass(className: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.className(className))
    element.init()
    return element
}

fun WebElement.elementByClass(className: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.className(className))
    element.init()
    return element
}

/*
* Find element by name
* */

fun WebDriver.elementByName(name: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.name(name))
    element.init()
    return element
}

/*
* Find element by selector
* */

fun WebDriver.elementBySelector(selector: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.cssSelector(selector))
    element.init()
    return element
}

fun WebElement.elementBySelector(selector: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.cssSelector(selector))
    element.init()
    return element
}

/*
* Find element by or null
* */

fun WebDriver.elementOrNull(by: By, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(by)

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

fun WebElement.elementOrNull(by: By, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(by)

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}


/*
* Find element by class or null
* */

fun WebElement.elementByClassOrNull(className: String, init: WebElement.() -> Unit = {}): WebElement? {
    val elements = findElements(By.className(className))

    if (elements.isNotEmpty()) {
        val element = elements.first()
        element.init()
        return element
    } else {
        return null
    }
}

/*
* Find elementS by
* */

fun WebDriver.elements(by: By, init: List<WebElement>.() -> Unit = {}): List<WebElement> {
    val elements =  findElements(by)
    elements.init()
    return elements
}

fun WebElement.elements(by: By, init: List<WebElement>.() -> Unit = {}): List<WebElement> {
    val elements = findElements(by)
    elements.init()
    return elements
}

/*
* Find elementS by class
* */

fun WebDriver.elementsByClass(className: String, init: List<WebElement>.() -> Unit = {}): List<WebElement> {
    val elements = findElements(By.className(className))
    elements.init()
    return elements
}

fun WebElement.elementsByClass(className: String, init: List<WebElement>.() -> Unit = {}): List<WebElement> {
    val elements = findElements(By.className(className))
    elements.init()
    return elements
}

/*
* Web driver wait element
* */

fun WebDriver.waitElement(by: By, timeout: Long, init: WebElement.() -> Unit = {}): WebElement {
    val element = WebDriverWait(this, timeout).until(ExpectedConditions.visibilityOfElementLocated(by))
    element.init()
    return element
}

/*
* Web driver wait element by class
* */

fun WebDriver.waitElementByClass(className: String, timeout: Long, init: WebElement.() -> Unit = {}): WebElement {
    val element = WebDriverWait(this, timeout).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)))
    element.init()
    return element
}

/*
* Web driver wait element by class is invisible
* */

fun WebDriver.waitElementByClassInvisible(className: String, timeout: Long, init: WebElement.() -> Unit = {}): Boolean {
    return WebDriverWait(this, timeout).until(ExpectedConditions.invisibilityOfElementLocated(By.className(className)))
}

/*
* Exists by class name
* */

fun WebDriver.existsElementByClass(className: String): Boolean {
    val elements = findElements(By.className(className))
    return elements.isNotEmpty()
}

fun WebElement.existsElementByClass(className: String): Boolean {
    val elements = findElements(By.className(className))
    return elements.isNotEmpty()
}
