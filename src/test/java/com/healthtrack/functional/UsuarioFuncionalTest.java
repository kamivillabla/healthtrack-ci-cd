package com.healthtrack.functional;

import com.healthtrack.util.SeleniumHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioFuncionalTest {

    private WebDriver driver;

    @BeforeEach
    public void abrirNavegador() {
        driver = SeleniumHelper.iniciarDriver();
    }

    @AfterEach
    public void cerrarNavegador() {
        SeleniumHelper.cerrarDriver(driver);
    }

    @Test
    public void testFlujoActualizarPeso() throws InterruptedException {
        driver.get("http://localhost:8080/");

        driver.findElement(By.name("peso")).clear();
        driver.findElement(By.name("peso")).sendKeys("66.0");
        driver.findElement(By.name("peso")).submit();

        Thread.sleep(700); 
        String pesoActual = driver.findElement(By.id("pesoActual")).getText();
        assertTrue(pesoActual.contains("66.0"));
    }
}