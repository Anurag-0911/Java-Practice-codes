package practice;

import java.util.Scanner;
class Guessgame{
    private int input;
    private int guess=0;
    private int rand=0;
    void setGuess(){

        guess+= 1;
    }
    void getGuess(){
        System.out.println("You took "+guess+" attempts to guess the number.");
//        return guess;
    }
    void Input(){
        System.out.println("Guess any number");
        Scanner sc = new Scanner(System.in);
        while(input!=rand) {
            input = sc.nextInt();
            isCorrect();
            setGuess();
        }
    }
    void isCorrect(){
        if (input>rand){
            System.out.println("Your number is greater than random number");
        }
        else if (input<rand){
            System.out.println("Your number is less than random number");
        }
        else
            System.out.println("Congratulations,You found the random number.");
    }
    public Guessgame(){
         rand = (int) (Math.random() * 100);
    }
}
public class G_game {
    public static void main(String[] args) {
        Guessgame g1 = new Guessgame();
        g1.Input();
        g1.getGuess();
    }
}
