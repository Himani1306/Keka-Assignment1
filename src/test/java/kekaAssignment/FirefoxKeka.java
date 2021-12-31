package kekaAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxKeka {
    public static void main(String[] args) {
        WebDriver driver;
        ReadData excel=new ReadData("DataTest/keka-TestData.xlsx");
        System.setProperty("webdriver.gecko.driver","src/test/geckodriver-v0.30.0-linux64/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.get("https://app.keka.com/Account/Login?ReturnUrl=%2F");
        driver.findElement(By.id("email")).sendKeys(excel.getData(0,0,0));
        driver.findElement(By.cssSelector("div.login-container:nth-child(3) table.login-container-layout div.login-form-container div.credentials-container form:nth-child(5) div.login-form:nth-child(1) div.form-group div.login-button > button.btn.login-from-btn")).click();
        driver.findElement(By.cssSelector("div.login-container:nth-child(3) table.login-container-layout div.login-form-container div.credentials-container div.form-group:nth-child(6) form.form-horizontal.inline-block.external-login-button-container > button.btn.btn-danger.btn-login.btn-google-login:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body.nyoS7c.UzCXuf.EIlDfe:nth-child(2) div.H2SoFe.LZgQXe.TFhTPc:nth-child(1) div.RAYh1e.LZgQXe.qmmlRd div.xkfVF div.Aa1VU div.JhUD8d.SQNfcc.vLGJgb div.zWl5kd div.DRS7Fe.bxPAYd.k6Zj8d div.pwWryf.bxPAYd:nth-child(2) div.Wxwduf.Us7fWe.JhUD8d div.zQJV3 div.dG5hZc div.qhFLie div.FliLIb.DL0QTb div.VfPpkd-dgl2Hf-ppHlrf-sM5MNb button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.qIypjc.TrZEUc.lw1w4b > span.VfPpkd-vQzf8d")).click();
        driver.findElement(By.name("password")).sendKeys(excel.getData(0,0,1));
        driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/xhr-app-root/div/xhr-left-nav/nav/div/ul/li[2]/a/span[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Attendance')]")).click();
        driver.findElement(By.xpath("(//a[@id='menu']/span)[3]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Regularize')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'+Add Log')]")).click();
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div/div/div/div/div[1]/div[2]/input")).sendKeys("9.45");
        driver.findElement(By.xpath("/html/body/modal-container/div/div/attendance-adjustment-request/div[2]/form/div[2]/div/div/div/div/div/div[1]/div[3]/input")).sendKeys("6.45");
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/attendance-adjustment-request[1]/div[2]/form[1]/div[3]/div[1]/textarea[1]")).sendKeys(excel.getData(0,1,0));
        //driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();




    }
}


