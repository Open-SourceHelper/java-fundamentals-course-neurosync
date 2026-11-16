# Lección 2: Variables y tipos de datos

Duración final: **08:00**. Responsable: integrante 2. Editor: Replit.

## Preparación

Lee `../guia-grabacion.md`. Abre las tres versiones de Main.java de esta lección. Los textos entre comillas del guion se narran; las acciones de pantalla no se leen. Cada bloque corresponde a un minuto y reserva tiempo para demostración. No leer el código símbolo por símbolo cuando ya fue explicado.

## Guion literal y técnico minuto a minuto

### 00:00–01:00 — Datos que pueden cambiar

**Pantalla y acción:** Mostrar edad y nombre como dos datos de un personaje.

**Diapositiva 1:** mostrar de 00:00 a 00:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Un personaje de un juego tiene información: nombre, edad o cantidad de premios. Si escribimos cada dato directamente en todos los mensajes, cambiarlo sería incómodo. Una variable nos permite guardar un valor y utilizarlo después. Hoy vamos a trabajar con una edad y el nombre de una mascota. No usamos datos personales reales: son ejemplos inventados. Primero guardaremos valores, después los mostraremos y finalmente los cambiaremos. Abre Main.java de esta lección en Replit. El archivo ya contiene la estructura que aprendimos; concéntrate en las instrucciones dentro de main.”

**Anotación:** resaltar el concepto «Datos que pueden cambiar» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 01:00–02:00 — Declarar int

**Pantalla y acción:** Señalar int age = 15; escribir la impresión inicial y ejecutar.

**Diapositiva 2:** mostrar de 01:00 a 01:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Esta instrucción dice int age igual a quince. int es el tipo: guarda números enteros dentro de un rango determinado. age es el nombre que elegimos para identificar la variable y quince es su valor inicial. El punto y coma termina la instrucción. Esto se llama declarar e inicializar una variable. Para mostrarla escribimos println con el texto Edad inicial, dos puntos, y un signo más seguido de age. Como hay texto, ese más une el mensaje con el valor. Ejecuta y comprueba que aparece quince.”

**Anotación:** resaltar el concepto «Declarar int» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 02:00–03:00 — Declarar String

**Pantalla y acción:** Señalar mayúscula de String y comillas de Luna; imprimir mascota.

**Diapositiva 3:** mostrar de 02:00 a 02:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Para guardar un nombre usamos String con S mayúscula. Escribimos String petName igual a Luna entre comillas. Un String representa texto. El nombre petName es una sola palabra de código: empieza en minúscula y la segunda palabra empieza con mayúscula para que sea fácil leerlo. No ponemos espacios dentro del nombre de la variable. Compara quince sin comillas con Luna entre comillas. El tipo nos ayuda a distinguir números de texto. Agrega la impresión Mascota, dos puntos, más petName y comprueba el nombre en la consola.”

**Anotación:** resaltar el concepto «Declarar String» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 03:00–04:00 — Modificar un valor

**Pantalla y acción:** Agregar age = age + 1; imprimir antes y después.

**Diapositiva 4:** mostrar de 03:00 a 03:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Una variable puede recibir otro valor compatible con su tipo. Escribimos age igual a age más uno. Primero se calcula lo que está a la derecha: quince más uno da dieciséis. Después se guarda el resultado en age. No repetimos int porque la variable ya existe. El signo igual aquí significa asignar; no es una pregunta sobre si dos cosas son iguales. Para observar el cambio imprimimos la edad antes y después de la asignación. Ejecuta y sigue el orden: primero quince, luego dieciséis. El valor inicial no cambió hacia atrás.”

**Anotación:** resaltar el concepto «Modificar un valor» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 04:00–05:00 — Operadores y expresiones

**Pantalla y acción:** Escribir snacks, total y mostrar 5; comparar texto con suma.

**Diapositiva 5:** mostrar de 04:00 a 04:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“También podemos calcular con variables. Tenemos tres premios y conseguimos dos más. Declaramos snacks con tres y total con snacks más dos. total recibe cinco. Una expresión combina valores y operaciones para producir un resultado. El signo más suma números, pero si lo usamos junto a texto puede unirlos. Por eso, para mostrar el resultado de una suma dentro de un mensaje, conviene escribir la suma entre paréntesis. Observa la diferencia entre sumar primero y escribir los números pegados como texto. Nuestro ejemplo terminado muestra Premios, dos puntos, cinco.”

**Anotación:** resaltar el concepto «Operadores y expresiones» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 05:00–06:00 — Predice antes de ejecutar

**Pantalla y acción:** Cambiar temporalmente incremento a 2, preguntar resultado, restaurar ejemplo.

