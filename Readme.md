### Opgave 1 - Ombytning


I denne opgave skal du skrive en metode, der kan ombytte (swappe) værdierne af to variable. Metoden skal tage to variable som input og bytte deres værdier, så den første får den andens værdi og omvendt.

Metoden skal tage to variable som input (for eksempel to heltal).
Efter metoden er kaldt, skal de to variable have byttet værdier.
Du må ikke bruge indbyggede swap-funktioner.

Eksempel: Input:

a = 5

b = 10

Efter swap:

a = 10

b = 5

---
### Opgave 2

For alle delspørgsmål i denne opgave gælder der at metoderne skal tage et array af heltal som indput.

1) En metode der bytter om på første og sidste element i input-arrayet
2) En metode der erstatter alle lige tal i input-arrayet med et 0.
3) En metode der returnerer det mindste element i input-arrayet.
4) En metode der returnerer indekset for hvor det mindste element i input-arrayet befinder sig. 
5) En metode der skubber alle elementer i arrayet en plads til højre og det sidste element
   kommer til at stå længst til venstre i arrayet. For eksempel vil {1, 4, 9, 16, 25} blive til {25,
   1, 4, 9, 16}
6) En metode der returnerer det næst-største element i input-arrayet.
7) En metode der returnerer true hvis input-arrayet er sorteret i stigende orden.
8) En metode der returnerer true hvis et array har dubletter. Fx returneres true for {2, 5, 8, 5}
   men false for {2, 5, 8, 6}

---

### Opgave 3 - Reverse

I denne opgave skal du skrive en metode, der vender rækkefølgen af elementerne i et array af heltal. Metoden skal tage et array som input og returnere et nyt array, hvor elementerne står i omvendt rækkefølge i forhold til input-arrayet.

Krav:

Metoden skal tage et array af heltal som input.

Metoden skal returnere et nyt array, hvor elementerne er i omvendt rækkefølge.
Input-arrayet må ikke ændres.

Eksempel: 

Input: array = [1, 2, 3, 4, 5]

Output:
[5, 4, 3, 2, 1]

### Opgave 4* - Flet to arrays

I denne opgave skal du skrive en metode, der kan flette to arrays (lister) af heltal til ét nyt array. De to input-arrays er sorteret i forvejen i stigende rækkefølge. Det nye array skal også være sorteret i stigende rækkefølge.

Metoden skal tage to arrays som input.
Begge arrays er sorteret i forvejen.
Metoden skal returnere ét nyt array, hvor alle elementer fra de to input-arrays indgår, og det nye array skal også være sorteret.
Du må ikke bruge indbyggede sorteringsfunktioner på det samlede array.

Eksempel: Input:

array1 = [1, 3, 5, 7]

array2 = [2, 4, 6, 8]

Output:

[1, 2, 3, 4, 5, 6, 7, 8]

---

Opgave 5** - Hangman

I denne opgave skal du lave et program, hvor brugeren kan spille hangman direkte
i prompten (konsollen). Programmet vælger et tilfældigt ord, og brugeren skal gætte
ordet ved at foreslå bogstaver ét ad gangen. For hvert forkert gæt mister brugeren et liv.

Spillet slutter, når brugeren enten har gættet hele ordet eller løbet tør for liv.

Krav:

Programmet skal vælge et tilfældigt ord fra en liste af ord.

Brugeren skal kunne indtaste ét bogstav ad gangen i prompten.

Programmet skal vise det aktuelle ord med _ for bogstaver, der ikke er gættet endnu.

Programmet skal vise, hvor mange liv brugeren har tilbage.

Programmet skal vise de bogstaver, der allerede er gættet.

Spillet slutter, når ordet er gættet, eller brugeren ikke har flere liv.

Efter spillet skal programmet vise, om brugeren har vundet eller tabt, og hvad det rigtige ord var.

---
