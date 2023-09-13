Feature: Probar pagina de cucumber

    El usuario ingresa a la web oficial de cucumber y explora sus funcionalidades

    @Test
    das9jd 09jewag
    Scenario: El usuario ingresa a la web principal
        Given El usuario debe de estár en la web de google
        When ingresa "cucumber" en el buscador de google
        And procede a hacerle click al boton buscar
        And selecciona el resultado de cucumber.io
        Then El usuario visualiza la pagina principal
            