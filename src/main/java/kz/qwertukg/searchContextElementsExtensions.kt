@file:Suppress("unused")

package kz.qwertukg

import org.openqa.selenium.By
import org.openqa.selenium.SearchContext
import org.openqa.selenium.WebElement

/*
* withElements collection functions
* */

/*
* Find elementS by
* */
inline fun SearchContext.withElements(by: By, init: Iterable<WebElement>.() -> Unit) {
    findElements(by).init()
}

/*
* Find elementS by class
* */
inline fun SearchContext.withElementsByClass(className: String, init: Iterable<WebElement>.() -> Unit)  =
    withElements(By.className(className), init)

/*
* Find elementS by name
* */
inline fun SearchContext.withElementsByName(name: String, init: Iterable<WebElement>.() -> Unit) =
    withElements(By.name(name), init)

/*
* Find elementS by css selector.
* */
inline fun SearchContext.withElementsBySelector(selector: String, init: Iterable<WebElement>.() -> Unit)  =
    withElements(By.cssSelector(selector), init)

/*
* Find element by xpath
* */
inline fun SearchContext.withElementsByXpath(xpath: String, init: Iterable<WebElement>.() -> Unit) {
    withElements(By.xpath(xpath), init)
}

/*
* Find elementS by
* */
inline fun SearchContext.eachElement(by: By, init: WebElement.() -> Unit) {
    findElements(by).forEach(init)
}

/*
* Find element by tag
* */
inline fun SearchContext.eachElementByTag(tag: String, init: WebElement.() -> Unit) {
    eachElement(By.tagName(tag), init)
}

/*
* Find element by xpath
* */
inline fun SearchContext.eachElementByXPath(xpath: String, init: WebElement.() -> Unit) {
    eachElement(By.xpath(xpath), init)
}

/*
* Find element by class name
* */
inline fun SearchContext.eachElementByClassName(className: String, init: WebElement.() -> Unit) {
    eachElement(By.className(className), init)
}

/*
* Find element by class name
* */
inline fun SearchContext.eachElementByCssSelector(cssSelector: String, init: WebElement.() -> Unit) {
    eachElement(By.cssSelector(cssSelector), init)
}

/*
* Find withElements by xpath
* */
inline fun <T> SearchContext.elementsByXPath(xpath: String, init: List<WebElement>.() -> T): T {
    return findElements(By.xpath(xpath)).init()
}

/*
* Find elementS by
* */
fun SearchContext.elements(by: By) : List<WebElement> = findElements(by)

fun SearchContext.elementsByTag(tag: String) = elements(By.tagName(tag))

fun SearchContext.elementsByName(tag: String) = elements(By.name(tag))

fun SearchContext.elementsByXPath(tag: String) = elements(By.xpath(tag))

fun SearchContext.elementsByLinkText(tag: String) = elements(By.linkText(tag))

fun SearchContext.elementsByClassName(tag: String) = elements(By.className(tag))

fun SearchContext.elementsByCssSelector(tag: String) = elements(By.cssSelector(tag))

fun SearchContext.elementsByPartialLinkText(tag: String) = elements(By.partialLinkText(tag))










