Ejercicios Números Aleatorios

### 1. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
Separados por espacios.


### 2. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
Separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.


### 3. Generar un día de la semana de forma aleatoria.
En efecto, primero generamos un número entre 1 y 7 ambos inclusive
y luego hacemos corresponder un día de la semana a cada uno de los números.


### 4. Escribe un programa que muestre la tirada de tres dados.
Se debe mostrar también la suma total (los puntos que suman entre los tres dados).


### 5. Simular el juego de la lotería primitiva

- 6 Números 1-49 (sin repetir)
- no contemplamos complementario
- 1 reintegro 0-9
- posible repetición de los números (unos de los 6 números puede coincidir con el reintegro).

### 6. Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:

- El ordenador mostrará una tirada que consiste en mostrar 3 figuras. 
- Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
- Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
- Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
- Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
  
* Ejemplo 1:
  
* diamante<->diamante<->limón
* Bien, ha recuperado su moneda

* Ejemplo 2:
* herradura<->campana<->diamante
* Lo siento, ha perdido

* Ejemplo 3:
* corazón<->corazón<->corazón
* Enhorabuena, ha ganado 10 monedas 

### 7. Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.

Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 
4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).

### 8. Igual que el ejercicio anterior pero con la baraja española. 
Se utilizará la baraja de 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.

### 9. Escribe un programa que piense un número al azar entre 0 y 100.
El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
Orientar al usuario si el número es mayor o menor.
Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan
y si el número introducido es menor o mayor que el que ha pensado.
### 10. Implementa el juego piedra, papel y tijera. 
Primero, el usuario introduce su jugada 
y luego el ordenador genera al azar una de las opciones. 
Si el usuario introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.

Ejemplo 1:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: papel
Empate

Ejemplo 2:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: tijera
Gana el ordenador

Ejemplo 3:
Turno del jugador (introduzca piedra, papel o tijera): piedra
Turno del ordenador: tijera
Gana el jugador



### 11. Realiza un programa que genere una secuencia de cinco monedas de cursolegal lanzadas al aire. 

Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. 

Las dos posiciones posibles son cara y cruz.

Ejemplo:

2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara



