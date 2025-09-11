package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_name_locator {
    public static void main(String[] args) {
        classNameLocator();
    }
    public static void classNameLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/HTML_selenium/sample.html");

            //using name enter userName and password
            chrome.findElement(By.className("frm1_un_class")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.className("frm1_pwd_class")).sendKeys("bbbbbbbbbbb");
            Thread.sleep(2000);

            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
