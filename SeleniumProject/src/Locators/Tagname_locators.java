package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_locators {
    public static void main(String[] args) {
        tagNameLocator();
    }
    public static void tagNameLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/HTML_selenium/sample.html");

            //using tagname enter userName and password
            chrome.findElement(By.tagName("input")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.tagName("a")).click();
            Thread.sleep(2000);

            chrome.quit();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
