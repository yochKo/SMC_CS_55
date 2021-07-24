/*
Name: young cheol ko
Class: CS55
Project 1
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hi, I am really good at math! Put me to the test.\n" +
                    "Please enter two numbers and then press Enter:");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double result;
            sc.nextLine();
            System.out.println("Please enter one of the operations +,-, * or / and press Enter:");
            char oper = sc.nextLine().charAt(0);
            if(oper=='+') {
                result = x + y;
                System.out.println(x + "+" + y + "=" + result);
                System.out.println("I'm great at addition!");
            } else if(oper=='-') {
                result = x - y;
                System.out.println(x + "-" + y + "=" + result);
                System.out.println("I'm great at subtraction!");
            } else if(oper=='*') {
                result = x * y;
                System.out.println(x + "*" + y + "=" + result);
                System.out.println("I'm great at multiplication!");
            } else if(oper=='/') {
                result = x / y;
                System.out.println(x + "/" + y + "=" + result);
                System.out.println("I'm great at division!");
            } else {
                System.out.println("I can compute really well, but what you entered is not one of the operations I know...");
            }

            System.out.println("Play again [Y/N]?:");
            ch = sc.nextLine().charAt(0);
        }while (ch == 'Y');
        System.out.println("Bye bye!");
    }
}