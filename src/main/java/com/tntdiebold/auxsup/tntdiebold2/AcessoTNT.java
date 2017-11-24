package com.tntdiebold.auxsup.tntdiebold2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcessoTNT {
    
    public static void main(String[] args) throws InterruptedException {
        
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);  
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver(caps);
        driver.get("http://www.google.com.br/");
        System.out.println(driver.getCurrentUrl());
        
//        WebElement campos =  driver.findElement(By.name("txtLogin"));
//        campos.sendKeys("administrator");
        
//        campos = driver.findElement(By.name("txtPassword"));
//        campos.sendKeys("Administrator@123");
        
        
        
        
               
    }
    
    
    
}
