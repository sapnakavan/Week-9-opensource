package firefoxtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverTesting {
    public static void main(String[] args) {
         FirefoxDriverTesting f = new FirefoxDriverTesting();
         f.m();
    }
    public void m(){
        String baseURL = "https://opensource-demo.orangehrmlive.com/";//storing base url
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//creating object for firefox
        driver.get(baseURL);
        driver.manage().window().maximize();
        String t = driver.getTitle();
        System.out.println(t);
        driver.close();
    }
}
