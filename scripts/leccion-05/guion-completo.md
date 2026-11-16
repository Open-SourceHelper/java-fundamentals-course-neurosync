# Lección 5: Fundamentos de POO y programas sencillos

Duración final: **15:00**. Responsable: integrante 5. Editor: Replit.

## Preparación

Lee `../guia-grabacion.md`. Abre las tres versiones de Main.java de esta lección. Los textos entre comillas del guion se narran; las acciones de pantalla no se leen. Cada bloque corresponde a un minuto y reserva tiempo para demostración. No leer el código símbolo por símbolo cuando ya fue explicado.

## Guion literal y técnico minuto a minuto

### 00:00–01:00 — Nuestro simulador

**Pantalla y acción:** Mostrar nombre,energia, jugar/descansar; abrir starter Replit.

**Diapositiva 1:** mostrar de 00:00 a 00:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Vamos a construir un simulador pequeño de mascotas. Nuestra mascota tendrá un nombre y energía, y podrá jugar o descansar. Será un modelo inventado para practicar programación, no una recomendación sobre cuidado de animales. Abrimos el archivo inicial en Replit. Ya contiene una clase Pet con nombre, constructor y getter. Vamos a ampliarla de manera gradual. Al final podrás explicar qué datos guarda el objeto, cómo se crea y qué reglas controlan sus cambios. Todo estará en un único Main.java para que sea sencillo copiarlo y ejecutarlo.”

**Anotación:** resaltar el concepto «Nuestro simulador» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 01:00–02:00 — Atributos privados

**Pantalla y acción:** Añadir private int energy; marcar private en ambos atributos.

**Diapositiva 2:** mostrar de 01:00 a 01:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Los atributos son name y energy. El nombre es String y la energía es int. Los declaramos private para que el código fuera de Pet no los cambie directamente. Así evitamos que cualquier instrucción asigne una energía negativa sin seguir nuestras reglas. Esto forma parte de la encapsulación: reunir datos y comportamiento y controlar el acceso. private no cifra los datos ni convierte el programa en un sistema de seguridad. Es una regla del lenguaje para limitar el acceso desde otras clases. Las acciones autorizadas estarán representadas por métodos.”

**Anotación:** resaltar el concepto «Atributos privados» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 02:00–03:00 — Constructor

**Pantalla y acción:** Mostrar public Pet(String name),this.name y energía3.

**Diapositiva 3:** mostrar de 02:00 a 02:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“El constructor se ejecuta al crear un objeto. Se llama Pet, igual que la clase, y no lleva un tipo de retorno, ni siquiera void. Recibe el nombre inicial. this.name señala el atributo del objeto, mientras que name sin this en esta asignación es el parámetro. Guardamos el nombre y establecemos energy en tres. Esa será nuestra regla inicial para todas las mascotas de este ejemplo. Al escribir new Pet con Luna, se crea un objeto que empieza con ese nombre y tres unidades de energía. El constructor prepara un estado inicial.”

**Anotación:** resaltar el concepto «Constructor» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 03:00–04:00 — Getters

**Pantalla y acción:** Escribir getName y getEnergy; señalar return y tipos.

**Diapositiva 4:** mostrar de 03:00 a 03:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“¿Cómo consultamos los datos si son privados? Creamos getters. getName devuelve un String y getEnergy devuelve un int. La palabra return entrega el valor al código que hizo la llamada. A diferencia de nuestros métodos void, estos métodos sí producen un resultado que podemos usar. El getter no necesita cambiar la energía para mostrarla. En main llamaremos pet.getEnergy dentro de println. Observa que el tipo del método coincide con lo que devuelve. No ponemos void si queremos devolver un número o un texto al llamador.”

**Anotación:** resaltar el concepto «Getters» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 04:00–05:00 — Crear y consultar

**Pantalla y acción:** Escribir main con newPet Luna e impresión; ejecutar parcial.

