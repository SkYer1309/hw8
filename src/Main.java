import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
        }
        System.out.println("\nЗадача 2");
        for (int i = 0; i <= arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i == arr1.length - 1) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println();
        for (int i = 0; i <= arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i == arr1.length - 1) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println();
        for (int j = 0; j <= arr3.length; j++) {
            System.out.print(arr3[j]);
            if (j == arr3.length - 1) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println("\nЗадача 3");
        for (int i = 0; i <= arr1.length / 2; i++) {
            int x = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = x;
                  }
        System.out.print(Arrays.toString(arr1)+"\n");

        for (int i = 0; i <= arr1.length / 2; i++) {
            float x = arr2[i];
            arr2[i] = arr2[arr1.length - 1 - i];
            arr2[arr1.length - 1 - i] = x;
        }
        System.out.print(Arrays.toString(arr2)+"\n");

        for (int i = 0; i <= arr1.length / 2; i++) {
            int x = arr3[i];
            arr3[i] = arr3[arr3.length - 1 - i];
            arr3[arr3.length - 1 - i] = x;
        }
        System.out.print(Arrays.toString(arr3)+"\n");

        System.out.println("\nЗадача 3");

    }
}















