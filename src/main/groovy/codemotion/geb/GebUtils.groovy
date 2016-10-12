package codemotion.geb

import geb.Browser
import org.openqa.selenium.Cookie

class GebUtils {
    private static String getCookiesAsString(Browser browser, String delimiter = ';') {
        Set<Cookie> cookies = browser.driver.manage().getCookies()
        String cookiesStr = null
        if ( cookies ) {
            cookiesStr = cookies.collect { Cookie cookie -> "${cookie.name}=${cookie.value}" }.join(delimiter)
        }
        cookiesStr
    }
}
