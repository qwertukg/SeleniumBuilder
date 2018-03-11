package kz.qwertukg

import org.junit.Assert.assertEquals
import org.junit.Test
import org.openqa.selenium.WebElement

data class ProxyInfo(val host: String, val port: Int)

fun List<WebElement>.toProxyInfo() = ProxyInfo(get(0).text, get(1).text.toInt())

class Proxy {
    @Test
    fun `test chromeDriver, elementById, wait, elementVisibilityById, elementVisibilityBySelector functions on google`() {
        var result = ""

        chromeDriver(settings2) {

            val res = mutableListOf<ProxyInfo>()

            (0..5).map { "https://hidemy.name/ru/proxy-list/?start=${it * 64}#list" }.forEach { url ->
                get(url)

                wait(100, 3000) {

                    elementVisibilityByLink("Показать") {
                    }

                    elementsByCssSelector("table.proxy__t tbody tr")
                        .map {
                            it.elementsByTag("td").toProxyInfo()
                        }.forEach {
                            res.add(it)
                        }
                }
            }
            print(res)
        }

        assertEquals("Kotlin Programming Language", result)
    }
}