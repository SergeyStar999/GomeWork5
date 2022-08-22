import java.util.Arrays;

public class Main {

    // Задание 3
    public static void main(String[] args) {

        // Задание 1

        int[] a = new int[3];
        a[0]= 1;
        a[1]= 2;
        a[2]= 3;

        double[] b = {1.57, 7.654, 9.986};

        int[] c = new int[35];

        // Задание 2

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1]);

        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[b.length - 1]);

        for (int i = 0; i < c.length - 1; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.println(c[c.length - 1]);

        System.out.println();

        // Задача 3

        for (int i = a.length - 1; i >= 1; i--) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 3]);

        for (int i = b.length - 1; i >- 0; i--) {
            System.out.print(b[i] + ", ");
        }
        System.out.print(b[b.length - 3]);
        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i] + ", ");
        }
        System.out.print(c[c.length - 3]);
        System.out.println();

        // Задание 4

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
            System.out.print(a[i] + " ");
        }
    }
}