import java.util.Scanner;

public class ibrahimkoc_2211502004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman değerini gir: ");
        int value = input.nextInt();
        long time1 = System.nanoTime();
        fibonacciDizi(value);
        long time2 = System.nanoTime();
        System.out.println("Time: " + (time2 - time1) / 1000);
    }

    public static void fibonacciDizi(int value) {
        long num1 = 0;
        long num2 = 1;
        long temp;

        if (value == 1) {
            System.out.println(num1);
            return;
        } else {
            System.out.println(num1);
        }
        for (int i = 0; i < value; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.println(num2);
        }
    }

}
