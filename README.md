# SeleniumBuilder
DSL for Selenium 2.0. Provide a possibility to write tests in Kotlin builder style
```kotlin
chromeDriver { 
    get("http://cool-website.com")
    
    elementByClass("login") {
        sendKeys("user@example.com")
    }

    elementByName("password") {
        sendKeys("123456")
        submit()
    }
    
    element(By.className("search")) {
        sendKeys("kotlin")
    }
    
    waitElementByClass("result-item", 10) {
        item.salary = elementOrNull(By.className("salary"))
    }
}
```
Nested methods will not invoked if element not found
```kotlin
driver(ChromeDriver()) {
    get("http://cool-website.com")

    elementByClassOrNull("possible-button") {
        click()

        waitElementVisibilityByClass("dynamic-popup", 10) {
            sendKeys("Kotlin is awesome")
            submit()
        }

        waitElementInvisibilityByClass("dynamic-popup", 10)
    }
}
```
