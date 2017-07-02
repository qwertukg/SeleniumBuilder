package kz.qwertukg

import org.junit.Test
import org.junit.Assert.*

class WebDriverKtTest {
    init {
        System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe")
    }

    @Test
    fun `test wait function on google`() {
        var result: String = ""

        chromeDriver {
            get("http://google.com")

            elementById("lst-ib") {
                sendKeys("kotlin")

                wait(10) {
                    elementVisibilityById("_fZl") {
                        click()
                    }

                    elementVisibilityBySelector("a[href = 'https://kotlinlang.org/']") {
                        result = text
                    }
                }
            }
        }

        assertEquals("Kotlin Programming Language", result)
    }

}