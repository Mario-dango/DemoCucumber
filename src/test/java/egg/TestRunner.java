package egg;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Ruta a tus archivos .feature
    glue = "egg.steps", // Ruta al paquete donde se encuentran tus clases de pasos
    plugin = {"pretty", "html:target/cucumber-reports"} // Puedes personalizar los informes aquí
)
public class TestRunner {
    // Esta clase está vacía ya que JUnit y Cucumber se encargarán de ejecutar las pruebas.
}

