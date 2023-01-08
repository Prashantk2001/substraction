package substraction_of_two_numbers;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        int a,b,c,substraction;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        substraction = a-b-c;
        System.out.println("substraction = " + substraction);
    }
}
