package substraction_of_two_numbers;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        int a,b,c, substrsction;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc .nextInt();
        substrsction = a-b-c;
        System.out.println("substration =" + substrsction);
    }
}
