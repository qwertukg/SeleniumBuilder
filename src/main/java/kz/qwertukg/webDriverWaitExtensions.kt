package kz.qwertukg

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

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
fun WebDriverWait.elementVisibility(by: By, init: WebElement.() -> Unit = {}): WebElement {
    val element = until(ExpectedConditions.visibilityOfElementLocated(by))
    element.init()
    return element
}

/*
* Web driver wait element by id is visible
* */
fun WebDriverWait.elementVisibilityById(id: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
    element.init()
    return element
}

/*
* Web driver wait element by class is visible
* */
fun WebDriverWait.elementVisibilityByClass(className: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = until(ExpectedConditions.visibilityOfElementLocated(By.className(className)))
    element.init()
    return element
}

/*
* Web driver wait element by name is visible
* */
fun WebDriverWait.elementVisibilityByName(name: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = until(ExpectedConditions.visibilityOfElementLocated(By.name(name)))
    element.init()
    return element
}

/*
* Web driver wait element by css selector is visible
* */
fun WebDriverWait.elementVisibilityBySelector(selector: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)))
    element.init()
    return element
}

/*
* Web driver wait element by css selector is visible
* */
fun WebDriverWait.elementVisibilityByXpath(xpath: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
    element.init()
    return element
}

/*
* Invisibility of element
* */

/*
* Web driver wait element is invisible
* */
fun WebDriverWait.elementInvisibility(by: By): Boolean {
    return until(ExpectedConditions.invisibilityOfElementLocated(by))
}

/*
* Web driver wait element by id is invisible
* */
fun WebDriverWait.elementInvisibilityById(id: String): Boolean {
    return until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)))
}

/*
* Web driver wait element by class is invisible
* */
fun WebDriverWait.elementInvisibilityByClass(className: String): Boolean {
    return until(ExpectedConditions.invisibilityOfElementLocated(By.className(className)))
}

/*
* Web driver wait element by name is invisible
* */
fun WebDriverWait.elementInvisibilityByName(name: String): Boolean {
    return until(ExpectedConditions.invisibilityOfElementLocated(By.name(name)))
}

/*
* Web driver wait element by class is invisible
* */
fun WebDriverWait.elementInvisibilityBySelector(selector: String): Boolean {
    return until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(selector)))
}

/*
* Web driver wait element by class is invisible
* */
fun WebDriverWait.elementInvisibilityByXpath(xpath: String): Boolean {
    return until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)))
}