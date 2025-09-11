package Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Above {
    public static void main(String[] args) {
        xpathLocator();
    }
    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/HTML_selenium/sample.html");

            //using cssSelector enter userName and password
            chrome.findElement(RelativeLocator.
                    with(By.tagName("input")).
                    above(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");
            Thread.sleep(1000);

            chrome.close();
        }catch(Exception e){
            e.printStackTrace();

        }
        finally{
            chrome = null;
        }
    }

}
