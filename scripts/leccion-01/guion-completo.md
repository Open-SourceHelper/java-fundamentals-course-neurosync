# Lección 1: ¿Qué es Java y la Programación?

Duración final: **05:00**. Responsable: integrante 1. Editor: Replit.

## Preparación

Lee `../guia-grabacion.md`. Abre las tres versiones de Main.java de esta lección. Los textos entre comillas del guion se narran; las acciones de pantalla no se leen. Cada bloque corresponde a un minuto y reserva tiempo para demostración. No leer el código símbolo por símbolo cuando ya fue explicado.

## Guion literal y técnico minuto a minuto

### 00:00–01:00 — Programar es dar instrucciones

**Pantalla y acción:** Mostrar una receta de tres pasos; señalar el orden.

**Diapositiva 1:** mostrar de 00:00 a 00:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Piensa en enseñarle a alguien a preparar una mochila: abre la mochila, coloca el cuaderno y ciérrala. Programar también consiste en dar instrucciones, pero a una computadora. La computadora no adivina lo que queremos: necesita instrucciones precisas y en un orden que tenga sentido. En este curso construiremos programas pequeños en Java. Hoy nuestra meta es sencilla: conseguir que aparezca un mensaje en pantalla. No necesitas saber programar ni instalar nada. Observa los tres pasos y piensa qué ocurriría si los intercambiáramos.”

**Anotación:** resaltar el concepto «Programar es dar instrucciones» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 01:00–02:00 — Java y nuestro primer editor

**Pantalla y acción:** Mostrar Replit y el archivo inicial Main.java; aumentar zoom.

**Diapositiva 2:** mostrar de 01:00 a 01:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Java es un lenguaje de programación: nos permite escribir esas instrucciones con reglas que la computadora puede procesar. Se utiliza en aplicaciones y también en juegos. Java y JavaScript son lenguajes diferentes, aunque sus nombres se parezcan. Trabajaremos en un editor dentro del navegador. Abre el ejercicio de esta lección y localiza Main.java. Si el sitio te solicita una cuenta, sigue las indicaciones de acceso del curso. El archivo inicial tiene una estructura preparada; vamos a completar solamente el interior de main. Mira dónde está el comentario.”

**Anotación:** resaltar el concepto «Java y nuestro primer editor» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 02:00–03:00 — Hola mundo

**Pantalla y acción:** Escribir la primera instrucción, pulsar Run y señalar la consola.

**Diapositiva 3:** mostrar de 02:00 a 02:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Escribimos System.out.println, abrimos paréntesis y ponemos Hola, mundo entre comillas dobles. Cerramos el paréntesis y terminamos con punto y coma. Las comillas indican que estamos escribiendo texto. println envía ese texto a la consola y pasa a una nueva línea. Ahora pulsa Run, que significa ejecutar. La consola muestra Hola, mundo. La consola es la zona donde veremos las respuestas de nuestros programas; no es el lugar donde escribimos las instrucciones. Comparemos lo escrito con lo que apareció: las comillas no forman parte del mensaje.”

**Anotación:** resaltar el concepto «Hola mundo» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 03:00–04:00 — Leer la estructura

**Pantalla y acción:** Señalar clase, main, llaves y segunda instrucción; ejecutar ejemplo terminado.

**Diapositiva 4:** mostrar de 03:00 a 03:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“La línea public class Main da nombre a la clase que contiene nuestro programa. El archivo se llama Main.java. La línea public static void main es el punto de entrada que usaremos: Java empieza ejecutando las instrucciones dentro de sus llaves. No necesitas memorizar todas esas palabras todavía. Las llaves agrupan instrucciones y deben cerrarse. El comentario que empieza con dos barras nos orienta, pero no imprime nada. Agreguemos otra instrucción println con Estoy aprendiendo Java. Al ejecutar aparecen dos líneas, en el mismo orden en que las escribimos.”

**Anotación:** resaltar el concepto «Leer la estructura» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 04:00–05:00 — Tu primer cambio

**Pantalla y acción:** Mostrar reto 10 s; pausa voluntaria; pegar solución y ejecutar; cierre a 05:00.

**Diapositiva 5:** mostrar de 04:00 a 04:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Ahora te toca. Conserva Hola, mundo y cambia el segundo mensaje por Mi mascota se llama Luna. Antes de ejecutar, predice cuántas líneas aparecerán. Pausa el video para hacerlo y vuelve cuando estés listo. La solución cambia solamente el texto de la segunda instrucción. Ejecutamos y vemos dos líneas. Si aparece un error, revisa comillas, paréntesis y punto y coma. Ya escribiste instrucciones que la computadora puede ejecutar. Java sirve para construir programas; la consola nos ayuda a observar sus resultados. En la siguiente lección guardaremos información en variables.”

**Anotación:** resaltar el concepto «Tu primer cambio» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

## Programas completos

### Código inicial

```java
public class Main {
    public static void main(String[] args) {
        // Escribe aqui tu primer mensaje.
    }
}
```

### Ejemplo terminado

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
        System.out.println("Estoy aprendiendo Java");
    }
}
```

## Resultado esperado del ejemplo

```text
Hola, mundo
Estoy aprendiendo Java
```

Cada println produce una línea y después avanza a la siguiente. Solo cambia el texto entre comillas; no borres paréntesis ni punto y coma.

## Práctica interactiva

Cambia la segunda línea para mostrar exactamente Mi mascota se llama Luna. Conserva el saludo en la primera. Predice cuántas líneas aparecerán y ejecuta.

## Solución completa

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
        System.out.println("Mi mascota se llama Luna");
    }
}
```

### Salida de la solución

```text
Hola, mundo
Mi mascota se llama Luna
```

Cada println produce una línea y después avanza a la siguiente. Solo cambia el texto entre comillas; no borres paréntesis ni punto y coma.

## Enlaces

Editor o recurso oficial: https://replit.com/. Enlace al ejercicio precargado: **PENDIENTE DE CREACIÓN Y PRUEBA ONLINE**. Video de YouTube: [Ver video en YouTube](https://youtu.be/Y8xFMt5QvDI). Consulta el [plan del curso](../../upc-pre-202620-1asi0729-7793-neurosync-course-plan.md).

## Conclusión

Ahora te toca. Conserva Hola, mundo y cambia el segundo mensaje por Mi mascota se llama Luna. Antes de ejecutar, predice cuántas líneas aparecerán. Pausa el video para hacerlo y vuelve cuando estés listo. La solución cambia solamente el texto de la segunda instrucción. Ejecutamos y vemos dos líneas. Si aparece un error, revisa comillas, paréntesis y punto y coma. Ya escribiste instrucciones que la computadora puede ejecutar. Java sirve para construir programas; la consola nos ayuda a observar sus resultados. En la siguiente lección guardaremos información en variables.
