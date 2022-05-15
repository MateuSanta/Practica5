# Practica 5: Calculadora

### Carlos Herrera 

### Mateu Santandreu   

 1ºDaw

 Entornos de desarrollo
 
 ```mermaid
    graph LR;
        master((v1.0.0))------->master1((v1.1.0))
        
        
        
        master1((v1.1.0))------->masterfinal((v1.2.0))
        
    
    classDef purple fill:#C261EC ,stroke: black,stroke-width:4px
    classDef red fill:#EC6161 ,stroke: black,stroke-width:4px

    class master purple
    class master1 purple
    class masterfinal purple
    class development red
    
        
    
```
 
 

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
 ![Calculadora : git — Konsole_001](https://user-images.githubusercontent.com/91744455/168466864-73be720c-c33e-4172-9581-bc267f55a965.png)

 
### Tests de Junit
 En este punto el siguiente paso a realizar es implementar los tests de Junit sobre nuestra calculadora, en NetBeans para generar una clase de prueba bastará con pinchar sobre "tools" y después sobre create/update tests.
 Nos aparecerá un menú con muchas opciones sobre la creción de los tests, elegiremos como tipo de test Junit4 y desmarcaremos todos los métodos creados por defecto, solo dejaremos marcadas las opciones que aparecen  la derecha para que NetBeans nos cree los "imports" necesarios y nos declare los métodos de prueba para cada método de nuestra clase.
Por defecto los métodos contendrán una llamada al método "fail" que deberemos sustituir ya que este método siempre arroja un error.
Lo que pondremos en el cuerpo de cada método de prueba serán dos variables, una que almacenrá el resultado de llamar al método que queremos probar y otra que contendrá el resultado esperado que debería devolver para así poder compararlas.
 Para comparar las variables haremos una llamada al método "assertEquals()" y le pasaremos tres parámetros, el primero será el resultado esperado, el segundo el resultado obtenido y el tercero el margen de error tolerable.
 
 ### Segundo commit 
 Ahora realizaremos el segundo commit a github y actualizaremos la versión a la v1.1.0.
 ![Calculadora : zsh — Konsole_001](https://user-images.githubusercontent.com/91744455/168467357-78ded861-d6fe-403f-8b1c-04446a891e98.png)

 
 ### Realizando las pruebas
 
 ![Calculadora - Apache NetBeans IDE 13_001](https://user-images.githubusercontent.com/91744455/168467282-5715d49c-5ad1-4660-9e96-6c62af4d6ab8.png)
En esta imágen se puede ver como al haber dejado como márgen de error cero, los métodos de multiplicar y dividir nos arrojan un fallo cuando los parámetros que le pasamos son números con una parte decimal debido al redondeo, por lo que nos da un 50% de error en nuestra calculadora.
 
 Para corregir este error modificamos el margen de error de los métodos multiplacar y dividir de 0 a 0.01.
 ![Calculadora - Apache NetBeans IDE 13_003](https://user-images.githubusercontent.com/91744455/168467463-f5ffd28a-7a8f-4c10-8fa9-cb3199945469.png)

 Ahora que nuestras pruebas se pasan al 100% solo faltaría añadir comentarios en formato javadoc y realizar el commit final.
 
