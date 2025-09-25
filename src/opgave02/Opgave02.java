package opgave02;

import java.time.Instant;
import java.time.chrono.MinguoDate;

public class Opgave02 {
    public static void main(String[] args) {
        int[] intArray = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 1 - Tager swap metoden og føre den til arrayet
        System.out.println("Array before invoking swap off first and last digits:");
        printArray(intArray);
        System.out.println();
        System.out.println();
        swapFirstAndLast(intArray);
        System.out.println("After invoking swap");
        printArray(intArray);

        System.out.println();
        System.out.println();

        int[] intArray1 = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 02 - Ændre alle lige tal til "0"
        System.out.println("Array before invoking even unmber to 0:");
        printArray(intArray1);
        System.out.println();
        System.out.println();
        replaceEvenWithZero(intArray1);
        System.out.println("After invoking even number");
        printArray(intArray1);

        System.out.println();
        System.out.println();

        int[] intArray2 = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 03 - Finder det mindste element i array
        System.out.println("Det mindste element er:");
        System.out.println(minElement(intArray2));

        System.out.println();

        int[] intArray3 = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 04 - Finder index pladen hvor det mindste element er
        System.out.println("Pladens for det mindste elemt er");
        System.out.println(minElementPlace(intArray3));

        System.out.println();

        int[] intArray4 = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 05 - Skubber alle index i arrayet til højre og det sidste element skal stå på index "0"
        System.out.println("Array inden det bliver skubbet:");
        printArray(intArray4);
        System.out.println();
        System.out.println();
        pushEverythingOnePlaceToTheRight(intArray4);
        System.out.println("Array after invoking push to the right");
        printArray(intArray4);

        System.out.println();
        System.out.println();

        int[] intArray5 = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 06 - Finder det næststørstetal i arrayet
        System.out.println("Det næststørste tal er:");
        System.out.println(secondBiggestNumber(intArray5));

        System.out.println();

        int[] intArray6 = {23, 8, 202, -13, 42, 6, 53, 17, 22};

        //Opgave 07
        System.out.println("Array before invoking sort method:");
        printArray(intArray6);
        System.out.println(correctIfInChronologicalOrder(intArray6));
        System.out.println();
        sortsAnArrayFromLargestToSmallest(intArray6);
        System.out.println("Array after invoking sort method:");
        printArray(intArray6);
        System.out.println(correctIfInChronologicalOrder(intArray6));

        System.out.println();
        System.out.println();

        int[] intArray8 = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        int[] intArray9 = {23, 8, 202, -13, 42, 6, 53, 17, 22, 8};

        //Opgave 08
        System.out.println("Tjekker array for dubletter:");
        printArray(intArray8);
        System.out.println(ifAnArrayHasDuplicates(intArray8));
        System.out.println();
        System.out.println("Tjekker array for dubletter:");
        printArray(intArray9);
        System.out.println(ifAnArrayHasDuplicates(intArray9));
    }

    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    //Opgave 2.1
    public static void swapFirstAndLast(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    //Opgave 2.2
    public static void replaceEvenWithZero(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                array[index] = 0;
            }
        }
    }

    //Opgave 2.3
    public static int minElement(int[] array) {
        int minElement = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minElement) {
                minElement = array[index];
            }
        }
        return minElement;
    }

    //Opgave 2.4
    public static int minElementPlace(int[] array) {
        int minElement = array[0];
        int minElementPlace = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < minElement) {
                minElement = array[index];
                minElementPlace = index;
            }
        }
        return minElementPlace;
    }

    //Opgave 2.5
    public static void pushEverythingOnePlaceToTheRight(int[] array) {
        int lastElement = array[array.length - 1]; // Gemmer det sidste element
        for (int index = array.length - 1; index > 0; index--) { //Køre loopet
            array[index] = array[index - 1];
        }
        array[0] = lastElement;
    }

    //Opgave 2.6
    public static int secondBiggestNumber(int[] array) {
        int maxNumber = array[0];
        int secondMaxNumber = array[1];
        if (maxNumber < secondMaxNumber) {
            int temp = maxNumber;
            maxNumber = secondMaxNumber;
            secondMaxNumber = temp;
        }
        for (int index = 1; index < array.length; index++) {
            if (array[index] > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = array[index];
            } else if (array[index] > secondMaxNumber) {
                secondMaxNumber = array[index];

            }
        }
        return secondMaxNumber;
    }

    //Opgave 2.7
    public static boolean correctIfInChronologicalOrder(int[] array) {
        if (array.length <= 1)
            return false;

        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                return false;
            }
        }

        return true;
    }

    //Opgave 2.7A - Sokter et array fra størst til mindst
    public static void sortsAnArrayFromLargestToSmallest(int[] array) {
// Tjek for specialtilfælde, hvor arrayet er tomt eller har kun ét element
        if (array == null || array.length <= 1) {
            return;
        }

        // Ydre løkke: Går igennem hele arrayet
        for (int i = 0; i < array.length - 1; i++) {
            // Antager, at det mindste element er ved den aktuelle position
            int minIndex = i;

            // Indre løkke: Finder det mindste element i den usorterede del
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Opdaterer indekset for det mindste element
                }
            }

            // Bytter det fundne mindste element med det første element i den usorterede del
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    //Opgave 2.8
    public static boolean ifAnArrayHasDuplicates(int[] array) {
        for (int index = 0; index < array.length - 1; index++) { //Køre igennem det første array undtagen det sidste element
            for (int j = index + 1; j < array.length; j++) { //Køre igennem arrayet fra det "2" element og til slutningen
                if (array[j] == array[index]) { //Her sammenligner vi de 2 arrays for at tjekke for dubletter
                    return true;
                }
            }
        }
        return false;
    }
}

