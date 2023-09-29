
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Decorador para correr con cucumber
@RunWith(Cucumber.class)        

//Configuración de las opciones de cucumber
@CucumberOptions(
        //      Comprueba que los steps del feature estén definidos, ¡Si es true -> no ejecuta pruebas solamente verifica!.
        dryRun = false,
        //      Indica donde estan los archivos features a correr
        features = "src/test/resources/features",
        //      Indica el paquete en donde se encuentran las clases Steps que unen los features con las clases de servicio
        glue = "egg.steps",
        //      Ejecuta aquellos features que contienen la etiqueta mencionada en su valor
        tags = "(@Exito or @Smoke) and @Test", // Ejemplo cuando se ejecute mvn test solo los features que tendran los tag @Test Y alguno de los de @Smoke o @Exito serán corridos.
        //      Indica que cada línea del feature cómo una prueba independiente que se ejecuta
        stepNotifications = false,
        //      Genera un registro HTML de los resultados de la prueba
        plugin = {"pretty", "html:target/cucumber.html",
                "junit:target/cucumber.xml",
                "json:target/cucumber-report.json"},
        //      Habilita que la ejecución de cada línea del feature se vea con colores de acuerdo con su estado/resultado de ejecución
        monochrome = false
)
public class TestRunner {
}

/****   BY MARIO PAPETTI 
Por aquí tienes una descripción de los campos más comunes que se 
pueden configurar en la anotación @CucumberOptions de Cucumber:

features: Indica la ubicación de los archivos .feature que 
        contienen las definiciones de los escenarios de prueba.

glue: Especifica el paquete base donde se encuentran las 
        clases de pasos (step definitions). Cucumber buscará 
        en este paquete para encontrar las clases que coincidan
        con los pasos de los escenarios.

tags: Permite filtrar qué escenarios se ejecutarán en función de
        las etiquetas (tags) definidas en los archivos .feature. 
        Puedes utilizar operadores lógicos como and, or y not 
        para crear condiciones más complejas.

stepNotifications: Controla si se deben mostrar notificaciones 
        detalladas para cada paso en la salida de la ejecución. 
        Si se establece en true, se mostrarán notificaciones 
        detalladas para cada paso.

plugin: Define los plugins de informes que se utilizarán para 
        generar informes de resultados de pruebas. Los plugins 
        pueden generar informes en diferentes formatos, como 
        HTML, JSON, XML, etc.

monochrome: Controla si la salida en la consola se muestra en 
        color. Si se establece en true, la salida de la consola 
        se mostrará en color para resaltar diferentes estados 
        de ejecución.

dryRun: Si se establece en true, Cucumber verificará que todos 
        los pasos de los escenarios tengan definiciones de pasos 
        correspondientes en las clases de pasos. Esto es útil para 
        verificar la integridad de las pruebas sin ejecutarlas.

strict: Si se establece en true, Cucumber tratará los pasos no 
        definidos como errores y la ejecución se detendrá si 
        encuentra pasos no definidos.

name: Permite asignar un nombre a la ejecución de las pruebas. 
        Este nombre se puede utilizar para identificar la 
        ejecución en informes y registros.

snippets: Especifica cómo se deben generar los snippets para 
        los pasos no definidos. Puede ser uno de los 
        siguientes valores: UNDEFINED, CAMELCASE, UNDERSCORE.
        
 */
