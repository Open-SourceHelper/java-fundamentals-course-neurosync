# Lección 6: Consejos y próximos pasos

Duración final: **10:00**. Responsable: integrante 1. Editor: Replit (repaso; sin cambiar la actividad oficial).

## Preparación

Lee `../guia-grabacion.md`. Abre las tres versiones de Main.java de esta lección. Los textos entre comillas del guion se narran; las acciones de pantalla no se leen. Cada bloque corresponde a un minuto y reserva tiempo para demostración. No leer el código símbolo por símbolo cuando ya fue explicado.

## Guion literal y técnico minuto a minuto

### 00:00–01:00 — Aprender también es corregir

**Pantalla y acción:** Mostrar un error como oportunidad y archivo inicial.

**Diapositiva 1:** mostrar de 00:00 a 00:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Llegamos a la última lección. Programar no significa escribir todo bien a la primera: también significa observar, probar y corregir. Hoy revisaremos errores frecuentes, buenas prácticas y recursos para continuar. Después resolverás un cuestionario y explicarás tu aprendizaje. No vamos a añadir muchas herramientas nuevas. Utilizaremos un programa corto que debería mostrar tres pasos. Abre el archivo inicial en tu editor de repaso. Ejecuta y mira la salida con atención. Aunque el programa se ejecute, todavía puede hacer algo diferente de lo que esperábamos.”

**Anotación:** resaltar el concepto «Aprender también es corregir» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 01:00–02:00 — Error de sintaxis

**Pantalla y acción:** En copia quitar un ;, ejecutar, leer primer error; restaurar.

**Diapositiva 2:** mostrar de 01:00 a 01:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Un error de sintaxis aparece cuando no respetamos las reglas del lenguaje. Por ejemplo, si falta el punto y coma al final de una instrucción, el compilador puede rechazar el programa. En una copia de demostración quitamos uno, ejecutamos y leemos el primer mensaje. El número de línea ayuda, pero a veces el origen está justo antes de la línea señalada. Volvemos a colocar el punto y coma y ejecutamos otra vez. No cambies todo al azar: identifica qué se esperaba y corrige una cosa cada vez. Conservamos funcional el archivo inicial del ejercicio.”

**Anotación:** resaltar el concepto «Error de sintaxis» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 02:00–03:00 — Error de lógica

**Pantalla y acción:** Mostrar salida pasos1,2 y condición i<3; predecir arreglo.

**Diapositiva 3:** mostrar de 02:00 a 02:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Nuestro archivo inicial sí compila, pero solo imprime los pasos uno y dos. Queríamos incluir el tres. Este es un error de lógica: las instrucciones son válidas, pero no representan correctamente el objetivo. Seguimos el contador: uno es menor que tres, dos también, pero tres ya no. Cambiamos el límite a menor o igual que tres. Ejecutamos y ahora aparecen los tres pasos. La salida esperada sirve como referencia para detectar esta clase de error. Que no haya un mensaje rojo no demuestra por sí solo que el programa haga lo correcto.”

**Anotación:** resaltar el concepto «Error de lógica» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 03:00–04:00 — Una estrategia de depuración

**Pantalla y acción:** Mostrar observar→predecir→cambiar→ejecutar; anotar valor i.

**Diapositiva 4:** mostrar de 03:00 a 03:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Cuando algo falle, empieza por describir qué esperabas y qué ocurrió. Después busca la parte del programa que produce esa diferencia. Puedes mostrar temporalmente una variable con println para seguir sus valores. Haz un cambio pequeño, ejecuta de nuevo y compara. También existen errores durante la ejecución, como intentar usar un objeto nulo; no todos los problemas aparecen al compilar. Si pides ayuda, comparte un ejemplo pequeño, el mensaje exacto y los pasos para reproducirlo. No publiques contraseñas ni datos personales junto al código. Explicar el problema ya ayuda a comprenderlo.”

**Anotación:** resaltar el concepto «Una estrategia de depuración» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 04:00–05:00 — Código que se entiende

