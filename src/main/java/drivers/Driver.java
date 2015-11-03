package drivers;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by norrm015 on 11/2/15.
 */
public class Driver {


        public static final int DEFAULT_TIMEOUT = 10;

        public static WebDriver getDriver(String driverName)  {

            WebDriver driver = null;

            switch (driverName) {

                case "firefox":
                    driver = FireFox.fireFoxDriver();
                    break;
                case "phantomJs":

                    break;
            }

            driver.manage().window().setSize(new Dimension(1920, 1080));
            return driver;
        }

        public static WebElement findElement(WebDriver driver,By locatorKey, ArrayList<String> fails) {

            WebElement element = null;
            WebDriverWait wait = new WebDriverWait(driver,10);

            try{
                wait.until(ExpectedConditions.presenceOfElementLocated(locatorKey));
                element = driver.findElement(locatorKey);

            }catch(Exception e){
                fails.add("failed to find element " + element.toString());
            }

            return element;
        }


        public static List<WebElement> findElements(WebDriver driver,By locatorKey, ArrayList<String> fails){

            List<WebElement> elements = new ArrayList<WebElement>();
            WebDriverWait wait = new WebDriverWait(driver,10);


            try{
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locatorKey));
                elements = driver.findElements(locatorKey);
            }catch(Exception e){

                fails.add("Failed to find elements " + elements.toString());
            }


            return elements;

        }


        public static void sendkeys(WebElement element, String keys){

            element.click();
            element.clear();
            element.sendKeys(keys);

        }

        public static void click(WebElement element, ArrayList<String> fails){

            try {
                element.click();
            }catch(Exception e){

                fails.add("Failed to click on " + element.toString());

            }
        }


        public static void clickWait(WebElement element, long time, ArrayList<String> fails){


            try{
                element.click();
            }catch(Exception e){
                fails.add("Failed to click on element " + element.toString());
            }


            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


}
