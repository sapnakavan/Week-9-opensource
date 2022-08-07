package edgetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverTesting {
    public static void main(String[] args) {
         EdgeDriverTesting e = new EdgeDriverTesting();
         e.m();
    }
    public void m(){
        String baseURL ="https://opensource-demo.orangehrmlive.com/";//storing base url
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//creating object for edge driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String t =driver.getTitle();
        System.out.println(t);
        driver.close();
    }
}
