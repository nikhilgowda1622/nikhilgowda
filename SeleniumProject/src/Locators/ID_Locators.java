package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Locators {
    public static void main(String[] args) {
        idLocator();
    }
    public static void idLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/HTML_selenium/sample.html");

            //using id enter userName and password
            chrome.findElement(By.id("frm1_un_id")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.id("frm1_pwd_id")).sendKeys("bbbbbbbbbbb");
            Thread.sleep(2000);

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
