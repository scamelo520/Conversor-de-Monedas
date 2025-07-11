<h1 align="center"> Conversor De Monedas </h1>

<p align="center"> <img width="561" height="433" alt="image" src="https://png.pngtree.com/png-vector/20220630/ourlarge/pngtree-money-changer-logo-iconvector-white-concept-finance-vector-png-image_37464202.png" /> </p>

Esta aplicación de consola en Java permite a los usuarios convertir divisas entre diferentes monedas. Utiliza la API ExchangeRate-API para obtener las tasas de cambio en tiempo real y ofrece una interfaz de menú simple para seleccionar las monedas de origen y destino, así como la cantidad a convertir.

## Índice
* [Título e Imagen](#Título-e-imagen)
* [Índice](#índice)
* [Descripción del proyecto](#descripción-del-proyecto)
* [Estado del proyecto](#Estado-del-proyecto)
* [Características de la aplicación y demostración](#Funcionalidades-de-la-aplicacion)
* [Acceso al proyecto/Abre y Ejecuta el proyecto](#acceso-al-proyecto)
* [Tecnologías utilizadas](#tecnologías-utilizadas)
* [Personas-Desarrolladores del Proyecto](#Autores)

## Estado del Proyecto
:white_check_mark: Proyecto Terminado :white_check_mark:


## :hammer:Funcionalidades de la Aplicacion
- `Conversión de Divisas`: Convierte entre un conjunto predefinido de monedas (USD, EUR, BRL, COP).
  
  <img width="561" height="433" alt="image" src="https://github.com/user-attachments/assets/7d2e5804-5a82-43c8-a278-3f5982a8ad98" />

- `API ExchangeRate-API`: Obtiene las tasas de cambio actualizadas directamente desde la API ExchangeRate-API.
- `Manejo de Errores`: Incluye manejo de excepciones para entradas inválidas del usuario (InputMismatchException) y errores de conexión a la API.


## 📁 Acceso al proyecto
1. Clona este repositorio: git clone [[URL del repositorio](https://github.com/scamelo520/Conversor-de-Monedas.git)]
   
## 🛠️ Abre y ejecuta el proyecto
2. Abre el proyecto en tu IDE Java preferido [IntelliJ IDEA, Eclipse, etc.(las intrucciones serán con IntelliJ)]
3. Asegúrate de tener Java Development Kit (JDK) 17 o superior instalado.
4. Descarga el archivo JAR de Gson:
  - Abre tu navegador web y ve al repositorio de Maven Central para Gson: https://mvnrepository.com/artifact/com.google.code.gson/gson
  - Busca la versión de Gson 2.10.1 y haz clic en ella.
  - En la página de la versión, busca la sección "Files" y descarga el archivo JAR (por ejemplo, gson-2.10.1.jar).
5. Agrega el archivo JAR de Gson al classpath de tu proyecto:
  - Ve a File > Project Structure.
  - Selecciona Modules en el panel izquierdo.
  - Selecciona tu módulo (generalmente llamado main).
  - Haz clic en la pestaña Dependencies.
  - Haz clic en el botón + (Add) y selecciona JARs or directories....
  - Navega hasta la ubicación donde descargaste el archivo gson-2.10.1.jar, selecciónalo y haz clic en OK.
  - Asegúrate de que el alcance (Scope) de la dependencia sea Compile.
  - Haz clic en OK para cerrar la ventana Project Structure.

## :computer: Tecnologías Utilizadas
- `Lenguaje`: Java
- `API`: ExchangeRate-API (v6)
- `Librerías`: Gson: Para la deserialización de la respuesta JSON de la API.

## Autores
<img src="https://avatars.githubusercontent.com/u/196546316?v=4" width=115><br><sub>Santiago Camelo</sub>
