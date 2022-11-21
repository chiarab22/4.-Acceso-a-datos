# 4. Acceso a datos

Práctica 4 de Programación Concurrente de Acceso a datos

Link al repositorio: https://github.com/chiarab22/4.-Acceso-a-datos.git

### Práctica 1.1
Enunciado
Se debe implementar una aplicación que gestione información almacenándola y recuperándola de fichero. Se pensará en un supuesto real en el que exista un tipo de objeto y se creará la aplicación para gestionarlo.

### Requisitos 
- Se debe gestionar información de un tipo de objeto con, al menos, 5 atributos. Deben aparecer, al menos, datos de tipo cadena, número (entero y decimal) e imágenes.
- De cada objeto el usuario podrá dar de alta, modificar y eliminar
- La aplicación será capaz de almacenar toda la información en disco en una ubicación fija de forma transparente para el usuario. La carga de los datos se realizará durante la carga de la aplicación
- Se deberá comentar el código
- La aplicación contará con un listado para cada tipo de objeto de forma que el usuario pueda acceder a cualquiera de ellos directamente para ver su información
Otras funcionalidades 
- La aplicación contará con una opción de búsqueda avanzada desde la que se podrá buscar algún objeto
- La aplicación dispondrá de una opción de guardar como que permitirá almacenar los datos en una ubicación alternativa
- Añadir la opción de que sea el usuario quién decida cuando realizar el guardado de los datos, en lugar de hacerlo de forma transparente
- Permitir al usuario cambiar, desde la aplicación, la ruta fija donde se almacenan los ficheros
- Añadir una opción a la aplicación que permita eliminar todos los datos del programa
- Activar/Desactivar los controles del interfaz de forma que no se permita al usuario utilizar aquellos que no deba usar en cada momento
- Añadir una opción al usuario que permita recuperar el último elemento borrado

### Práctica 2.1
Enunciado
Siguiendo el mismo diseño de la aplicación de las práctica 1.1, se deberá implementar una aplicación que conecte con una Base de Datos en MySQL, según los requisitos que se enumeran a continuación

### Requisitos 
- La aplicación deberá conectar con una Base de Datos de forma transparente para el usuario, de forma que los datos de conexión puedan configurarse en un fichero a parte (fichero properties)
- El usuario tiene que poder dar de alta, modificar y eliminar datos
- Mostrar todos los registros en un JList
- Implementar un sistema de autenticación de usuarios para la aplicación
- Añadir alguna forma de búsqueda
Otras funcionalidades 
- Ejecución de dos funciones almacenadas (a través del interfaz) realizando alguna tarea útil para la aplicación
- Ejecución de dos procedimientos almacenados (a través del interfaz) realizando alguna tarea útil para la aplicación
- Uso de transacciones para realizar alguna operación compleja (de alta, baja o modificación)
- Que la aplicación sea también capaz de conectar con una Base de Datos en PostgreSQL
- Añadir soporte para multiusuario, implementando lo necesario para que varios usuarios simultáneos puedan trabajar con la aplicación sin que se produzcan problemas (por ejemplo, que dos usuarios estén modificando el mismo elemento)
- Utilizar la herramienta Git (y GitHub) durante todo el desarrollo de la aplicación. Utilizar el gestor de Issues para los problemas/fallos que vayan surgiendo
- Añadir una opción al usuario que permita recuperar el último elemento borrado
- Añadir una opción a la aplicación que permita eliminar todos los datos del programa

### Práctica 3.1
Enunciado
Siguiendo el mismo diseño de la aplicación de las práctica 1.1 y 2.1, se deberá implementar una aplicación que conecte con una Base de Datos en MySQL, y utilizando Hibernate, según los requisitos que se enumeran a continuación

### Requisitos 
- La aplicación deberá conectar con una Base de Datos de forma transparente para el usuario, de forma que los datos de conexión puedan configurarse en un fichero a parte (fichero properties)
- El usuario tiene que poder dar de alta, modificar y eliminar datos de dos objetos relacionados entre sí
- Mostrar todos los registros en un JList
- Implementar un sistema de autenticación de usuarios para la aplicación
- Añadir alguna forma de búsqueda
Otras funcionalidades 
- Añadir una opción que permita exportar los datos de la aplicación (a JSON, XML, . . .)
- Añadir una opción que permita importar datos a la aplicación (JSON, XML, . . .)
- Realizar la aplicación creando y reutilizando algún componente propio
- Trabajar con, al menos, una relación N-M entre objetos de la aplicación
- Añadir soporte para multiusuario, implementando lo necesario para que varios usuarios simultáneos puedan trabajar con la aplicación sin que se produzcan problemas (por ejemplo, que dos usuarios estén modificando el mismo elemento)
- Utilizar la herramienta Git (y GitHub) durante todo el desarrollo de la aplicación. Utilizar el gestor de Issues para los problemas/fallos que vayan surgiendo
- Añadir una opción al usuario que permita recuperar el último elemento borrado
- Añadir una opción a la aplicación que permita eliminar todos los datos del programa

### Práctica 4.1
Enunciado
Siguiendo el mismo diseño de la aplicación de las práctica 1.1, 2.1 y 3.1, se deberá implementar una aplicación que conecte con una base de datos NoSQL (MongoDB), según los requisitos que se enumeran a continuación

### Requisitos 
- La Base de Datos contendrá, al menos, 2 colecciones relacionadas entre ellas.
- Se podrá llevar a cabo el alta de documentos.
- Se podrá llevar a cabo la modificación de documentos.
- Se podrá llevar a cabo la baja de documentos.
- Se podrán llevar a cabo búsquedas simples (por un campo) y complejas (utilizando condiciones para más de un campo).
Otras funcionalidades 
- Ampliar la base de datos a 4 colecciones.
- Utilizar alguna colección que contenga estructuras complejas (arrays, datos estructurados, . . .).
- Implementar un mecanismo de usuario/contraseña.
- Implementar una barra de estado donde mostrar un resumen de los datos que visualiza el usuario en cada momento (qué datos, cuantos objetos, qué objeto tiene  -seleccionado actualmente y los mensajes oportunos según la acción que realice).
- La aplicación refrescará los datos mostrados de forma automática antes posibles cambios en la base de datos.
- Permitir importar datos desde una base de datos relacional (MySQL, por ejemplo) a alguna colección de la aplicación.
- Permitir exportar datos a alguna tabla de una base de datos relacional (MySQL, por ejemplo).
- Permitir exportar datos de colecciones como ficheros CSV.
- Permitir importar datos de colecciones desde un fichero CSV.
