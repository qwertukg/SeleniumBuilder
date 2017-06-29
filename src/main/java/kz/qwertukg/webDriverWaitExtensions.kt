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
* Web driver wait element
* */
fun WebDriver.waitElementVisibility(by: By, timeout: Long, init: WebElement.() -> Unit = {}): WebElement {
    val element = WebDriverWait(this, timeout).until(ExpectedConditions.visibilityOfElementLocated(by))
    element.init()
    return element
}

/*
* Web driver wait element by class
* */
fun WebDriver.waitElementVisibilityByClass(className: String, timeout: Long, init: WebElement.() -> Unit = {}): WebElement {
    val element = WebDriverWait(this, timeout).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)))
    element.init()
    return element
}

/*
* Web driver wait element by class is invisible
* */
fun WebDriver.waitElementInvisibilityByClass(className: String, timeout: Long): Boolean {
    return WebDriverWait(this, timeout).until(ExpectedConditions.invisibilityOfElementLocated(By.className(className)))
}