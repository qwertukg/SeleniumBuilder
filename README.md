# SeleniumBuilder
DSL for Selenium 2.0. Provide a possibility to write tests in Kotlin builder style
```kotlin
driver(ChromeDriver()) { 
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
    
    wait(10) {
        elementVisibilityById("result-item") {
            item.salary = elementByClassOrNull("salary")?.text
        }
    }
}
```
Nested methods will not invoked if element not found
```kotlin
chromeDriver {
    get("http://cool-website.com")

    elementByClassOrNull("possible-button") {
        click()
        
        wait(10) {
            elementVisibilityByClass("dynamic-popup") {
                sendKeys("Kotlin is awesome")
                submit()
            }
            
            elementInvisibilityByClass("dynamic-popup") 
        }
    }
}
```
