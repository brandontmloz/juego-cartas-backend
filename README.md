# [Proyecto Integrador - (juego de cartas)]

## ¿De qué trata?

Es un juego de cartas roguelike inspirado en Slay the Spire, con su propio universo, temática y reglas.
El jugador arma un mazo de cartas, avanza por un mapa generado al azar y pelea contra enemigos por turnos hasta llegar al jefe final.
Cada partida es distinta, así que el juego se puede jugar muchas veces.


## ¿Qué hace el backend?

Toda la lógica del juego está en una API REST hecha con Java y Spring Boot:

- CRUD de cartas, enemigos y reliquias
- Crear y guardar partidas
- Generar el mapa de cada partida
- Manejar el combate: jugar cartas, turnos de los enemigos, daño y bloqueo

## Tecnologías 

- Java 17
- Spring Boot (Web + JPA)
- H2 (base de datos para pruebas; luego MySQL o PostgreSQL)
- IntelliJ IDEA

## Estructura Inicial

```
src/main/java/com/puce/juegocartas/
├── model/        Entidades (Jugador, Carta, Enemigo, Partida, Combate, NodoMapa, Reliquia)
├── repository/   Acceso a la base de datos
├── service/      Lógica del juego
├── controller/   Endpoints de la API
└── dto/          Datos que entran y salen de la API
```

## Integrantes

- Brandon Lozano — rama `brandon-lozano`
- Ashley Lozano — rama `ashley-lozano`