**Pantalla y acción:** Mostrar antes/después nombres e indentación; mantener mismo resultado.

**Diapositiva 5:** mostrar de 04:00 a 04:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Un programa es más fácil de corregir si se entiende. Usa nombres como energy o petName cuando expliquen el dato. Mantén la sangría dentro de llaves y separa métodos distintos. Un comentario útil explica una intención o una regla; no hace falta describir cada símbolo que ya se ve. Divide tareas en métodos pequeños y evita copiar muchas veces el mismo bloque. Después de cambiar la presentación, ejecuta para confirmar que el comportamiento se conserva. La claridad sirve a quien leerá tu programa mañana, incluso si esa persona eres tú.”

**Anotación:** resaltar el concepto «Código que se entiende» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 05:00–06:00 — Documentación oficial

**Pantalla y acción:** Abrir Oracle Java; mostrar aviso JDK8 en tutorial y enlace dev.java.

**Diapositiva 6:** mostrar de 05:00 a 05:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Para seguir aprendiendo puedes consultar la documentación oficial de Java de Oracle. No necesitas leerla completa. Busca una duda concreta, por ejemplo qué devuelve length en String, y prueba un ejemplo pequeño. Algunos tutoriales de Oracle fueron escritos para JDK ocho y lo advierten; desde allí se enlazan tutoriales actualizados en dev.java. Aprende a revisar a qué versión corresponde una explicación. La documentación complementa la práctica: lee una parte, ejecuta un ejemplo y explica el resultado. En los recursos del curso encontrarás las direcciones reales para abrir esas páginas.”

**Anotación:** resaltar el concepto «Documentación oficial» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 06:00–07:00 — Cuestionario

**Pantalla y acción:** Mostrar preguntas del archivo cuestionario.md; pausa voluntaria12s.

**Diapositiva 7:** mostrar de 06:00 a 06:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Es momento de comprobar tus conocimientos. Abre el cuestionario que acompaña esta lección. Son diez preguntas breves sobre mensajes, variables, decisiones, bucles, métodos, entrada y objetos. Respóndelas sin mirar primero la solución. No hay que memorizar un programa completo: intenta justificar cada respuesta con un ejemplo. Pausa el video y vuelve cuando termines. Si una pregunta te cuesta, anota qué concepto necesitas repasar. El objetivo es identificar tu siguiente paso, no comparar tu velocidad con otras personas. Las respuestas explicadas están en un archivo separado para revisarlas al final.”

**Anotación:** resaltar el concepto «Cuestionario» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 07:00–08:00 — Revisar y practicar

**Pantalla y acción:** Mostrar clave resumida y ejecutar solución del límite y length.

**Diapositiva 8:** mostrar de 07:00 a 07:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Revisemos las ideas centrales: println muestra texto; int guarda enteros y String texto. Doce mayor que doce es falso. Un for que recorre cero, uno y dos hace tres vueltas. Un while necesita que su condición pueda dejar de cumplirse. Un parámetro recibe un dato; nextLine lee una línea; new crea un objeto. private limita acceso y un getter consulta un valor. En el reto de depuración usamos menor o igual para incluir el tres y length para obtener cuatro en Luna. Ejecuta tu solución y compárala con esos resultados, además de revisar el cuestionario.”

**Anotación:** resaltar el concepto «Revisar y practicar» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 08:00–09:00 — Compartir lo aprendido

**Pantalla y acción:** Mostrar plantilla de3frases y ejemplo sin identidad; indicar canal curso.

**Diapositiva 9:** mostrar de 08:00 a 08:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Ahora comparte lo aprendido en el canal o formulario que indique tu docente. Escribe tres frases: qué hace tu programa, qué error corregiste y qué te gustaría agregar después. Puedes acompañarlas con el enlace de tu ejercicio cuando esté disponible. Por ejemplo: mi mascota juega y descansa; corregí un límite para no bajar de cero; quiero añadir otra mascota. No incluyas nombres completos ni información personal en un enlace público. Si comentas el trabajo de otra persona, menciona algo concreto que entendiste y formula una pregunta respetuosa. Explicar tu código consolida lo que aprendiste.”

