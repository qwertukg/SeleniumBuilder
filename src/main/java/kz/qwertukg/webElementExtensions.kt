package kz.qwertukg

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

/**
* Selenium Kotlin Builder
* Created by Daniil Rakhmatulin
* http://daniil.rakhmatulin.kz
*/

/*
* Find element by
* */
fun WebElement.element(by: By, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(by)
    element.init()
    return element
}

/*
* Find element by class
* */
fun WebElement.elementByClass(className: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.className(className))
    element.init()
    return element
}

/*
* Find element by name
* */
fun WebElement.elementByName(name: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.name(name))
    element.init()
    return element
}

/*
* Find element by selector
* */
fun WebElement.elementBySelector(selector: String, init: WebElement.() -> Unit = {}): WebElement {
    val element = findElement(By.cssSelector(selector))
    element.init()
    return element
}

/*
* Find element by, or null
* */
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
* Find element by class, or null
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
fun WebElement.elements(by: By, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(by)
    elements.init()
    return elements
}

/*
* Find elementS by class
* */
fun WebElement.elementsByClass(className: String, init: Iterable<WebElement>.() -> Unit = {}): Iterable<WebElement> {
    val elements = findElements(By.className(className))
    elements.init()
    return elements
}

/*
* Element exists by
* */
fun WebElement.elementExists(by: By): Boolean {
    val elements = findElements(by)
    return elements.isNotEmpty()
}

/*
* Element exists by class name
* */
fun WebElement.elementByClassExists(className: String): Boolean {
    val elements = findElements(By.className(className))
    return elements.isNotEmpty()
}