**Diapositiva 6:** mostrar de 05:00 a 05:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Hagamos una predicción: si age empieza en quince y en lugar de uno sumamos dos, ¿qué valor mostrará la segunda impresión? Piensa antes de ejecutar. Será diecisiete. Pruébalo en tu copia y después vuelve al ejemplo original. Si escribes Age con mayúscula, Java lo considera un nombre distinto de age. Los nombres importan. También es mejor usar un nombre que explique el dato: petName dice más que una letra suelta. Identifica en pantalla qué parte declara, cuál cambia y cuál muestra el valor. Son tres acciones diferentes.”

**Anotación:** resaltar el concepto «Predice antes de ejecutar» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 06:00–07:00 — Práctica de variables

**Pantalla y acción:** Mostrar ejercicio completo; dar 12 s de lectura y solicitar pausa.

**Diapositiva 7:** mostrar de 06:00 a 06:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Tu reto es crear age con doce y petName con Sol. Aumenta age en dos, muestra Edad, dos puntos, catorce y luego Mascota, dos puntos, Sol. Declara snacks con cuatro y muestra siete premios sumando tres. No escribas catorce ni siete directamente como respuesta: deja que el programa calcule. Pausa el video y prueba tu solución. Al volver compararemos el resultado, no solo si el código se ve igual. Puede haber distintas formas correctas de organizar las impresiones, siempre que respeten los cálculos solicitados.”

**Anotación:** resaltar el concepto «Práctica de variables» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 07:00–08:00 — Solución y conexión

**Pantalla y acción:** Mostrar solución; ejecutar; resaltar 14, Sol y 7; cierre a 08:00.

**Diapositiva 8:** mostrar de 07:00 a 07:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“La solución declara las variables, cambia age con age más dos e imprime el nuevo valor. Para los premios escribimos snacks más tres entre paréntesis. Así se realiza la suma antes de unir el resultado al mensaje. La consola debe mostrar Edad: catorce, Mascota: Sol y Premios: siete. Si ves cuarenta y tres, revisa los paréntesis de la suma. Hoy guardaste números y texto, cambiaste valores y calculaste resultados. En la siguiente lección utilizaremos esos valores para que un programa elija entre dos acciones y repita instrucciones.”

**Anotación:** resaltar el concepto «Solución y conexión» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

## Programas completos

### Código inicial

```java
public class Main {
    public static void main(String[] args) {
        int age = 15;
        String petName = "Luna";
        // Muestra age, aumenta su valor y muestra petName.
    }
}
```

### Ejemplo terminado

```java
public class Main {
    public static void main(String[] args) {
        int age = 15;
        String petName = "Luna";
        System.out.println("Edad inicial: " + age);
        age = age + 1;
        System.out.println("Edad siguiente: " + age);
        System.out.println("Mascota: " + petName);
        int snacks = 3;
        int total = snacks + 2;
        System.out.println("Premios: " + total);
    }
}
```

## Resultado esperado del ejemplo

```text
Edad inicial: 15
Edad siguiente: 16
Mascota: Luna
Premios: 5
```

La asignación age = age + 2 calcula 12 + 2 antes de guardar 14. Los paréntesis alrededor de snacks + 3 hacen la suma antes de unirla al texto.

## Práctica interactiva

Declara age con 12 y petName con "Sol". Aumenta age en 2. Muestra Edad: 14 y Mascota: Sol. Declara snacks con 4 y muestra Premios: 7 sumando 3. No escribas 14 ni 7 directamente como resultado.

## Solución completa

```java
public class Main {
    public static void main(String[] args) {
        int age = 12;
        String petName = "Sol";
        age = age + 2;
        System.out.println("Edad: " + age);
        System.out.println("Mascota: " + petName);
        int snacks = 4;
        System.out.println("Premios: " + (snacks + 3));
    }
}
```

### Salida de la solución

```text
Edad: 14
Mascota: Sol
Premios: 7
```

La asignación age = age + 2 calcula 12 + 2 antes de guardar 14. Los paréntesis alrededor de snacks + 3 hacen la suma antes de unirla al texto.

## Enlaces

Editor o recurso oficial: https://replit.com/. Enlace al ejercicio precargado: **PENDIENTE DE CREACIÓN Y PRUEBA ONLINE**. Video de YouTube: [Ver video en YouTube](https://youtu.be/2nKUMU2LkhE). Consulta el [plan del curso](../../upc-pre-202620-1asi0729-7793-neurosync-course-plan.md).

## Conclusión

La solución declara las variables, cambia age con age más dos e imprime el nuevo valor. Para los premios escribimos snacks más tres entre paréntesis. Así se realiza la suma antes de unir el resultado al mensaje. La consola debe mostrar Edad: catorce, Mascota: Sol y Premios: siete. Si ves cuarenta y tres, revisa los paréntesis de la suma. Hoy guardaste números y texto, cambiaste valores y calculaste resultados. En la siguiente lección utilizaremos esos valores para que un programa elija entre dos acciones y repita instrucciones.
