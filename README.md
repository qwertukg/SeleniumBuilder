# SeleniumBuilder
DSL for Selenium 2.0. Provide a possibility to write tests in Kotlin builder style
```kotlin
chromeDriver { 
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
