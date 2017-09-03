package kz.qwertukg

import org.openqa.selenium.*
import org.openqa.selenium.support.ui.WebDriverWait

/**
* Selenium Kotlin Builder
* Created by Daniil Rakhmatulin
* http://daniil.rakhmatulin.kz
*/

/*
* Build WebDriverWait with timeout
* */
inline fun WebDriver.wait(timeout: Long, init: WebDriverWait.() -> Unit) {
    WebDriverWait(this, timeout).init()
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
inline fun SearchContext.elementByClass(className: String, init: WebElement.() -> Unit) {
    findElement(By.className(className)).init()
}

/*
* Find element by name
* */
inline fun SearchContext.elementByName(name: String, init: WebElement.() -> Unit) {
    findElement(By.name(name)).init()
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
* elements collection functions
* */

/*
* Find elementS by
* */
inline fun SearchContext.elements(by: By, init: Iterable<WebElement>.() -> Unit) {
    findElements(by).init()
}

/*
* Find elementS by class
* */
inline fun SearchContext.elementsByClass(className: String, init: Iterable<WebElement>.() -> Unit) {
    findElements(By.className(className)).init()
}

/*
* Find elementS by name
* */
inline fun SearchContext.elementsByName(name: String, init: Iterable<WebElement>.() -> Unit) {
    findElements(By.name(name)).init()
}

/*
* Find elementS by css selector.
* */
inline fun SearchContext.elementsBySelector(selector: String, init: Iterable<WebElement>.() -> Unit) {
    findElements(By.cssSelector(selector)).init()
}

/*
* Find elementS by xpath.
* */
inline fun SearchContext.elementsByXpath(xpath: String, init: Iterable<WebElement>.() -> Unit) {
    findElements(By.xpath(xpath)).init()
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
