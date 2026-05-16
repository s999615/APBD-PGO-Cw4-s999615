# PGO - Czw4 - Zarzadzanie zespolem projektowym

## Opis projektu

Aplikacja przedstawia prosty system zarzadzania zespolem projektowym z wykorzystaniem programowania obiektowego.

Projekt zawiera:

- klase nadrzedna `PRACOWNIK`,
- klasy dziedziczace `PROGRAMISTA` oraz `TESTER`,
- klase `ZespolProjektowy` zarzadzajaca lista pracownikow,
- wykorzystanie:
  - dziedziczenia,
  - polimorfizmu,
  - przeslaniania metod (`@Override`),
  - kolekcji `ArrayList`,
  - operatora `instanceof`.

## Struktura projektu

- `PRACOWNIK.java`
- `PROGRAMISTA.java`
- `TESTER.java`
- `ZespolProjektowy.java`
- `Main.java`

## Funkcjonalnosci

- dodawanie pracownikow do zespolu,
- obliczanie miesiecznych kosztow zespolu,
- wyszukiwanie pracownika po ID,
- wyswietlanie skladu zespolu,
- filtrowanie pracownikow wedlug typu.