package substraction_of_two_numbers;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int a,b,c,d, substraction;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
       substraction = a-b-c-d;
        System.out.println("your ans is"  + substraction);


    }
}
