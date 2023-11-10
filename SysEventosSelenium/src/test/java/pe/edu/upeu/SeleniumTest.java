/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu;

/**
 *
 * @author DELL
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

  private WebDriver driver;
  
  Utilx u=new Utilx();

  @BeforeEach
  public void setUp(){
     // u.getFile("chromedriver.exe").getAbsolutePath();
    // Setear el path al chrome driver
    System.setProperty("webdriver.chrome.driver", u.getFile("chromedriver.exe").getAbsolutePath());
    //System.setProperty("webdriver.chrome.driver", "D:\\SOFT-TESTING\\DRIVER\\chromedriver.exe");
    
    
    // Inicializar el driver de Chrome 
    driver = new ChromeDriver();
  }

  @Test
  public void testGooglePage() throws InterruptedException{
    
    // Navegar a la página de Google
    driver.get("https://www.google.com");
    
    // Encontrar el campo de búsqueda por su name
    driver.findElement(By.name("q")).sendKeys("Selenium");
    
    // Click en el botón de búsqueda
    //driver.findElement(By.name("btnK")).click();
    
    // Verificar que el título contiene la palabra "Selenium"
    //Assert.assertTrue(driver.getTitle().contains("Selenium"));
    //Thread.sleep(2000);  
    //driver.quit();
  }

  @AfterEach
  public void tearDown(){
    driver.quit();
  }
}