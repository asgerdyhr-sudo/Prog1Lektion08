package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] a = {5, 10};
        System.out.println("array is {"+a[0]+", "+a[1]+"}");
        System.out.println();
        swap(a);
        System.out.println("After invoking swap");
        System.out.println("array is {"+a[0]+", "+a[1]+"}");
    }

    public static void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
