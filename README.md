#Sistema de Gestión de Drones (PRUEBA #1)

Descripción
Este proyecto consiste en un sistema desarrollado en Java utilizando conceptos basicos y avanzados de la materia de POO para la gestión de distintos tipos de drones de entrega.

El sistema permite representar drones livianos, drones de carga y drones de emergencia, aplicando conceptos fundamentales como herencia, abstracción, encapsulamiento y polimorfismo.

1.- Características del sistema
- Registro de información de drones.
- Validación de datos según el tipo de dron.
- Cálculo del costo de entrega.
- Uso de clases abstractas.
- Sobreescritura de métodos (`@Override`).
- Aplicación de polimorfismo.

2.- Tecnologías utilizadas
- Java
- IntelliJ IDEA / NetBeans
- Programación Orientada a Objetos (POO)

3.- Estructura del proyecto:

3.1 Clase abstracta
- `Dron`

3.2 Clases hijas
- `DronLiviano`
- `DronCarga`
- `DronEmergencia`

3.3 Clase principal
- `Main`

4.- Conceptos de POO aplicados
#Abstracción
Se utilizó una clase abstracta llamada `Dron` para definir atributos y métodos generales.

#Herencia
Las clases hijas heredan propiedades y comportamientos de la clase padre `Dron`.

#Encapsulamiento
Los atributos fueron declarados privados y se acceden mediante getters y setters.

#Polimorfismo
Se utilizó un arreglo de tipo `Dron` para manejar distintos tipos de drones mediante un mismo comportamiento.

5.- Autor del deber
- Nombre: Esteban Rodríguez
- Fecha: 10/05/2026
