package codesoft;

import java.util.*;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        
         System.out.println("Secret number = " + number);

        int guess = 0;

        while (guess != number) {

            System.out.println("Enter your guess: " + guess);
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct value");
            }
            else if (guess < number) {
                System.out.println("Too Low value");
            }
            else {
                System.out.println("Too High value");
            }
        }
    }
}