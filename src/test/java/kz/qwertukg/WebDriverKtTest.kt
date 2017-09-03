package kz.qwertukg

import org.junit.Test
import org.junit.Assert.*

class WebDriverKtTest {
    @Test
    fun `test chromeDriver, elementById, wait, elementVisibilityById, elementVisibilityBySelector functions on google`() {
        var result = ""

        chromeDriver("c:/chromedriver.exe") {
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