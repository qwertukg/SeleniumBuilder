package kz.qwertukg

import org.openqa.selenium.*
import org.openqa.selenium.support.ui.*

/**
* Selenium Kotlin Builder
* Created by Daniil Rakhmatulin
* http://daniil.rakhmatulin.kz
*/

/*
* Visibility of element
* */

/*
* Web driver wait element is visible
* */
inline fun WebDriverWait.elementVisibility(by: By, init: WebElement.() -> Unit) {
    until(ExpectedConditions.visibilityOfElementLocated(by)).init()
}

/*
* Web driver wait element by id is visible
* */
inline fun WebDriverWait.elementVisibilityById(id: String, init: WebElement.() -> Unit) {
    until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).init()
}

/*
* Web driver wait element by class is visible
* */
inline fun WebDriverWait.elementVisibilityByClass(className: String, init: WebElement.() -> Unit) {
    until(ExpectedConditions.visibilityOfElementLocated(By.className(className))).init()
}

/*
* Web driver wait element by name is visible
* */
inline fun WebDriverWait.elementVisibilityByName(name: String, init: WebElement.() -> Unit) {
    until(ExpectedConditions.visibilityOfElementLocated(By.name(name))).init()
}

/*
* Web driver wait element by css selector is visible
* */
inline fun WebDriverWait.elementVisibilityBySelector(selector: String, init: WebElement.() -> Unit) {
    until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector))).init()
}

/*
* Web driver wait element by css selector is visible
* */
inline fun WebDriverWait.elementVisibilityByXpath(xpath: String, init: WebElement.() -> Unit) {
    until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).init()
}

/*
* Invisibility of element
* */

/*
* Web driver wait element is invisible
* */
fun WebDriverWait.elementInvisibility(by: By) = until(ExpectedConditions.invisibilityOfElementLocated(by))

/*
* Web driver wait element by id is invisible
* */
fun WebDriverWait.elementInvisibilityById(id: String) = until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)))

/*
* Web driver wait element by class is invisible
* */
fun WebDriverWait.elementInvisibilityByClass(className: String) = until(ExpectedConditions.invisibilityOfElementLocated(By.className(className)))

/*
* Web driver wait element by name is invisible
* */
fun WebDriverWait.elementInvisibilityByName(name: String) = until(ExpectedConditions.invisibilityOfElementLocated(By.name(name)))

/*
* Web driver wait element by class is invisible
* */
fun WebDriverWait.elementInvisibilityBySelector(selector: String) = until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(selector)))

/*
* Web driver wait element by class is invisible
* */
fun WebDriverWait.elementInvisibilityByXpath(xpath: String) = until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)))
