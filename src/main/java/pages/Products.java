package pages;

import drivers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

/**
 * Created by norrm015 on 11/2/15.
 */
public class Products {

    public static ArrayList<String> addMagnanimousPostShave(String url,String driverString){

        /** */
        ArrayList<String> fails = new ArrayList<>();

        /** */
        WebDriver driver = drivers.Driver.getDriver(driverString);

        /** */
        driver.get(url);

        /** find and add Maganimous post shave */
        Driver.clickWait(Driver.findElement(driver, By.id("ember1612"), fails), 1000, fails);
        Driver.clickWait(Driver.findElement(driver, By.id("ember1985"), fails).findElement(By.className("orange")), 1000, fails);
        Driver.click(Driver.findElement(driver, By.id("ember2225"), fails), fails);
        Driver.click(Driver.findElement(driver, By.className("wide"), fails), fails);
        Driver.click(Driver.findElement(driver, By.id("ember2271"), fails), fails);


        /** find and add Boogie's Dream Hair Cream */
        Driver.click(Driver.findElement(driver, By.id("ember2387"), fails), fails);
        Driver.click(Driver.findElement(driver, By.id("ember2485"), fails), fails);
        Driver.click(Driver.findElement(driver, By.className("orange"), fails), fails);
        Driver.click(Driver.findElement(driver, By.className("wide"), fails), fails);


        /** Check to see if tests added two Magnanimous post shave products to the box */
        if(!Driver.findElement(driver,By.id("ember2749"),fails).findElement(By.className("tertiary")).getText().contains("2")){
           fails.add("Failed to add two Magnanimous post shave products");
        }


        /** Check to see if Boogies Dream Hair Cream was added to the box */
        if(!Driver.findElement(driver,By.id("ember2759"),fails).findElement(By.className("subtotal")).getText().contains("3")){
            fails.add("Failed to add Boogie's Dream Hair Cream");
        }

        /** click on quantity */
        Driver.click(Driver.findElement(driver,By.id("ember2752"),fails).findElement(By.className("tertiary")), fails);

        /** click on the minus sign */
        Driver.click(Driver.findElement(driver,By.id("ember2804"),fails),fails);

        /** click the remove button*/
        Driver.click(Driver.findElement(driver,By.className("last"),fails),fails);

        /** click on the box */
        Driver.click(Driver.findElement(driver, By.id("ember2850"), fails),fails);

        /** check to see if boogie's Dream Hair Cream was deleted */
        if(!Driver.findElement(driver,By.id("ember2970"),fails).findElement(By.className("subtotal")).getText().contains("2")){
            fails.add("Failed to delete Boogie's Dream Hair Cream");
        }


        /** */
        driver.quit();

        return fails;

    }

}
