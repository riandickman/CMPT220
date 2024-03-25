/*
challenge file!
this one isn't too tough, but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write-up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms?
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println(letter);
        }



    }
}

/*

how did you figure out how to do this? can you translate your code into simple terms?
you need to explain why you picked your for loop conditional and what's doing the work with the string

    To figure out how to do this, I went back to our in class slides to remind
    myself of the set-up for a for loop. Once I had my scanner set up, and the
    first piece of the set-up for a for loop (int i = 0;), I googled how to get a for \
    loop in java to loop for each letter, which helped me learned about .length, as well as
    the data type "char", and .chartAt(). Once I set up the loop to loop for each letter
    of the imported string and then used i++ to move to the next letter for each loop, I
    assigned the character data type variable "letter" to the letter of the imported name
    for that round of the loop (i), and then had it print it.
 */