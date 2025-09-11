package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abscss_tofind_second_password {
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
            chrome.findElement(By.cssSelector("html body form[id='frm2'] input[id='frm1_pwd_id']")).sendKeys("aaaaaaaaa");
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