**Anotación:** resaltar el concepto «Compartir lo aprendido» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

### 09:00–10:00 — Próximos pasos

**Pantalla y acción:** Mostrar ruta variables→control→métodos→objetos; cierre10:00.

**Diapositiva 10:** mostrar de 09:00 a 09:06. Después, ejecutar la acción de pantalla durante la narración.

**Narración literal:**

“Para continuar, dedica sesiones cortas a cambiar una sola cosa de un programa que ya comprendes. Primero predice el resultado y después compruébalo. Puedes ampliar el simulador con otra mascota, practicar más métodos o explorar colecciones cuando domines estos fundamentos. Vuelve a la lección que necesites: aprender no exige avanzar siempre en línea recta. En este curso escribiste mensajes, usaste variables, tomaste decisiones, repetiste acciones, leíste datos y construiste objetos. Conserva tus ejemplos y explica uno a otra persona. Tu siguiente programa puede ser pequeño; lo importante es que puedas entenderlo, probarlo y mejorarlo.”

**Anotación:** resaltar el concepto «Próximos pasos» y la línea mencionada; no tapar código ni consola. Reservar los segundos restantes para completar la acción y observar la salida.

## Programas completos

### Código inicial

```java
public class Main {
    public static void main(String[] args) {
        int total = 2 + 3;
        System.out.println("Total: " + total);
        // Reto: imprimir pasos 1, 2 y 3. Este limite tiene un error logico.
        for (int i = 1; i < 3; i++) {
            System.out.println("Paso " + i);
        }
    }
}
```

### Ejemplo terminado

```java
public class Main {
    public static void main(String[] args) {
        int total = 2 + 3;
        System.out.println("Total: " + total);
        String name = "Luna";
        System.out.println("Letras: " + name.length());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Paso " + i);
        }
    }
}
```

## Resultado esperado del ejemplo

```text
Total: 5
Letras: 4
Paso 1
Paso 2
Paso 3
```

i <= 3 incluye el valor 3; i < 3 lo excluye. El programa compilaba antes: era un error de lógica. String.length() devuelve cuatro para Luna.

## Práctica interactiva

En el archivo inicial se esperan los pasos 1, 2 y 3, pero solo aparecen dos. Corrige el límite, agrega name = "Luna" y muestra su longitud. Resuelve además el cuestionario y escribe tres frases para compartir lo aprendido sin datos personales.

## Solución completa

```java
public class Main {
    public static void main(String[] args) {
        int total = 2 + 3;
        System.out.println("Total: " + total);
        String name = "Luna";
        System.out.println("Letras: " + name.length());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Paso " + i);
        }
    }
}
```

### Salida de la solución

```text
Total: 5
Letras: 4
Paso 1
Paso 2
Paso 3
```

i <= 3 incluye el valor 3; i < 3 lo excluye. El programa compilaba antes: era un error de lógica. String.length() devuelve cuatro para Luna.

## Enlaces

Editor o recurso oficial: https://docs.oracle.com/en/java/. Enlace al ejercicio precargado: **PENDIENTE DE CREACIÓN Y PRUEBA ONLINE**. Video de YouTube: [Ver video en YouTube](https://youtu.be/YZpjWOAo50Y). Consulta el [plan del curso](../../upc-pre-202620-1asi0729-7793-neurosync-course-plan.md).

## Conclusión

Para continuar, dedica sesiones cortas a cambiar una sola cosa de un programa que ya comprendes. Primero predice el resultado y después compruébalo. Puedes ampliar el simulador con otra mascota, practicar más métodos o explorar colecciones cuando domines estos fundamentos. Vuelve a la lección que necesites: aprender no exige avanzar siempre en línea recta. En este curso escribiste mensajes, usaste variables, tomaste decisiones, repetiste acciones, leíste datos y construiste objetos. Conserva tus ejemplos y explica uno a otra persona. Tu siguiente programa puede ser pequeño; lo importante es que puedas entenderlo, probarlo y mejorarlo.
