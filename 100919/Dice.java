/*
Name: young cheol ko
Class: CS55
Project 3
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

public class Dice {

    public int Roll() {
        int D1 = (int) (Math.random() * (6)) + 1;
        int D2 = (int) (Math.random() * (6)) + 1;
        int sum  = D1+D2;
        String toString = "Player rolled dice, " + D1 + " + " + D2 + " = " + sum;;
        System.out.println(toString);
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Let's roll the dice!");
        String gameStatus;
        int myPoint = 0;
        Dice Player= new Dice();
        int sumOfDice=Player.Roll();
        switch (sumOfDice) {
            case 7:
            case 11:
                gameStatus = "WON";
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = "LOST";
                break;
            default:
                gameStatus = "AGAIN";
                myPoint=sumOfDice;
                System.out.println("Point is "+sumOfDice);
        }
        while(gameStatus.equals("AGAIN")==true) {
            sumOfDice=Player.Roll();
            if ( sumOfDice == myPoint ){
                gameStatus = "WON";
            }
            else if ( sumOfDice == 7 ){
                gameStatus = "LOST";
            }
        }
        if (gameStatus.equals("WON")==true) {
            System.out.println("Player wins.");
        }
        if (gameStatus.equals("LOST")==true) {
            System.out.println("Player loses.");
        }
        System.out.println("Bye bye!");
    }
}
