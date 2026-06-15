# Diversion

## Description

Diversion is a programming kata focused on the generation and analysis of binary sequences.

The goal is to determine how many binary numbers of length `n` can be formed without containing two consecutive `1` bits. To achieve this, all possible combinations are generated, those containing the sequence `11` are identified, and only the valid ones are counted.

In addition to implementing the solution, the exercise encourages discovering and mathematically justifying the pattern that appears in the results.

## Problem

Given a length `n`, generate all possible binary sequences and calculate how many satisfy the following condition:

- They must not contain two adjacent `1`s.

### Example for n = 3

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

The valid sequences are:

```text
000
001
010
100
101
```

Result:

```text
5
```

## Concepts Covered

- Java programming
- Recursion
- Combination generation
- Counting algorithms
- String manipulation
- Problem solving
- Mathematical sequences

## Features

- Generate all binary combinations of length `n`.
- Detect whether a sequence contains two consecutive `1`s.
- Filter valid sequences.
- Calculate the total number of combinations that satisfy the condition.

## Examples

### Length 1

```text
0
1
```

Valid sequences:

```text
2
```

### Length 2

```text
00
01
10
11
```

Valid sequences:

```text
3
```

### Length 3

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

Valid sequences:

```text
5
```

## Observation

The obtained results follow the Fibonacci sequence:

```text
n = 1 → 2
n = 2 → 3
n = 3 → 5
n = 4 → 8
n = 5 → 13
...
```

This makes it possible to efficiently compute the result for large values of `n` without generating all possible combinations.

## Objective

The main objective is to practice combination generation, algorithm design, and the identification of mathematical patterns from the obtained results.

## Author

Exercise completed as part of Cyber Dojo practice sessions using Java.
