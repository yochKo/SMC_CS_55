/*
Name: young cheol ko
Class: CS55
Project 5
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

import java.util.Scanner;
public class DriverLicense {
    public static void printChoices(String[] correctAnswers, String[] userAnswers) {
        int same;
        for (int i = 0; i < 20; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                same = 1;
            } else {
                same = 0;
            }
            System.out.println((i + 1) + ". answer :\t(" + correctAnswers[i] + "/" + userAnswers[i] + "):\t" + same);
        }
    }

    public static int countCorrect(String[] correctAnswers, String[] userAnswers) {
        int correct = 0;
        for (int i = 0; i < 20; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                correct++;
            }
        }
        return correct;
    }

    public static void main(String[] args) {
        String correctAnswers[] = new String[]{"A", "D", "B", "B", "C", "B", "A", "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A", "D", "B"};
        String userAnswers[] = new String[20];
        int correct = 0;

        System.out.println("Enter your answers as A or B or C or D only");
        System.out.println("Enter your answers at the prompted question numbers below:");
        String value = "";
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Answer for " + (i + 1) + ": ");
            value = input.next();
            //exception
            while (!value.equalsIgnoreCase("A") && !value.equalsIgnoreCase("B") && !value.equalsIgnoreCase("C") && !value.equalsIgnoreCase("D")) {
                System.out.println("Enter your answers as A or B or C or D only");
                System.out.print("Answer for " + (i + 1) + ": ");
                value = input.next();
            }
            userAnswers[i] = value;
        }

        correct = countCorrect(correctAnswers, userAnswers);
        System.out.println("\nResults");
        if(correct>=15) {
            System.out.println("Student is passed!");
        }
        else {
            System.out.println("Student is failed!");
        }
        System.out.println("You scored: \n" + (correct * 5)+"%");
        System.out.println("Correct: " + correct);
        System.out.println("Incorrect:\t" + (20 - correct)+"\n");
        printChoices(correctAnswers, userAnswers);
    }
}