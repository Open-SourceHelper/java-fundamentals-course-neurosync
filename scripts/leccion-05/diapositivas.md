# Material de diapositivas de la lección 5

Contenido exacto para copiar a las diapositivas. Sin nombres de autores ni branding. Formato recomendado 16:9, título 36 pt, texto 24 pt o mayor, fondo blanco y texto oscuro. Las notas de tiempo no se muestran al alumnado.

## Diapositiva 1

Momento: 00:00 a 00:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Una mascota tiene nombre y energía.
- Puede jugar y descansar.
- Nuestro simulador seguirá reglas sencillas.

## Diapositiva 2

Momento: 01:00 a 01:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- private String name;
- private int energy;
- Pet controla cómo cambian sus datos.

## Diapositiva 3

Momento: 02:00 a 02:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- public Pet(String name)
- this.name = name;
- this.energy = 3;
- El constructor prepara el objeto.

## Diapositiva 4

Momento: 03:00 a 03:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- getName() devuelve String.
- getEnergy() devuelve int.
- return entrega un resultado.

## Diapositiva 5

Momento: 04:00 a 04:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Pet pet = new Pet("Luna");
- Estado inicial: Luna, energía 3.
- Los getters consultan ese estado.

## Diapositiva 6

Momento: 05:00 a 05:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- play() resta una unidad si hay energía.
- Si energy vale 0, pide descansar.
- La energía no debe ser negativa.

## Diapositiva 7

Momento: 06:00 a 06:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Al crear: 3.
- Después de jugar: 2.
- Después de jugar otra vez: 1.
- Consultar no consume energía.

## Diapositiva 8

Momento: 07:00 a 07:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- rest() suma una unidad.
- Máximo del simulador: 5.
- De 3, jugar dos veces y descansar deja 2.

## Diapositiva 9

Momento: 08:00 a 08:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- setName cambia un nombre válido.
- Rechaza null, texto vacío o espacios.
- && une condiciones. ! niega una condición.

## Diapositiva 10

Momento: 09:00 a 09:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- pet.setName("Sol");
- pet.getName().length() devuelve 3.
- Una operación de String utiliza datos del objeto.

## Diapositiva 11

Momento: 10:00 a 10:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Prueba jugar sin energía.
- Prueba descansar al llegar a 5.
- Prueba un nombre vacío.
- Compara con las reglas.

## Diapositiva 12

Momento: 11:00 a 11:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Reto: Nube juega cuatro veces.
- Descansa una vez.
- Intenta un nombre vacío y después Sol.
- Muestra energía, nombre y longitud.

## Diapositiva 13

Momento: 12:00 a 12:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Energía después de jugar: 0.
- Después de descansar: 1.
- Nombre vacío: conserva Nube.
- Nombre válido: Sol, longitud 3.

## Diapositiva 14

Momento: 13:00 a 13:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- ¿Qué crea el objeto?
- ¿Qué métodos solo consultan?
- ¿Qué métodos cambian el estado?
- Explica una regla con un ejemplo.

## Diapositiva 15

Momento: 14:00 a 14:06. Después mostrar el editor o actividad del guion.

Texto en pantalla:

- Atributos privados y constructor.
- Getters, setter y acciones.
- Condiciones, bucle y texto.
- Un programa pequeño que puedes explicar.