**Diapositiva 5:** mostrar de 04:00 a 04:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Creamos Pet pet igual a new Pet con Luna. Después imprimimos pet.getName, dos puntos y pet.getEnergy. La salida debe mostrar Luna y tres. No escribimos pet.energy desde Main porque el atributo es privado. Consultamos a través del getter. Este primer ensayo comprueba el constructor y los métodos de lectura antes de añadir acciones. Si aparece un error, revisa el nombre exacto de la clase y los paréntesis de las llamadas. Trabajar por pasos permite detectar qué parte funciona antes de incorporar una nueva regla al programa.”

**Anotación:** resaltar el concepto «Crear y consultar» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 05:00–06:00 — Jugar con una regla

**Pantalla y acción:** Escribir play if energy>0, decremento y else.

**Diapositiva 6:** mostrar de 05:00 a 05:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“El método play representa jugar. Si energy es mayor que cero, restamos uno y mostramos que la mascota juega. En caso contrario mostramos que necesita descansar. El método es void porque realiza una acción y no devuelve un valor. La condición protege el estado: nunca restamos cuando la energía ya es cero. Esta es la ventaja de concentrar los cambios en un método. Quien usa el objeto pide jugar; el objeto aplica su regla. No es necesario que Main conozca todos los detalles internos para utilizar esa acción.”

**Anotación:** resaltar el concepto «Jugar con una regla» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 06:00–07:00 — Seguir el estado

**Pantalla y acción:** Llamar play dos veces, imprimir temporalmente tras cada una; ejecutar.

**Diapositiva 7:** mostrar de 06:00 a 06:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Vamos a seguir la energía como si fuera una pequeña tabla. Al crear Luna vale tres. Después de una llamada a play vale dos y después de otra vale uno. Las llamadas cambian el mismo objeto. Podemos añadir temporalmente un println con getEnergy después de cada llamada para observarlo. Ejecuta y comprueba esos valores. Una llamada a getEnergy solo consulta: no gasta energía. Esta diferencia entre consultar y modificar ayuda a leer un programa. Luego retiraremos las impresiones temporales para que la salida final coincida con el ejemplo del curso.”

**Anotación:** resaltar el concepto «Seguir el estado» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 07:00–08:00 — Descansar

**Pantalla y acción:** Añadir rest con límite5; ejecutar secuencia dosplay/rest.

**Diapositiva 8:** mostrar de 07:00 a 07:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Descansar aumenta la energía en uno, pero nuestro simulador establece un máximo de cinco. El método rest comprueba si energy es menor que cinco antes de incrementarla. Si ya está en cinco, no la aumenta. En la secuencia actual empezamos en tres, jugamos dos veces y descansamos una: terminamos en dos. No añadimos una pregunta al usuario ni un menú para este primer proyecto; queremos entender las reglas del objeto. Aun siendo pequeño, el programa tiene estado, acciones y límites que podemos verificar con casos concretos.”

**Anotación:** resaltar el concepto «Descansar» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 08:00–09:00 — Setter y validación

**Pantalla y acción:** Escribir setName con condición; explicar &&,null,!isBlank.

**Diapositiva 9:** mostrar de 08:00 a 08:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Un setter permite solicitar un cambio. Creamos setName para cambiar el nombre, pero rechazamos un valor nulo o un texto vacío o formado solo por espacios. El doble símbolo ampersand significa y: ambas condiciones deben cumplirse. Java no evalúa la segunda si la primera es falsa; así no llamamos isBlank sobre null. El signo de exclamación niega el resultado de isBlank. En palabras sencillas: si recibimos texto con algún contenido, lo guardamos. Este detalle muestra que un setter puede aplicar una regla y no solo copiar cualquier valor.”

**Anotación:** resaltar el concepto «Setter y validación» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 09:00–10:00 — Cadenas en objetos

**Pantalla y acción:** Agregar setName Sol y getName().length(); ejecutar ejemplo completo.

**Diapositiva 10:** mostrar de 09:00 a 09:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Ahora cambiamos el nombre a Sol utilizando el setter. Para saber cuántas letras tiene llamamos length sobre el String que devuelve getName. Aquí integramos una operación de cadenas con un objeto. Para Sol obtenemos tres. length cuenta unidades de texto de Java; en nuestros nombres simples coincide con las letras, aunque algunos símbolos especiales pueden ocupar más. Ejecuta el ejemplo terminado: primero Luna con tres, dos mensajes de juego, después Sol con dos y finalmente tres letras. Sigue cada llamada para relacionar la salida con los cambios del objeto.”

