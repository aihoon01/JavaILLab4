package org.lab4.testingframeworks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorSeleniumTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.edge.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void testCalculatorAddition() {
        driver.get("https://localhost:8080/calculator");

        WebElement input1 = driver.findElement(By.id("input1"));
        WebElement input2 = driver.findElement(By.id("input2"));
        WebElement addButton = driver.findElement(By.id("addButton"));
        WebElement result = driver.findElement(By.id("result"));

        input1.sendKeys("2");
        input2.sendKeys("3");
        addButton.click();

        assertEquals("5", result.getText());
    }
}

