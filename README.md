# SeleniumBuilder
DSL for Selenium 2.0. Provide a possibility to write tests in [Kotlin type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html#a-type-safe-builder-example) style

## Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependency>
    <groupId>com.github.qwertukg</groupId>
    <artifactId>SeleniumBuilder</artifactId>
    <version>b08536ffff</version>
</dependency>
```

## Gradle
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
```
dependencies {
    compile 'com.github.qwertukg:SeleniumBuilder:b08536ffff'
}
```

## Sample
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
            item.salary = elementByClass("salary").text
        }
    }
}
```

## Total function list

#### Driver builders

`driver(driver: WebDriver) {}` 

`chromeDriver {}`

`chromeDriver(pathToDriver: String) {}`

`firefoxDriver {}`

`firefoxDriver(pathToDriver: String) {}`

#### `WebDriver` and `WebElement` element builders

`element(by: By) {}`

`elementById(id: String) {}`

`elementByClass(className: String) {}`

`elementByName(name: String) {}`

`elementBySelector(selector: String) {}`

`elementByXpath(selector: String) {}`

#### `WebDriver` and `WebElement` element list builders

`elements(by: By) {}`

`elementsById(id: String) {}`

`elementsByClass(className: String) {}`

`elementsByName(name: String) {}`

`elementsBySelector(selector: String) {}`

`elementsByXpath(selector: String) {}`

#### `WebDriver` and `WebElement` element exists functions

`elementExists(by: By): Boolean`

`elementByIdExists(id: String): Boolean`

`elementByClassExists(className: String): Boolean`

`elementByNameExists(name: String): Boolean`

`elementBySelectorExists(selector: String): Boolean`

`elementByXpathExists(selector: String): Boolean`

#### `WebDriver` `WebDriverWait` builder

`wait(timeout: Long) {}`

#### `WebDriverWait` element visibility builders

`elementVisibility(by: By) {}`

`elementVisibilityById(id: String) {}`

`elementVisibilityByClass(className: String) {}`

`elementVisibilityByName(name: String) {}`

`elementVisibilityBySelector(selector: String) {}`

`elementVisibilityByXpath(xpath: String) {}`

#### `WebDriverWait` element invisibility functions

`elementInvisibility(by: By): Boolean`

`elementInvisibilityById(id: String): Boolean`

`elementInvisibilityByClass(className: String): Boolean`

`elementInvisibilityByName(name: String): Boolean`

`elementInvisibilityBySelector(selector: String): Boolean`

`elementInvisibilityByXpath(xpath: String): Boolean`

