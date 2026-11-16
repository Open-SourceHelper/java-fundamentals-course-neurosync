# Lección 4: Métodos, Entrada/Salida e Introducción a la POO

Duración final: **12:00**. Responsable: integrante 4. Editor: OnlineGDB.

## Preparación

Lee `../guia-grabacion.md`. Abre las tres versiones de Main.java de esta lección. Los textos entre comillas del guion se narran; las acciones de pantalla no se leen. Cada bloque corresponde a un minuto y reserva tiempo para demostración. No leer el código símbolo por símbolo cuando ya fue explicado.

## Guion literal y técnico minuto a minuto

### 00:00–01:00 — Organizar instrucciones

**Pantalla y acción:** Mostrar saludo repetido y objetivo método/entrada/objeto.

**Diapositiva 1:** mostrar de 00:00 a 00:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Cuando un programa crece, conviene organizar las instrucciones en tareas pequeñas. Un método agrupa una tarea que podemos llamar cuando la necesitemos. Hoy también leeremos un nombre desde la consola y representaremos una mascota mediante un objeto. Son tres ideas nuevas, así que avanzaremos una por una. Abre OnlineGDB, selecciona Java y localiza Main.java. Mantendremos una sola clase pública llamada Main. Al final habrá otra clase sencilla, Pet, en el mismo archivo. Primero escribiremos un saludo sin pedir datos al usuario.”

**Anotación:** resaltar el concepto «Organizar instrucciones» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 01:00–02:00 — Crear greet

**Pantalla y acción:** Escribir greet fuera de main pero dentro de Main.

**Diapositiva 2:** mostrar de 01:00 a 01:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Este método se llama greet, que significa saludar. Su encabezado es public static void greet, seguido de paréntesis y llaves. Para nuestro ejemplo, public permite acceder al método, static permite llamarlo sin crear un objeto Main y void indica que no devuelve un valor. Dentro escribimos un println con el saludo. El método debe estar dentro de la clase Main, pero fuera del método main. No creamos un método dentro de otro. Observa las llaves: una pareja contiene greet y otra contiene main. Podemos reconocerlos gracias a la sangría.”

**Anotación:** resaltar el concepto «Crear greet» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 02:00–03:00 — Llamar un método

**Pantalla y acción:** Agregar greet(); ejecutar; duplicar temporalmente llamada y restaurar.

**Diapositiva 3:** mostrar de 02:00 a 02:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Definir un método no significa que ya se haya ejecutado. Para usarlo escribimos greet, paréntesis vacíos y punto y coma dentro de main. Esa es una llamada. Java llega a la llamada, ejecuta el saludo y luego continúa después de ella. Si hacemos dos llamadas, escucharemos el mismo saludo dos veces sin copiar el cuerpo del método. Pruébalo y después deja una sola llamada. Esta separación nos permite reutilizar instrucciones y ponerles un nombre que explique su propósito. Hoy usamos métodos breves para que puedas seguir su recorrido.”

**Anotación:** resaltar el concepto «Llamar un método» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 03:00–04:00 — Un parámetro

**Pantalla y acción:** Agregar greetPet(String name); llamar temporalmente con Luna.

**Diapositiva 4:** mostrar de 03:00 a 03:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Ahora queremos saludar a distintas mascotas. Creamos greetPet con un parámetro String name. Un parámetro es un dato que el método recibe cuando lo llamamos. Dentro imprimimos Bienvenida y el nombre recibido. Al llamar greetPet con Luna entre comillas, Luna es el argumento: el valor concreto que enviamos. Otra llamada podría enviar Sol y el mismo método produciría otro mensaje. No necesitamos un método distinto para cada nombre. Observa que name se utiliza dentro de greetPet; es el nombre local del dato que recibe esa llamada.”

**Anotación:** resaltar el concepto «Un parámetro» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 04:00–05:00 — Entrada con Scanner

**Pantalla y acción:** Añadir import y Scanner input; señalar System.in.

**Diapositiva 5:** mostrar de 04:00 a 04:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Hasta aquí todos los valores estaban escritos en el código. Scanner nos ayuda a leer información. Añadimos import java.util.Scanner al principio del archivo, antes de la clase. Así podemos utilizar Scanner por su nombre corto. Dentro de main creamos input con new Scanner y System.in entre paréntesis. System.in representa la entrada estándar, normalmente el teclado en una consola interactiva. System.out se relaciona con la salida. Primero mostramos una pregunta para que quien use el programa sepa qué escribir. Después leeremos una línea completa como texto.”

