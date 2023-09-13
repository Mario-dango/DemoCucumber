package egg.steps;

import egg.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep {

    private HomeService homeService = null;
    
    public HomeStep() {
        this.homeService = new HomeService();
    }

    @Given("El usuario debe de estár en la web de google")
    public void elUsuarioIngresaALaWeb(){
        homeService.ingresarEnLaWebGoogle();
    }
    
    @When("ingresa {string} en el buscador de google")
    public void elUsuarioIngresaTextoEnElBuscador(String string){
        homeService.ingresarTextoEnElBuscador(string);
    }
    
    @And("procede a hacerle click al boton buscar")
    public void elUsuarioHaceClickEnBuscar(){
        homeService.elUsuarioHaceClickEnBuscar();
    }
    
    @And("selecciona el resultado de cucumber.io")
    public void elUsuarioSeleccionaElResultado(){
        homeService.seleccionarResultadoEnGoogle();
    }
    
    @Then("El usuario visualiza la pagina principal")
    public void elUsuarioCompruebaEstarEnLaPaginaPrincipalDeCucumber(){
        homeService.comprobarEstarEnPaginaPrincipal();
    }
}
