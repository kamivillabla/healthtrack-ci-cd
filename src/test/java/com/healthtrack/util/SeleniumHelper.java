package com.healthtrack.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumHelper {

    public static WebDriver iniciarDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opciones = new ChromeOptions();
        opciones.addArguments("--headless=new"); 
        opciones.addArguments("--no-sandbox");
        opciones.addArguments("--disable-dev-shm-usage");
        opciones.addArguments("--window-size=1200,800");
        return new ChromeDriver(opciones);
    }

    public static void cerrarDriver(WebDriver driver) {
        if (driver != null) driver.quit();
    }
}
