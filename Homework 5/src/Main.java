/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!!
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter your first number to be added");
        int firstInput = sc.nextInt();
        System.out.println("Enter your second number to be added");
        int secondInput = sc.nextInt();
        //remember this method is returning, so we need to print it out
        System.out.println(add(firstInput,secondInput));

        System.out.println("im going to print out the word Dog now.");
        printDog();

        System.out.println("Enter a number and I will tell you the fatorial: ");
        getfactorial();


        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        getsumofeveryother();

        System.out.println("Type a word and I will reverse it: ");
        reverseword();

    }


    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }


    public static void printDog(){
        System.out.println("Dog");
    }
    public static void getfactorial(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial*= i;

        }System.out.println(factorial);
    }

    public static void getsumofeveryother(){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1; i <= number; i+=2)
            sum += i;

        System.out.println(sum);
    }

    public static void reverseword() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = sc.next();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--)
            reverse += word.charAt(i);

        System.out.println(reverse);

    }
    }