**Anotación:** resaltar el concepto «Cadenas en objetos» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 10:00–11:00 — Probar los límites

**Pantalla y acción:** Demostrar cuarta llamada tras energía0 en copia; observar protección.

**Diapositiva 11:** mostrar de 10:00 a 10:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Un programa no se prueba solamente cuando todo va bien. Vamos a pensar en los límites. Si jugamos cuatro veces partiendo de tres, la cuarta llamada debe avisar que la mascota necesita descansar. La energía debe quedarse en cero. Si descansamos muchas veces, no debe superar cinco. Si intentamos usar un nombre vacío, el nombre anterior debe conservarse. Estas son expectativas que podemos comprobar. No cambies las reglas para hacer que la prueba pase: ejecuta las acciones y compara lo observado con lo esperado. Los límites revelan errores que un ejemplo corto puede ocultar.”

**Anotación:** resaltar el concepto «Probar los límites» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 11:00–12:00 — Proyecto práctico

**Pantalla y acción:** Mostrar ejercicio Nube y pausa; anotar estados3→0→1.

**Diapositiva 12:** mostrar de 11:00 a 11:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Tu proyecto consiste en crear Nube y hacer cuatro llamadas a play utilizando un for. Muestra la energía, descansa una vez y vuelve a mostrarla. Intenta cambiar el nombre por una cadena vacía; comprueba que sigue siendo Nube. Después cámbialo a Sol y muestra el nombre y su longitud. Pausa el video para completar el reto con la clase que construimos. Escribe primero los resultados esperados: energía cero después de jugar, uno después de descansar y nombre Sol al final. Esa predicción será tu guía para revisar la ejecución.”

**Anotación:** resaltar el concepto «Proyecto práctico» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 12:00–13:00 — Solución del proyecto

**Pantalla y acción:** Abrir solución, señalar for y llamadas; ejecutar.

**Diapositiva 13:** mostrar de 12:00 a 12:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“La solución utiliza un contador que recorre cuatro vueltas y llama pet.play en cada una. Las tres primeras muestran que Nube juega; la cuarta informa que necesita descansar. getEnergy devuelve cero. Después de rest devuelve uno. Cuando enviamos comillas vacías a setName, la condición no permite reemplazar el nombre. Al enviar Sol sí se actualiza. La última llamada a length produce tres. Fíjate en que main expresa una secuencia de acciones y la clase Pet contiene las reglas. Esa separación hace más fácil revisar y reutilizar el comportamiento.”

**Anotación:** resaltar el concepto «Solución del proyecto» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 13:00–14:00 — Explica tu objeto

**Pantalla y acción:** Mostrar tres preguntas; señalar constructor,getter,acción en solución.

**Diapositiva 14:** mostrar de 13:00 a 13:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Para comprobar lo aprendido, explica tres cosas con tus propias palabras. ¿Qué instrucciones crean la mascota? ¿Qué métodos consultan sin cambiar datos? ¿Qué métodos pueden modificar el estado? La creación está en new Pet y su constructor; los getters consultan; play, rest y setName pueden cambiar datos bajo ciertas condiciones. No todos los cambios requieren un setter: jugar es una acción con significado propio. Si deseas ampliar el programa después del curso, podrías crear otra mascota o añadir una acción sencilla, pero primero conserva una versión que funcione y verifica sus resultados.”

**Anotación:** resaltar el concepto «Explica tu objeto» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 14:00–15:00 — Conclusión del proyecto

**Pantalla y acción:** Mostrar resumen y salida final; cierre15:00.

**Diapositiva 15:** mostrar de 14:00 a 14:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Ya construiste un programa orientado a objetos con atributos privados, constructor, getters, un setter y acciones. También utilizaste condiciones, un bucle y una operación de texto dentro del mismo proyecto. Nuestro simulador es pequeño a propósito: cada parte tiene una función que puedes explicar. Guarda tu versión y revisa que se ejecute desde el inicio sin depender de cambios anteriores. En la última lección veremos cómo reconocer errores, mejorar la claridad del código y seguir aprendiendo con documentación. También tendrás un cuestionario y una actividad para compartir lo que aprendiste.”

