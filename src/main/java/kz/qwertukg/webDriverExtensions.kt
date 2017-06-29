package kz.qwertukg

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

/**
* Selenium Kotlin Builder
* Created by Daniil Rakhmatulin
* http://daniil.rakhmatulin.kz
*/

/*
* Find element by
* */
fun WebDriver.element(by: By, init: WebElement.() -> Unit = {}): WebElement {
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

/*
* Find elementS by
* */
fun WebDriver.elements(by: By, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements =  findElements(by)
    elements.init()
    return elements
}

/*
* Find elementS by class
* */
fun WebDriver.elementsByClass(className: String, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(By.className(className))
    elements.init()
    return elements
}

/*
* Element exists by
* */
fun WebDriver.elementExists(by: By): Boolean {
    val elements = findElements(by)
    return elements.isNotEmpty()
}

/*
* Element exists by class name
* */
fun WebDriver.elementByClassExists(className: String): Boolean {
    val elements = findElements(By.className(className))
    return elements.isNotEmpty()
}