# EJEMPLOS DE COMO ACCEDER A BASES DE DATOS MySQL DESDE JAVA (EN INTELLIJ IDEA)

## COPIA DEL REPOSITORIO REMOTO EN SU COMPUTADORA LOCAL


Si así lo desea, puede crear una copia local de este repositorio, pero para que pueda estar subiendo a su propio repositorio los cambios que le vaya haciendo, debe hacer lo siguiente:
1. Haga un fork (copia de este repositorio en su propia cuenta de Github) dando click en la opción Fork que aparece arriba a la derecha del nombre del repositorio

2. Entre al repositorio creado

3. En tal página dé click en el botón Code y copie el URL que aparece en el cuadro de texto de nombre **Clone with HTTPS** (comienza con *https://*)

4. Abre IntelliJ IDEA e indica que harás un clon local de tu repositorio:
   - Si no tienes ningún repositorio abierto selecciona la opción **Get From VCS** de la Ventana de Bienvenida, o si tienes un proyecto abierto, puedes entrar al menú **File->New**  y seleccionar la opción **Project From Version Control...**
   - En el cuadro de diálogo que aparece:
     - Selecciona Git
     - Pega el URL que copiaste en el paso 3 en el cuadro de texto **URL**
     - Por default en Directory se coloca una ruta donde se clonara el repositorio con un nombre igual al repositorio, si quieres que tenga otro nombre, modificalo (da click en el icono de carpeta , navega a donde lo quieres colocar y da click en el icono de New Folder para crear una nueva carpeta)
     - Da click en **Clone**
     - Si te pide usuario y clave de Github proporciona esos datos
     - Después de unos segundos tendrás un clon/copia de tu repositorio listo para trabajar en Intellij IDEA

## EjemploJDBC.java

Este archivo contiene un ejemplo de como acceder a la base de datos usando **DriverManager**


## EjemploJDBCDataSource.java

Este archivo contiene un ejemplo de como acceder a la base de datos usando una implementación específica de la interface **DataSource**

## NOTAS IMPORTANTES

En ambos ejemplos se asume que la base de datos a usar se denomina **poo2** y que se conectará con el usuario **usuario2022** y clave **clavecita** (que son la base de datos y usuario creados en las sesiones previas). Modifique estos datos si no coinciden con su configuración.

En el archivo build.gradle de la app, se indica que como dependencia se requiere del driver de MySQL