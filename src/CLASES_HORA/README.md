# Clase Fecha 📅

¡Bienvenido al proyecto de la clase `Fecha` en Java! 🎉 Esta clase te permite gestionar fechas de manera sencilla, asegurándose de mantener la consistencia y evitar valores inválidos.

## Descripción 🌟

La clase `Fecha` representa una fecha con tres atributos: día, fecha y hora. Además, incluye métodos para visualizar la fecha en un formato específico, contar la diferencia de días entre dos fechas y asegurar que los valores de día, fecha y hora sean válidos.

## Características 🚀

- Tres atributos: día, fecha y hora.
- Métodos para visualizar la fecha en formato específico y contar la diferencia de días entre dos fechas.
- Getter y setter para ver o modificar los atributos.

### Valores Válidos ✅

- Días: 1-31
- Meses: 1-12
- Años: 1-9999

## Uso 🛠️

### Crear una Fecha 🆕📆

```java
Fecha miFecha = new Fecha();
miFecha.setDia(10);
miFecha.setFecha(1);
miFecha.setHora(15);
```
### Visualizar la Fecha 👁️
```java
String fechaFormateada = miFecha.verFecha();
System.out.println("Fecha actual: " + fechaFormateada);
```
### Contar diferencia de Dias 🧮
```java
Fecha otraFecha = new Fecha();
otraFecha.setDia(5);
otraFecha.setFecha(1);
otraFecha.setHora(12);

int diferenciaDias = miFecha.contarDias(otraFecha);
System.out.println("Diferencia de días: " + diferenciaDias);
```
### Contribución 🤗
¡Contribuciones son bienvenidas! Si encuentras algún error o tienes sugerencias, no dudes en abrir un issue o enviar un pull request. ¡Gracias por ser parte de este proyecto! 👏

Este README proporciona una descripción general del ejercicio, cómo usar la clase `Fecha` y cómo contribuir al proyecto. ¡Espero que te sea útil!
