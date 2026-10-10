# Guía de clase: Bases de Java, POO y estructura de proyecto

Duración sugerida: **~2 horas**. Ejecuta `Main.java` y elige cada opción del menú mientras explicas.

| Bloque | Tema | Tiempo | Opción del menú |
|---|---|---|---|
| 1 | Fundamentos | 30 min | 1 – 4 |
| 2 | Programación Orientada a Objetos | 50 min | 5 – 9 |
| 3 | Estructura de carpetas por capas | 25 min | 10 |
| 4 | Preguntas y ejercicios | 15 min | — |

---

## 1. Fundamentos (`com.demo.fundamentos`)

| Concepto | Idea en una frase | Analogía |
|---|---|---|
| **Variable** | Caja con nombre que guarda un dato | Una caja etiquetada |
| **Tipo** | Qué puede guardar la caja (`int`, `double`, `boolean`, `String`) | No metes sopa en una caja de zapatos |
| **Condicional** | El programa decide (`if`, `else`, `switch`) | Semáforo: si verde, avanzas |
| **Bucle** | Repetir sin reescribir (`for`, `while`, for-each) | Dar vueltas a la pista N veces |
| **Método** | Bloque de código con nombre, recibe datos y puede devolver resultado | Una receta: ingredientes → plato |

Mensaje clave: *un programa es datos (variables) + decisiones (if) + repeticiones (bucles), organizados en recetas (métodos).*

---

## 2. Programación Orientada a Objetos (`com.demo.poo`)

**Idea central:** modelamos el mundo real como **objetos** que tienen **datos** (atributos) y **comportamiento** (métodos).

### Clase vs Objeto (`poo/clases`)
- **Clase** = molde / plano. **Objeto** = cosa real creada con `new`.
- Analogía: el plano de una casa vs. cada casa construida. Mismo plano, casas distintas.
- `Persona ana = new Persona("Ana", 30);` → si Ana cumple años, Luis no cambia.

### Los 4 pilares

| Pilar | Qué significa | Analogía | Ejemplo en el código |
|---|---|---|---|
| **Encapsulamiento** | Proteger los datos internos (`private`) y exponer solo métodos controlados | Cajero automático: no tocas el dinero, usas botones | `CuentaBancaria`: no se puede poner saldo negativo |
| **Herencia** | Una clase hija reutiliza lo del padre (`extends`). Relación "**es un**" | Un perro *es un* animal | `Perro extends Animal` |
| **Polimorfismo** | Misma orden, cada objeto responde a su manera | "¡Hagan ruido!" → el perro ladra, el gato maúlla | Lista de `Animal` llamando `hacerSonido()` |
| **Abstracción** | Mostrar lo esencial, ocultar detalles | Conduces un coche sin saber cómo funciona el motor | `Figura` abstracta con `calcularArea()` |

### Interfaces (`poo/interfaces`)
- Un **contrato**: dice *qué* hay que hacer, no *cómo*.
- Analogía: un enchufe. Cualquier aparato con la forma correcta funciona.
- `Notificador` → `EmailNotificador`, `SmsNotificador`. El código que avisa no sabe cuál usa.

**Clase abstracta vs Interfaz (pregunta típica):**
- Abstracta: "**es un**" + puede compartir código. Solo se hereda de **una**.
- Interfaz: "**sabe hacer**". Una clase puede implementar **varias**.

### Modificadores de acceso
| Modificador | ¿Quién lo ve? |
|---|---|
| `public` | Todo el mundo |
| `protected` | El mismo paquete y las clases hijas |
| *(sin nada)* | Solo el mismo paquete |
| `private` | Solo la propia clase |

---

## 3. Estructura de carpetas

### Estructura de este proyecto
```
demo/
├── GUIA_CLASE.md
└── src/
    ├── Main.java                  ← punto de entrada (menú)
    └── com/demo/                  ← paquete base (dominio al revés)
        ├── fundamentos/           ← variables, if, bucles, métodos
        ├── poo/
        │   ├── clases/
        │   ├── encapsulamiento/
        │   ├── herencia/          ← incluye polimorfismo
        │   ├── abstraccion/
        │   └── interfaces/
        └── proyecto/              ← mini tienda por capas
            ├── model/             ← Producto (datos)
            ├── repository/        ← guardar / buscar datos
            ├── service/           ← reglas de negocio
            ├── util/              ← ayudas reutilizables
            └── TiendaApp.java     ← une las piezas
```

### ¿Por qué separar en capas?
Analogía del **restaurante**:

| Capa | En el restaurante | Responsabilidad |
|---|---|---|
| `TiendaApp` / controller | Camarero | Recibe el pedido y entrega el resultado |
| `service` | Cocinero | Aplica las reglas (¿hay stock?, ¿precio válido?) |
| `repository` | Despensa | Guarda y saca los ingredientes (datos) |
| `model` | Ingredientes | Los datos en sí |

Flujo: `TiendaApp → ProductoService → ProductoRepository → Producto`

Beneficios para un junior:
1. **Cada archivo tiene una sola responsabilidad** → más fácil de encontrar y de entender.
2. **Cambiar una capa no rompe las demás** (pasar de lista en memoria a MySQL solo toca `repository`).
3. **Es la estructura que encontrarán en el trabajo** (Spring Boot usa exactamente `controller / service / repository / model`).

### Estructura real en la industria (Maven/Gradle)
```
mi-proyecto/
├── pom.xml                        ← dependencias (Maven)
└── src/
    ├── main/
    │   ├── java/com/empresa/app/
    │   │   ├── controller/
    │   │   ├── service/
    │   │   ├── repository/
    │   │   ├── model/
    │   │   └── util/
    │   └── resources/             ← configuración (application.properties)
    └── test/java/com/empresa/app/ ← tests
```

### Convenciones de nombres
| Elemento | Convención | Ejemplo |
|---|---|---|
| Paquetes | minúsculas | `com.demo.service` |
| Clases / Interfaces | PascalCase | `ProductoService` |
| Métodos / variables | camelCase | `calcularArea()`, `saldoInicial` |
| Constantes | MAYÚSCULAS | `IVA`, `MAX_INTENTOS` |

---

## 4. Ejercicios propuestos

1. **Fundamentos:** método `esMayorDeEdad(int edad)` que devuelva `boolean`. Recorrer una lista de edades e imprimir el resultado.
2. **Clases:** crear `Coche` con `marca`, `velocidad` y métodos `acelerar()` / `frenar()`.
3. **Encapsulamiento:** en `CuentaBancaria`, impedir retiros mayores a 300 por operación.
4. **Herencia:** añadir `Vaca extends Animal` con su sonido y meterla en la lista polimórfica.
5. **Interfaces:** crear `WhatsappNotificador` sin tocar `DemoInterfaces.avisarPedidoListo`.
6. **Capas:** añadir `eliminarProducto(int id)` en repository y service.

## Preguntas para cerrar
- ¿Diferencia entre clase y objeto?
- ¿Por qué `saldo` es `private`?
- ¿Cuándo usar herencia y cuándo interfaz?
- ¿Dónde pondrías la regla "no vender sin stock"? (Respuesta: `service`)
