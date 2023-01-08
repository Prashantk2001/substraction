package substraction_of_two_numbers;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int a, b, c, substraction;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any number");
        a = Sc.nextInt();
        b = Sc.nextInt();
        c = Sc.nextInt();
        substraction = a-b-c;
        System.out.println("substraction = " + substraction);

    }
}