**Anotación:** resaltar el concepto «Entrada con Scanner» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 05:00–06:00 — Leer una línea

**Pantalla y acción:** Escribir prompt y nextLine; poner Luna en stdin de OnlineGDB; ejecutar.

**Diapositiva 6:** mostrar de 05:00 a 05:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Escribimos String name igual a input punto nextLine. nextLine lee una línea de entrada y devuelve un String. Para probarlo en OnlineGDB podemos colocar Luna en el cuadro de entrada estándar antes de ejecutar, o escribirlo en la consola si usamos el modo interactivo. Pulsa Run y observa la pregunta y el saludo. Si el programa parece detenido, puede estar esperando tu entrada: escribe el nombre y presiona Enter. En este ejemplo solo leemos texto; evitamos mezclar lecturas de números y líneas para mantener claro el flujo.”

**Anotación:** resaltar el concepto «Leer una línea» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 06:00–07:00 — Clase Pet

**Pantalla y acción:** Escribir class Pet al final con String name; mostrar molde/objeto.

**Diapositiva 7:** mostrar de 06:00 a 06:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Una clase describe un tipo de objeto. Vamos a crear Pet con un atributo String name. Un atributo representa un dato que puede tener cada objeto de esa clase. Puedes imaginar una ficha en blanco que dice nombre: la clase describe la ficha y cada objeto tendrá su propio valor. No es necesario que la clase Pet sea pública en este archivo. La clase pública sigue siendo Main. Por ahora dejamos el atributo accesible para aprender la idea; en la siguiente lección lo protegeremos con encapsulación.”

**Anotación:** resaltar el concepto «Clase Pet» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 07:00–08:00 — Crear un objeto

**Pantalla y acción:** Escribir Pet pet = new Pet(); asignar pet.name = name.

**Diapositiva 8:** mostrar de 07:00 a 07:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Escribimos Pet pet igual a new Pet. Pet es el tipo, pet es nuestra variable y new crea el objeto. En esta clase sencilla Java proporciona un constructor sin argumentos porque no hemos declarado ninguno. Después asignamos el nombre leído a pet punto name. El punto nos permite acceder al atributo del objeto. No confundas la clase Pet con la variable pet: Java distingue mayúsculas y minúsculas. Ahora podemos pasar pet.name a greetPet. El saludo utiliza un dato que leímos, guardamos en un objeto y enviamos a un método.”

**Anotación:** resaltar el concepto «Crear un objeto» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 08:00–09:00 — El recorrido completo

**Pantalla y acción:** Pegar ejemplo terminado; ejecutar con Luna y luego Nube.

**Diapositiva 9:** mostrar de 08:00 a 08:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Veamos el recorrido completo. main llama greet, crea Scanner, muestra una pregunta y lee el nombre. Después crea una mascota, guarda el nombre y llama greetPet con ese atributo. Al terminar cerramos input; en este programa de una sola lectura ya no necesitaremos más entrada. Ejecuta primero con Luna y luego con Nube. El código es el mismo y cambia el saludo porque cambió el dato de entrada. Comprueba que cada ejecución empieza desde el principio; el objeto de la ejecución anterior no se conserva automáticamente.”

**Anotación:** resaltar el concepto «El recorrido completo» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 09:00–10:00 — Práctica de dos mascotas

**Pantalla y acción:** Mostrar reto friend y pausa; conservar entrada Luna.

**Diapositiva 10:** mostrar de 09:00 a 09:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Tu reto es crear una segunda mascota sin borrar la primera. Después del saludo a pet, declara Pet friend igual a new Pet. Guarda Sol en friend.name y llama greetPet con ese atributo. Mantén la lectura de Luna para la primera mascota. Antes de ejecutar, predice si el primer nombre cambiará. Pausa el video y compruébalo. Recuerda que ambos objetos usan la misma clase, pero tienen su propio estado. El objetivo es ver esa independencia en dos saludos, no construir todavía una aplicación con muchas opciones.”

**Anotación:** resaltar el concepto «Práctica de dos mascotas» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 10:00–11:00 — Solución

**Pantalla y acción:** Mostrar solución y ejecutar con Luna; resaltar dos saludos.

