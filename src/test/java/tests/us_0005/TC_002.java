package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;

public class TC_002 {
    @Test
    public void test(){
        HMCPage hmcPage = new HMCPage();

        //Hotel anasayfasina gidin
        // Login butonuna tıklayın
        //geçerli bir username girin
        //geçerli bir password girin
        //Log in  tusuna basin
        hmcPage.girisYap();
        //Hotel Management menüsüne tıklayın
        hmcPage.hotelManagementLinki.click();
        //Hotel List menüsüne tıklayın
        hmcPage.hotelListLinki.click();
        //Details butonuna tıklayın

        //"Edit Hotel" başlığının görünürlüğünü kontrol edin
        //Assert.assertTrue();
    }
}