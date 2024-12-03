# conversorDeMonedas
Proyecto del reto de ALURA, sobre el challenge de conversor de monedas

# DESCRIPCION
Al deployar el proyecto, nos muestra un menú inicial para escoger dentro de las dos opciones que nos presenta

![image](https://github.com/user-attachments/assets/e0b31e9e-7fdb-4ff7-812b-fbf4207ac9e5)

Para entrar a dichas opciones sólo hay que dijitar 1 o 2, para entrar a las opciones correspondientes

* Covertir monedas

  Dentro de la opcion de "Convertir monedas" nos aparece un listado de las claves de monedas que podemos convertir
  
  ![image](https://github.com/user-attachments/assets/21bea9c1-ba8a-408c-9942-be0740049da0)

  Solamente es cuestion de digitar la clave de la moneda que desees convertir, así como en la imagen.

  Para después digitar la cantidad de la "Moneda base" que deseas convertir a la "Moneda destino"

  ![image](https://github.com/user-attachments/assets/773e97fa-20d2-4767-8f9f-7cd2a6f8d16d)

  Una vez digites la cantidad que quieres conertir y presiones enter. Automáticamente el proyecto generará un archivo llamado "Historico".
  Es un archivo .txt para almacenar los registros de conversiones que realices. Así también, dentro de la consola te muestra el resultado de la conversión que acabas de realizar.

  Y ahora puedes solicitar que el programa te muestre nuevamente el menú para realizar más coversiones o consultar tu historial de conversiones. Para ello sólo debes digitar S(Sí) o N(No) para indicarle al sistema que deseas continuar o no.

* Consultar historico de conversiones

  Ahora, dentro de la segunda opción del menú del sistema que apunta a "Consultar historico de conversiones", podremos consultar el archivo mensionado en el punto anterior e imprimir su contenido en la consola.
  
  ![image](https://github.com/user-attachments/assets/a56f7188-f3a7-4683-b330-6b4a3f217e22)

  Y nos muestra los registros de las conversiones que hemos realizado, con el siguiente formato: 
  
  **Moneda base: USD**
  
  **Moneda destino: MXN**

  **Valor de conversion por moneda destino: 20.4239**
  
  **Cantidad de USD a convertir: 2500**
  
  **Resutado de conversion: 51059.75**
  
  **Fecha de operación: 03/12/2024 10:37**

Y ese sería el proceso del sistema de "Conversor de monedas", donde podemos realizar las conversiones que queramos, de las monedas que se encuentren disponibles en el sistema