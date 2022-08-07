package chrometesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTesting {
    public static void main(String[] args) {
        ChromeDriverTesting c= new ChromeDriverTesting();
        c.m();

    }
    public void m(){
        String baseURL = "https://opensource-demo.orangehrmlive.com/";//storing base url
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//creating object for chrome driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
