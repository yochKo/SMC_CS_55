/*
Name: young cheol ko
Class: CS55
Project 4
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

import java.util.Scanner;
public class TransferAdvisor {
    public static void printResult(String school, String major, double GPAneeded, double GPAstud){
        if(GPAstud >= GPAneeded)
            System.out.printf("You could transfer to "+ school + " to study " + major);
        else{
            double diff = GPAneeded - GPAstud;
            System.out.printf("You need to improve your GPA by %.2f to transfer to %s to study %s", diff, school, major);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String school, major;
        double GPAStud;
        System.out.print("Enter the school name: ");
        school = sc.next();
        System.out.print("Enter the major: ");
        major = sc.next();
        System.out.print("Enter your GPA: ");
        GPAStud = sc.nextDouble();
        switch(school.toUpperCase()){
            case "UCLA":
                switch(major.toUpperCase()){
                    case "CS":
                        printResult(school, major, 3.7, GPAStud);
                        break;
                    case "ECON":
                        printResult(school, major, 3.5, GPAStud);
                        break;
                    case "ENGLISH":
                        printResult(school, major, 3.2, GPAStud);
                        break;
                    default:
                        System.out.print("There is no " + major + " major at " + school);
                }
                break;
            case "UCB":
                switch(major.toUpperCase()){
                    case "CS":
                        printResult(school, major, 3.8, GPAStud);
                        break;
                    case "ECON":
                        printResult(school, major, 3.4, GPAStud);
                        break;
                    case "ENGLISH":
                        printResult(school, major, 3.3, GPAStud);
                        break;
                    default:
                        System.out.print("There is no " + major + " major at " + school);
                }
                break;
            case "UCI":
                switch(major.toUpperCase()){
                    case "CS":
                        printResult(school, major, 3.6, GPAStud);
                        break;
                    case "ECON":
                        printResult(school, major, 3.7, GPAStud);
                        break;
                    case "ENGLISH":
                        printResult(school, major, 3.4, GPAStud);
                        break;
                    default:
                        System.out.print("There is no " + major + " major at " + school);
                }
                break;
            case "UCSD":
                switch(major.toUpperCase()){
                    case "CS":
                        printResult(school, major, 3.5, GPAStud);
                        break;
                    case "ECON":
                        printResult(school, major, 3.3, GPAStud);
                        break;
                    case "ENGLISH":
                        printResult(school, major, 3.0, GPAStud);
                        break;
                    default:
                        System.out.print("There is no " + major + " major at " + school);
                }
                break;
            default:
                System.out.print(school + " is not in the school system.");
        }
    }
}

