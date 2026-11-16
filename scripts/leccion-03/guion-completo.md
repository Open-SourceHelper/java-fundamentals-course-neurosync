# Lección 3: Estructuras de control: Decisiones y bucles

Duración final: **10:00**. Responsable: integrante 3. Editor: JDoodle.

## Preparación

Lee `../guia-grabacion.md`. Abre las tres versiones de Main.java de esta lección. Los textos entre comillas del guion se narran; las acciones de pantalla no se leen. Cada bloque corresponde a un minuto y reserva tiempo para demostración. No leer el código símbolo por símbolo cuando ya fue explicado.

## Guion literal y técnico minuto a minuto

### 00:00–01:00 — Elegir y repetir

**Pantalla y acción:** Mostrar dos caminos de un reto y una secuencia de saltos.

**Diapositiva 1:** mostrar de 00:00 a 00:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Hasta ahora todas las instrucciones se ejecutaban una detrás de otra. Pero un juego puede elegir un reto según un dato y repetir una acción varias veces. Hoy aprenderemos decisiones con if y else, y repeticiones con for y while. No son decisiones reales sobre personas: usaremos una edad inventada para entender una condición. Abre JDoodle, selecciona Java y prepara el archivo inicial. Vamos a observar primero una sola decisión; después añadiremos los bucles. Antes de cada ejecución intentaremos predecir el resultado.”

**Anotación:** resaltar el concepto «Elegir y repetir» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 01:00–02:00 — Una condición

**Pantalla y acción:** Escribir age = 15 y if (age > 12); señalar comparación.

**Diapositiva 2:** mostrar de 01:00 a 01:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Una condición produce verdadero o falso. Aquí preguntamos si age es mayor que doce. El símbolo mayor que compara; no modifica la edad. Quince es mayor que doce, así que la condición es verdadera. if significa si se cumple esta condición. Las llaves contienen la instrucción que se ejecutará en ese caso. Escribimos el mensaje Puedes entrar al reto avanzado dentro de ellas. No pongas un punto y coma después de la condición del if. Observa cómo la sangría nos ayuda a ver qué instrucción pertenece a este bloque.”

**Anotación:** resaltar el concepto «Una condición» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 02:00–03:00 — La alternativa else

**Pantalla y acción:** Agregar else, ejecutar con 15; cambiar a 12 y ejecutar; restaurar15.

**Diapositiva 3:** mostrar de 02:00 a 02:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“else es la alternativa cuando la condición resulta falsa. Allí mostramos Empieza por el reto inicial. Ejecutemos con quince: aparece el reto avanzado. Ahora cambiamos la edad a doce. Doce no es mayor que doce; es igual, por eso aparece el reto inicial. En esta estructura se ejecuta una rama u otra, no las dos. Los valores justo en el límite son importantes para probar un programa. Vuelve a quince para continuar el ejemplo completo. Ya tenemos una decisión que depende de un dato y no de un mensaje escrito a mano.”

**Anotación:** resaltar el concepto «La alternativa else» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 03:00–04:00 — La idea de un bucle

**Pantalla y acción:** Mostrar cinco println repetidos como texto y luego for sin ejecutarlo.

**Diapositiva 4:** mostrar de 03:00 a 03:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Supón que queremos imprimir cinco saltos. Podríamos escribir cinco instrucciones casi iguales, pero un bucle expresa la repetición de forma más clara. Un for tiene tres partes dentro de sus paréntesis. La primera prepara un contador, la segunda decide si continuamos y la tercera lo actualiza después de cada vuelta. Las separan dos puntos y coma. Dentro de las llaves escribiremos el mensaje del salto. No necesitamos copiar la misma instrucción cinco veces. Vamos a seguir el contador despacio para entender por qué el bucle termina.”

**Anotación:** resaltar el concepto «La idea de un bucle» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 04:00–05:00 — Seguir un for

**Pantalla y acción:** Escribir for completo; anotar tabla i 0–4 y salida 1–5; ejecutar.

**Diapositiva 5:** mostrar de 04:00 a 04:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“El contador i empieza en cero. Mientras i sea menor que cinco, se ejecuta el cuerpo. Después, i más más aumenta su valor en uno. En la primera vuelta i vale cero, pero imprimimos i más uno para que el mensaje diga Salto uno. Las siguientes vueltas usan uno, dos, tres y cuatro. Cuando i llega a cinco, la condición ya es falsa. Por eso aparecen exactamente cinco saltos. Los paréntesis en i más uno hacen que se calcule el número antes de unirlo al texto. Ejecutemos y contemos las líneas.”

**Anotación:** resaltar el concepto «Seguir un for» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 05:00–06:00 — Cuándo usar while

**Pantalla y acción:** Escribir countdown = 3 y while; señalar condición y decremento.

**Diapositiva 6:** mostrar de 05:00 a 05:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“while también repite instrucciones mientras una condición sea verdadera. Aquí usamos countdown, una cuenta que empieza en tres. Mientras sea mayor que cero, mostramos su valor y lo reducimos en uno con dos signos menos. Primero vemos tres, luego dos y después uno. Al llegar a cero, termina el bucle. El cambio del contador es esencial: sin él, la condición podría permanecer verdadera y repetir sin parar. No ejecutaremos un bucle infinito. Si en una práctica tu programa no termina, usa Stop y revisa qué valor debería cambiar en cada vuelta.”

**Anotación:** resaltar el concepto «Cuándo usar while» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 06:00–07:00 — Comparar los bucles

**Pantalla y acción:** Ejecutar ejemplo completo; señalar decision,for,while,Fin.

