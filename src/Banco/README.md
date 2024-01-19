# CuentaCorriente 💳

## Descripción 🌟

Este proyecto implementa una clase `CuentaCorriente` en Java que representa una cuenta bancaria y proporciona operaciones típicas asociadas.

## Funcionalidades 🚀

- **Crear Cuenta:** Se necesita DNI y nombre del titular. El saldo inicial será 0.
- **Sacar Dinero:** Indica si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
- **Ingresar Dinero:** Incrementa el saldo.
- **Mostrar Información:** Muestra la información disponible de la cuenta corriente.

### Visibilidad de Atributos 👁️

- El saldo no es visible para otras clases.
- El nombre es público para cualquier clase.
- El DNI solo es visible para clases vecinas.

## Sobrecarga de Constructores 🛠️

Puedes crear objetos de la clase `CuentaCorriente` de las siguientes maneras:

```java
// Con DNI y saldo inicial
CuentaCorriente cuenta2 = new CuentaCorriente(dni, 1000);

// Con DNI, nombre y saldo
CuentaCorriente cuenta3 = new CuentaCorriente(dni, nombre, 500);
```

## Uso del Banco 🏦

Todas las cuentas corrientes pertenecen al mismo banco. Puedes modificar el nombre del banco con el siguiente método:
```java
cuenta.modificarNombreBanco("Banco XYZ");
```

## Gestor de Cuentas 🤝
Cada cuenta puede tener un gestor asociado. Utiliza la clase Gestor para gestionar información sobre el gestor:
```java
Gestor gestor = new Gestor("Juan Pérez", "123456789", 20000);
cuenta.asignarGestor(gestor);
```
## Contribución 🤗
¡Contribuciones son bienvenidas! Si encuentras algún error o tienes sugerencias, no dudes en abrir un issue o enviar un pull request. ¡Gracias por ser parte de este proyecto! 👏


Este README está adaptado para Java y puedes copiarlo directamente en el README.md de tu repositorio en GitHub. ¡Espero que te sea útil!

