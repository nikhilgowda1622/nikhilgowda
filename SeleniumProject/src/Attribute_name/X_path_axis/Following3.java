package Attribute_name.X_path_axis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following3 {
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
            String text= chrome.findElement(By.xpath("//td[text()='Abdul Kalam']/following::tr[1]/td[1]")).getText();
            System.out.println("Following text: " + text);
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