**Anotación:** resaltar el concepto «Conclusión del proyecto» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

## Programas completos

### Código inicial

```java
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Luna");
        System.out.println(pet.getName());
        // Agrega energia, getters, setter y acciones.
    }
}
class Pet {
    private String name;
    public Pet(String name) { this.name = name; }
    public String getName() { return name; }
}
```

### Ejemplo terminado

```java
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Luna");
        System.out.println(pet.getName() + ": " + pet.getEnergy());
        pet.play();
        pet.play();
        pet.rest();
        pet.setName("Sol");
        System.out.println(pet.getName() + ": " + pet.getEnergy());
        System.out.println("Letras del nombre: " + pet.getName().length());
    }
}
class Pet {
    private String name;
    private int energy;

    public Pet(String name) {
        this.name = name;
        this.energy = 3;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void play() {
        if (energy > 0) {
            energy--;
            System.out.println(name + " juega");
        } else {
            System.out.println(name + " necesita descansar");
        }
    }

    public void rest() {
        if (energy < 5) {
            energy++;
        }
    }
}
```

## Resultado esperado del ejemplo

```text
Luna: 3
Luna juega
Luna juega
Sol: 2
Letras del nombre: 3
```

play solo resta si hay energía. La cuarta llamada informa que debe descansar. rest pasa de 0 a 1. El setter rechaza texto vacío y acepta Sol. length devuelve 3.

## Práctica interactiva

Crea Nube con energía inicial 3. Llama play cuatro veces con for. Comprueba que su energía queda en 0. Haz rest una vez. Intenta cambiar el nombre a cadena vacía y después a Sol. Muestra energía y nombre después de los cambios y la longitud final.

## Solución completa

```java
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Nube");
        for (int i = 0; i < 4; i++) {
            pet.play();
        }
        System.out.println("Energia: " + pet.getEnergy());
        pet.rest();
        System.out.println("Despues de descansar: " + pet.getEnergy());
        pet.setName("");
        System.out.println("Nombre: " + pet.getName());
        pet.setName("Sol");
        System.out.println("Nombre nuevo: " + pet.getName());
        System.out.println("Letras: " + pet.getName().length());
    }
}
class Pet {
    private String name;
    private int energy;

    public Pet(String name) {
        this.name = name;
        this.energy = 3;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void play() {
        if (energy > 0) {
            energy--;
            System.out.println(name + " juega");
        } else {
            System.out.println(name + " necesita descansar");
        }
    }

    public void rest() {
        if (energy < 5) {
            energy++;
        }
    }
}
```

### Salida de la solución

```text
Nube juega
Nube juega
Nube juega
Nube necesita descansar
Energia: 0
Despues de descansar: 1
Nombre: Nube
Nombre nuevo: Sol
Letras: 3
```

play solo resta si hay energía. La cuarta llamada informa que debe descansar. rest pasa de 0 a 1. El setter rechaza texto vacío y acepta Sol. length devuelve 3.

## Enlaces

Editor o recurso oficial: https://replit.com/. Enlace al ejercicio precargado: **PENDIENTE DE CREACIÓN Y PRUEBA ONLINE**. Video de YouTube: **PENDIENTE DE GRABACIÓN Y PUBLICACIÓN COMO NO LISTADO**. Consulta el [plan del curso](../../upc-pre-202620-1asi0729-7793-neurosync-course-plan.md).

## Conclusión

Ya construiste un programa orientado a objetos con atributos privados, constructor, getters, un setter y acciones. También utilizaste condiciones, un bucle y una operación de texto dentro del mismo proyecto. Nuestro simulador es pequeño a propósito: cada parte tiene una función que puedes explicar. Guarda tu versión y revisa que se ejecute desde el inicio sin depender de cambios anteriores. En la última lección veremos cómo reconocer errores, mejorar la claridad del código y seguir aprendiendo con documentación. También tendrás un cuestionario y una actividad para compartir lo que aprendiste.
