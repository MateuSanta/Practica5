# Practica 5: Calculadora

### Carlos Herrera 

### Mateu Santandreu   

 1ºDaw

 Entornos de desarrollo
 
 
 
 

Para la realización de esta práctica hemos utilizado como IDE NetBeans que incorpora por defecto los tests de Junit y hemos utilizado la terminal de git para realizar el control de versiones e interactuar con nuestro repositorio de github.

El objetivo de esta práctica es crear una interfaz "ICalculadora" que albergará los métodos sumar, restar, multiplicar y dividir; que después deberán ser implementados en una clase "Calculadora".
Una vez hecho esto se deberá realizar una batería de pruebas utilizando Junit para comprobar el funcionamiento en diferentes casos de los métodos que hemos implementado, corrigiendo los errores que puedan aparecer a medida que vamos realizando diferentes pruebas.
  
  
  ### Crear repositorio en github
  El primer paso a realizar es crear un nuevo repositorio en github que nos servirá para guardar los archivos creados en el transcurso de la práctica.
  Para ello desde nuestro perfil de github deberemos pinchar sobre el botón <<new>> en el apartado de repositorios.
  A continuación nos aparecerá un menú con una serie de opciones a elegir para nuestro repositorio, aquí daremos nombre a nuestro repositorio, en este       caso, Practica5, nos aseguraremos de que la visibilidad sea pública y pincharemos en crear repositorio.
  Github nos mostrará diferentes opciones de la cual nos quedaremos con la de subir un repositorio ya existente, por lo que guardaremos los tres comandos     que nso aparecen en pantalla para utilizarlos más adelante.
  

  
  ### Creación del proyecto
  Lo siguiente que haremos es crear un nuevo proyecto en NetBeans, y en este nuevo proyecto crearemos una nueva interfaz con el nombre "ICalculadora".
  En esta interfaz crearemos los métodos sumar(), restar(), multiplicar() y dividir(); todos ellos recibirán como parámetros dos números del tipo      "double" y devolverán un número del mismo tipo.
  
  ![Calculadora - Apache NetBeans IDE 13_005](https://user-images.githubusercontent.com/91744455/168466430-eebd19b1-a671-4b54-a26c-24e67f957641.png)
  

 
 Una vez creada la interfaz crearemos una nueva clase llamada "Calculadora" en que implementaremos esta interfaz y los métodos que se han declarado en ella.
 ![Calculadora - Apache NetBeans IDE 13_004](https://user-images.githubusercontent.com/91744455/168466519-d642408f-a4e6-4815-b914-9de1512fd2ff.png)

 ### Primer commit
 Ahora que ya tenemos parte de la práctica realizada es el momento de utilizar git para el control de versiones de nuestro proyecto.
 para ello accedemos desde el terminal a la carpeta que alberga nuestro proyecto y ejecutamos el comando ``git init``, después creamos el archivo "gitignore" utilizando el comando ``nano .gitignore``, añadimos los archivos a la rama master usando ``git add --all`` y realizamos el primer commit :
 ``git commit -am "commit inicial"``.
 
 Una vez hecho esto rescataremo los comandos que nos había proporcionado github al crear el repositorio y los ejecutaremos desde la terminal, nos pedirá nuestro usuario de github y la contraseña que, en este caso, se tratará del token de acceso que tengamos en nuestra cuenta y ya tendremos nuestro primer commit hecho en github.
 
 
 
 
