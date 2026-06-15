# Diversion

## Descripción

Diversion es un kata de programación centrado en la generación y análisis de secuencias binarias.

El objetivo es determinar cuántos números binarios de longitud `n` pueden formarse sin que aparezcan dos bits `1` consecutivos. Para ello, se generan todas las combinaciones posibles, se identifican aquellas que contienen la secuencia `11` y se cuentan únicamente las válidas.

Además de implementar la solución, el ejercicio invita a descubrir y justificar matemáticamente el patrón que aparece en los resultados.

## Problema

Dada una longitud `n`, generar todas las secuencias binarias posibles y calcular cuántas cumplen la siguiente condición:

- No pueden contener dos `1` adyacentes.

### Ejemplo para n = 3

```text
000
001
010
011
100
101
110
111
```

Las secuencias válidas son:

```text
000
001
010
100
101
```

Resultado:

```text
5
```

## Conceptos trabajados

- Programación en Java
- Recursividad
- Generación de combinaciones
- Algoritmos de conteo
- Manipulación de cadenas
- Resolución de problemas
- Sucesiones matemáticas

## Funcionalidades

- Generar todas las combinaciones binarias de longitud `n`.
- Detectar si una secuencia contiene dos `1` consecutivos.
- Filtrar las secuencias válidas.
- Calcular el número total de combinaciones que cumplen la condición.

## Ejemplos

### Longitud 1

```text
0
1
```

Secuencias válidas:

```text
2
```

### Longitud 2

```text
00
01
10
11
```

Secuencias válidas:

```text
3
```

### Longitud 3

```text
000
001
010
011
100
101
110
111
```

Secuencias válidas:

```text
5
```

## Observación

Los resultados obtenidos siguen la sucesión de Fibonacci:

```text
n = 1 → 2
n = 2 → 3
n = 3 → 5
n = 4 → 8
n = 5 → 13
...
```

Esto permite calcular eficientemente el resultado para valores grandes de `n` sin necesidad de generar todas las combinaciones posibles.

## Objetivo

El objetivo principal es practicar la generación de combinaciones, el diseño de algoritmos y la identificación de patrones matemáticos a partir de los resultados obtenidos.

## Autor

Ejercicio realizado como parte de las prácticas de Cyber Dojo utilizando Java.
