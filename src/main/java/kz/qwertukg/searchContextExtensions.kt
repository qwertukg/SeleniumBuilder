package kz.qwertukg

import org.openqa.selenium.By
import org.openqa.selenium.SearchContext
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait

/**
 * Selenium Kotlin Builder
 * Created by Daniil Rakhmatulin
 * http://daniil.rakhmatulin.kz
 */

/*
* Build WebDriverWait with timeout
* */
fun WebDriver.wait(timeout: Long, sleepTimeout: Long = 500, init: WebDriverWait.() -> Unit) {
    WebDriverWait(this, timeout, sleepTimeout).init()
}

/*
* Single element functions
* */

/*
* Find element by
* */
inline fun SearchContext.element(by: By, init: WebElement.() -> Unit) {
    findElement(by).init()
}

/*
* Find element by id
* */

inline fun SearchContext.elementById(id: String, init: WebElement.() -> Unit) {
    findElement(By.id(id)).init()
}

/*
* Find element by class
* */
inline fun <T> SearchContext.elementByClass(className: String, init: WebElement.() -> T): T {
    return findElement(By.className(className)).init()
}

/*
* Find element by name
* */
inline fun SearchContext.elementByName(name: String, init: WebElement.() -> Unit) {
    findElement(By.name(name)).init()
}

/*
* Find element by tag
* */
inline fun <T> SearchContext.elementByTag(tag: String, init: WebElement.() -> T): T {
    return findElement(By.tagName(tag)).init()
}

/*
* Find element by selector
* */
inline fun SearchContext.elementBySelector(selector: String, init: WebElement.() -> Unit) {
    findElement(By.cssSelector(selector)).init()
}

/*
* Find element by xpath
* */
inline fun SearchContext.elementByXpath(xpath: String, init: WebElement.() -> Unit) {
    findElement(By.xpath(xpath)).init()
}





/*
* element existing functions.
* */

/*
* Element exists by.
* */
fun SearchContext.elementExists(by: By) = findElements(by).isNotEmpty()

/*
* Element exists by id
* */
fun SearchContext.elementByIdExists(id: String) = findElements(By.id(id)).isNotEmpty()

/*
* Element exists by class name
* */
fun SearchContext.elementByClassExists(className: String) = findElements(By.className(className)).isNotEmpty()

/*
* Element exists by name
* */
fun SearchContext.elementByNameExists(name: String) = findElements(By.name(name)).isNotEmpty()

/*
* Element exists by css selector
* */
fun SearchContext.elementBySelectorExists(selector: String) = findElements(By.cssSelector(selector)).isNotEmpty()

/*
* Element exists by xpath
* */
fun SearchContext.elementByXpathExists(xpath: String) = findElements(By.xpath(xpath)).isNotEmpty()
