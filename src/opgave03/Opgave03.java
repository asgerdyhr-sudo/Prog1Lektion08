package opgave03;

public class Opgave03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array inden det bliver vendt om i ny array");
        printArray(array);

        System.out.println();
        System.out.println();

        System.out.println("Arry vendt om i nyt array");
        printArray(reversedArray(array));

        System.out.println();
        System.out.println();

        System.out.println("tjek om array har ændret sig");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static int[] reversedArray(int[] array) {
        // Opret det nye array
        int[] reversedArray = new int[array.length];

        //Normal forløkke der løber igennem det orginale array
        for (int index = 0; index < array.length; index++) {
            reversedArray[index] = array[array.length - 1 - index]; //Her tildeler vi
        }
        return reversedArray;
    }
}



