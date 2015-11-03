import interfaces.dollarShaveClub;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.Products;

import java.util.ArrayList;

/**
 * Created by norrm015 on 11/2/15.
 */

public class DollarShaveClubFeTest implements dollarShaveClub {

    private String siteUrl;
    private String driver;
    public void siteURL(String siteUrl) {this.siteUrl = siteUrl;}
    public void driver(String driver) {this.driver = driver;}


    @Before
    public void setUpBeforeClass(){

        siteURL(System.getProperty("siteUrl"));
        driver(System.getProperty("driver"));

    }

    /**
     * Starting on https://www.dollarshaveclub.com/our-products, write 2 test scripts using your preferred framework:
     * 1. Verify that the guest can add two “Magnanimous Post Shave” moisturrizers.
     * 2. Verify that the guest can remove boogies “Dream Hair Cream” from their box
     */
    @Test
    public void TestDollarShaveClubFe(){

            ArrayList<String> fails;
            fails = Products.addMagnanimousPostShave(siteUrl,driver);
            Assert.assertEquals(new ArrayList<String>(0), fails);
        }


}

