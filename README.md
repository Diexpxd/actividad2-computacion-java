# Promedio de un alumno - Actividad 2 (Computación en Java)

Programa en Java 11 que pide el nombre de un alumno y sus cinco calificaciones,
calcula el promedio y le asigna una calificación en letra:

| Promedio | Calificación |
|---|---|
| Menor o igual a 50 | F |
| 51 a 60 | E |
| 61 a 70 | D |
| 71 a 80 | C |
| 81 a 90 | B |
| 91 a 100 | A |

## Cómo correrlo

```
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

También se le pueden pasar los datos desde un archivo (en `datos/` hay tres ejemplos):

```
java -cp out Main < datos/alumno_B.txt
```
