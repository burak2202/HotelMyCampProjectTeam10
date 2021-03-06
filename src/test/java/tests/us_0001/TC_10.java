package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_10 extends TestBaseRapor {
    //TC10-Instagram fotograflari gorunebilir olmali
    HMCPage hmcPage=new HMCPage();
    @Test
    public void test(){
        hmcPage=new HMCPage();
        extentTest=extentReports.createTest("TC10 Instagram resimleri gorunurlugu testi","Instagram resimleri gorunurlugu testi");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        JSUtils.scrollIntoVIewJS(hmcPage.mainPagesectionInstagram);
        ReusableMethods.waitFor(5);
        hmcPage.mainPageInstagramFotograflarListesi.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
        extentTest.pass("Instagram resimleri gorulmektedir");

    }
}
