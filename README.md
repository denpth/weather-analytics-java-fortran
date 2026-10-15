# Weather Analytics in Java and Fortran

## Project context

Developed during Western Governors University coursework. This repository is a record of my implementation and learning, not a client engagement, deployed operational system, or claim of a new algorithm. Supplied requirements, starter components, datasets, and third-party libraries are distinct from my own implementation. Where their exact provenance or redistribution terms have not been established, they are not represented as my original work or as cleared for public release.


A small cross-language programming project that implements the same weather-data concepts in Java and Fortran. It provides a compact comparison of object-oriented and procedural approaches to representing and analyzing a weekly forecast.

## What it does

- Stores daily high and low temperatures
- Calculates weekly average highs and lows
- Finds weekly maximum and minimum temperatures
- Maps compact weather codes to readable descriptions
- Prints daily and weekly forecast summaries
- Includes a Java test implementation
- Includes equivalent Java and Fortran source paths for comparison

## Java

Key files:

- `Main.java`
- `Weather.java`
- `WeatherTest.java`

Compile and run:

```bash
javac Main.java Weather.java
java Main
```

## Fortran

Key files:

- `main.f90`
- `weather.f90`

With `gfortran` installed:

```bash
gfortran weather.f90 main.f90 -o weather
./weather
```

## Purpose

The repository is primarily useful as a language-comparison exercise: the same small domain is expressed using Java classes and methods on one side and a Fortran implementation on the other, making differences in structure, typing, state, and program organization easy to inspect.
