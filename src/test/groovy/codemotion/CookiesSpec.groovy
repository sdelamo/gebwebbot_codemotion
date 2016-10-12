package codemotion

import codemotion.geb.AgendaPage
import codemotion.geb.GebUtils
import geb.Browser
import spock.lang.Specification

class CookiesSpec extends Specification {

    def "verify codemotion website stores cookies"() {

        when:
        def browser = new Browser()
        browser.baseUrl = 'http://2016.codemotion.es/'
        browser.to AgendaPage
        def cookiesStr = GebUtils.getCookiesAsString(browser)
        then:
        cookiesStr
    }
}