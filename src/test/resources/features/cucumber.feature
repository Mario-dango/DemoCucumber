# Nota mental:
#   Si agregas un decorador distinto de @Test no se ejecutará cuando ejecutes mvn test
#   ya que el TestRunner.java tiene tags="@Test" por lo que distinto a ello no ejecuta por default
#   
#   Si deseas agregar un tag nuevo cómo @smoke a la par o no del @Test, es posible, 
#   a la hora de ejecutar el comando debe de ser: mvn test -Dcucumber.filter.tags="@smoke"

Feature: Probar pagina de cucumber

    Escenario de ejemplo para la aplicación de Gherkin usando cucumber
    El usuario abre el navvegador de chrome y navega hasta la pagina
    principal del framework cucumber

    @Smoke @Test
        Scenario: El usuario ingresa a la web principal
            Given El usuario debe de estár en la web de google
             When ingresa "cucumber" en el buscador de google
              And procede a hacerle click al boton buscar
              And selecciona el resultado de cucumber.io
             Then El usuario visualiza la pagina principal
