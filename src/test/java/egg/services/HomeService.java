package egg.services;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import egg.constants.BaseConstant;
import egg.constants.HomeConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeService {

    private WebDriver driver = null;

    public HomeService(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }
    

    public void ingresarEnLaWebGoogle() {
        driver.get(BaseConstant.URL_GOOGLE);
    }

    public void ingresarTextoEnElBuscador(String string) {
        WebElement buscador = driver.findElement(By.id(BaseConstant.TEXTAREA_SEARCH_ID));
        buscador.sendKeys(string);
    }

    public void elUsuarioHaceClickEnBuscar() {
        WebElement botonBuscador = driver.findElement(By.cssSelector(BaseConstant.BOTON_SEARCH_CSS));
        botonBuscador.click();
    }

    public void seleccionarResultadoEnGoogle() {
        WebElement resultado = driver.findElement(By.className(BaseConstant.RESULTADO_CLASSNAME));
        resultado.click();
    }

    public void comprobarEstarEnPaginaPrincipal() {
        WebElement titulo = driver.findElement(By.cssSelector(HomeConstants.TITULO_HOME_PAGE));
        String contenidoTitulo = titulo.getText();
        String contenidoEsperado = "Tools & techniques that elevate teams to greatness";
        Assertions.assertEquals(contenidoEsperado, contenidoTitulo);
        driver.quit();
    }
    
}