**Diapositiva 7:** mostrar de 06:00 a 06:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“for suele resultar cómodo cuando conocemos el número de repeticiones, como los cinco saltos. while expresa directamente una condición de continuación, como seguir mientras la cuenta sea positiva. Ambos necesitan que podamos alcanzar una condición de salida. Ejecutemos todo el ejemplo y separemos sus partes en la consola: una decisión, cinco saltos, tres números de la cuenta y Fin. Fin está fuera de los bucles y aparece una sola vez. Si queda dentro por error, aparecerá repetido. Revisa las llaves y la sangría para identificar esa diferencia.”

**Anotación:** resaltar el concepto «Comparar los bucles» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 07:00–08:00 — Práctica de control

**Pantalla y acción:** Mostrar age12, tres saltos, cuenta2–1,Fin; pausa voluntaria.

**Diapositiva 8:** mostrar de 07:00 a 07:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Ahora modifica el programa: utiliza age con doce, conserva age mayor que doce, imprime solamente tres saltos y realiza una cuenta de dos a uno. El último mensaje debe ser Fin. Antes de ejecutar escribe en una hoja qué rama esperas y cuántas líneas producirá cada bucle. Pausa el video y haz el reto. No cambies todas las cosas a la vez si te confundes: prueba primero la edad, luego los saltos y finalmente la cuenta. Esa forma de avanzar facilita encontrar dónde se introduce un error.”

**Anotación:** resaltar el concepto «Práctica de control» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 08:00–09:00 — Solución comprobada

**Pantalla y acción:** Abrir solución y ejecutar; contar 7 líneas.

**Diapositiva 9:** mostrar de 08:00 a 08:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Con doce se ejecuta else y vemos el reto inicial. El for empieza en cero y continúa mientras i sea menor que tres: recorre cero, uno y dos, que mostramos como saltos uno, dos y tres. countdown empieza en dos y se reduce hasta cero, así que imprime dos y uno. Fin aparece al terminar. Son siete líneas en total: una de la decisión, tres de saltos, dos de la cuenta y una final. Si tu resultado difiere, compara cada bloque por separado con la salida esperada. La solución completa está junto al ejercicio.”

**Anotación:** resaltar el concepto «Solución comprobada» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 09:00–10:00 — Resumen

**Pantalla y acción:** Mostrar if-else/for/while y una pregunta de predicción; cierre10:00.

**Diapositiva 10:** mostrar de 09:00 a 09:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Hoy añadiste control al programa. if y else permiten elegir según una condición. for y while permiten repetir, siempre cuidando que el programa termine. La clave no es memorizar las palabras: es poder explicar qué valor tiene cada variable y cuándo cambia. Para comprobarte, piensa qué pasa si la cuenta comienza en cero. La condición es falsa desde el inicio y no imprime números de la cuenta. En la próxima lección organizaremos instrucciones en métodos, leeremos datos del teclado y conoceremos nuestros primeros objetos.”

**Anotación:** resaltar el concepto «Resumen» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

## Programas completos

### Código inicial

```java
public class Main {
    public static void main(String[] args) {
        int age = 12;
        // Agrega if-else, un for y una cuenta con while.
    }
}
```

### Ejemplo terminado

```java
public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age > 12) {
            System.out.println("Puedes entrar al reto avanzado");
        } else {
            System.out.println("Empieza por el reto inicial");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Salto " + (i + 1));
        }
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Cuenta: " + countdown);
            countdown--;
        }
        System.out.println("Fin");
    }
}
```

## Resultado esperado del ejemplo

```text
Puedes entrar al reto avanzado
Salto 1
Salto 2
Salto 3
Salto 4
Salto 5
Cuenta: 3
Cuenta: 2
Cuenta: 1
Fin
```

12 > 12 es falso, por eso se toma else. El for usa i = 0, 1, 2. countdown-- reduce la cuenta en cada vuelta y permite terminar.

## Práctica interactiva

Usa age = 12. Conserva la condición age > 12. Muestra tres saltos con for y una cuenta 2, 1 con while. Termina con Fin. Predice qué rama se ejecuta.

## Solución completa

```java
public class Main {
    public static void main(String[] args) {
        int age = 12;
        if (age > 12) {
            System.out.println("Puedes entrar al reto avanzado");
        } else {
            System.out.println("Empieza por el reto inicial");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Salto " + (i + 1));
        }
        int countdown = 2;
        while (countdown > 0) {
            System.out.println("Cuenta: " + countdown);
            countdown--;
        }
        System.out.println("Fin");
    }
}
```

### Salida de la solución

```text
Empieza por el reto inicial
Salto 1
Salto 2
Salto 3
Cuenta: 2
Cuenta: 1
Fin
```

12 > 12 es falso, por eso se toma else. El for usa i = 0, 1, 2. countdown-- reduce la cuenta en cada vuelta y permite terminar.

## Enlaces

Editor o recurso oficial: https://www.jdoodle.com/online-java-compiler. Enlace al ejercicio precargado: **PENDIENTE DE CREACIÓN Y PRUEBA ONLINE**. Video de YouTube: Pendiente. Consulta el [plan del curso](../../upc-pre-202620-1asi0729-7793-neurosync-course-plan.md).

## Conclusión

Hoy añadiste control al programa. if y else permiten elegir según una condición. for y while permiten repetir, siempre cuidando que el programa termine. La clave no es memorizar las palabras: es poder explicar qué valor tiene cada variable y cuándo cambia. Para comprobarte, piensa qué pasa si la cuenta comienza en cero. La condición es falsa desde el inicio y no imprime números de la cuenta. En la próxima lección organizaremos instrucciones en métodos, leeremos datos del teclado y conoceremos nuestros primeros objetos.