**Diapositiva 11:** mostrar de 10:00 a 10:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“La solución crea friend con otra expresión new Pet, asigna Sol y llama el mismo método. Aparece primero Bienvenida, Luna y después Bienvenida, Sol. La pregunta inicial también aparece porque el programa continúa leyendo el primer nombre. Asignar friend.name no modifica pet.name: son dos objetos distintos. Si ambos saludos muestran lo mismo, revisa qué variable pasaste a cada llamada. Hemos reutilizado tanto la clase como el método. Eso nos permite describir una estructura una vez y trabajar con varios objetos sin duplicar todo el programa.”

**Anotación:** resaltar el concepto «Solución» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 11:00–12:00 — Cierre

**Pantalla y acción:** Mostrar método/parámetro/Scanner/clase/objeto; cierre12:00.

**Diapositiva 12:** mostrar de 11:00 a 11:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Hoy organizaste una tarea en un método, enviaste datos mediante un parámetro, leíste una línea con Scanner y creaste objetos de la clase Pet. No necesitas recordarlo todo de memoria; vuelve al ejemplo y sigue las llamadas en orden. Una clase describe qué tienen sus objetos y un objeto es una instancia concreta. Nuestro atributo todavía puede cambiarse directamente. En la siguiente lección construiremos una mascota con nombre y energía, un constructor y métodos que controlen sus cambios. Esa será nuestra primera aplicación sencilla orientada a objetos.”

**Anotación:** resaltar el concepto «Cierre» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

## Programas completos

### Código inicial

```java
public class Main {
    public static void main(String[] args) {
        // Agrega greet, Scanner y una clase Pet al completar el ejemplo.
    }
}
```

### Ejemplo terminado

```java
import java.util.Scanner;

public class Main {
    public static void greet() {
        System.out.println("Hola, vamos a conocer a tu mascota");
    }

    public static void greetPet(String name) {
        System.out.println("Bienvenida, " + name);
    }

    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu mascota:");
        String name = input.nextLine();
        Pet pet = new Pet();
        pet.name = name;
        greetPet(pet.name);
        input.close();
    }
}

class Pet {
    String name;
}
```

## Resultado esperado del ejemplo

Entrada estándar: `Luna` y Enter.

```text
Hola, vamos a conocer a tu mascota
Escribe el nombre de tu mascota:
Bienvenida, Luna
```

new Pet() crea un segundo objeto. friend.name no modifica pet.name. El mismo método recibe dos argumentos distintos en llamadas separadas.

## Práctica interactiva

Partiendo del ejemplo completo, crea otro objeto Pet llamado friend. Asigna "Sol" a su atributo name y llama greetPet(friend.name). Conserva la lectura de Luna para la primera mascota.

## Solución completa

```java
import java.util.Scanner;

public class Main {
    public static void greet() {
        System.out.println("Hola, vamos a conocer a tu mascota");
    }

    public static void greetPet(String name) {
        System.out.println("Bienvenida, " + name);
    }

    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu mascota:");
        String name = input.nextLine();
        Pet pet = new Pet();
        pet.name = name;
        greetPet(pet.name);
        Pet friend = new Pet();
        friend.name = "Sol";
        greetPet(friend.name);
        input.close();
    }
}

class Pet {
    String name;
}
```

### Salida de la solución

```text
Hola, vamos a conocer a tu mascota
Escribe el nombre de tu mascota:
Bienvenida, Luna
Bienvenida, Sol
```

new Pet() crea un segundo objeto. friend.name no modifica pet.name. El mismo método recibe dos argumentos distintos en llamadas separadas.

## Enlaces

Editor o recurso oficial: https://www.onlinegdb.com/online_java_compiler. Enlace al ejercicio precargado: **PENDIENTE DE CREACIÓN Y PRUEBA ONLINE**. Video de YouTube: **PENDIENTE DE GRABACIÓN Y PUBLICACIÓN COMO NO LISTADO**. Consulta el [plan del curso](../../upc-pre-202620-1asi0729-7793-neurosync-course-plan.md).

## Conclusión

Hoy organizaste una tarea en un método, enviaste datos mediante un parámetro, leíste una línea con Scanner y creaste objetos de la clase Pet. No necesitas recordarlo todo de memoria; vuelve al ejemplo y sigue las llamadas en orden. Una clase describe qué tienen sus objetos y un objeto es una instancia concreta. Nuestro atributo todavía puede cambiarse directamente. En la siguiente lección construiremos una mascota con nombre y energía, un constructor y métodos que controlen sus cambios. Esa será nuestra primera aplicación sencilla orientada a objetos.
