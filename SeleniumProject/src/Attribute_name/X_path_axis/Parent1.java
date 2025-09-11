package Attribute_name.X_path_axis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent1 {
    public static void main(String[] args) {
        xpathLocator();
    }
    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/HTML_selenium/sample1.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//tbody/parent::table")).getDomAttribute("id");
            System.out.println("id");
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
