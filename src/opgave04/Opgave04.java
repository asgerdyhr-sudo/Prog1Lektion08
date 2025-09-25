package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        System.out.println("Løst ved hjælp af for løkke:");
        printArray(combinedArrayFor(array1, array2));
    }

    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static int[] combinedArrayFor(int[] array1, int[] array2) {
        // Opret det nye array, der er stort nok til at rumme alle elementer
        int[] combinedArray = new int[array1.length + array2.length];

        // Opret tællere til de to input-arrays.
        int i = 0; // tæller for array1
        int j = 0; // tæller for array2

        // Brug en for-løkke til at iterere over det nye, kombinerede array.
        for (int k = 0; k < combinedArray.length; k++) {

            // Første betingelse: Sørg for at array1 ikke er opbrugt, og at
            // enten array2 er opbrugt, eller at elementet i array1 er mindre end det i array2.
            if (i < array1.length && (j >= array2.length || array1[i] <= array2[j])) {
                combinedArray[k] = array1[i];
                i++;
            } else {
                // Denne betingelse dækker de tilfælde, hvor array1 er opbrugt, eller
                // hvor elementet i array2 er mindre end elementet i array1.
                combinedArray[k] = array2[j];
                j++;
            }
        }

        return combinedArray;
    }
}


