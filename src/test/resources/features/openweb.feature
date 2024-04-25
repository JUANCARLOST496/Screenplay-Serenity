#autho: Juan Carlos
#language: es

  Característica: Abrir una pagina
    Yo como Juan quiero realializar una prueba y abrir una pagin para comprobar el comprotamiento


    Antecedentes:
      Dado "Juan" abre el sitio web de pruebas

    @test
    Escenario: Abrir browser
       Y deseo validar funcion carta de elementos
       Cuando selecciona aleatoriamente alguna de las funciones
       Entonces vizualizas en la cabezaera el nombre de le opcion elegida
