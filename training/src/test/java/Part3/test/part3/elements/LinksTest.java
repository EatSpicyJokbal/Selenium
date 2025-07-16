package Part3.test.part3.elements;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() {
        var linksPage = homePage.goToElements().clickLinksPage();
        linksPage.clickBadResponse();
        String actualResult = linksPage.getResponse();
        assertTrue(actualResult.contains("Bad Request") 
            && actualResult.contains("400"), "\n Result doesn't contain 400 and Bad Request text.\n");
    }
}
