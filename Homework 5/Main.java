/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it.
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's calculate your GPA!");
        calculateGPA();

    }
    public static void calculateGPA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade out of 4.0 for class 1: " );
        float class1 = sc.nextFloat();
        System.out.print("How many credits is class 1? " );
        float credits1 = sc.nextFloat();
        System.out.print("Enter grade out of 4.0 for class 2: " );
        float class2 = sc.nextFloat();
        System.out.print("How many credits is class 2? " );
        float credits2 = sc.nextFloat();
        System.out.print("Enter grade out of 4.0 for class 3: " );
        float class3 = sc.nextFloat();
        System.out.print("How many credits is class 3? " );
        float credits3 = sc.nextFloat();
        System.out.print("Enter grade out of 4.0 for class 4: " );
        float class4 = sc.nextFloat();
        System.out.print("How many credits is class 4? " );
        float credits4 = sc.nextFloat();

        float gradevalue1 = credits1*class1;
        float gradevalue2 = credits2*class2;
        float gradevalue3 = credits3*class3;
        float gradevalue4 = credits4*class4;
        float credits = credits1 + credits2 + credits3 + credits4;



        for (float i=1; i < 0; i++);
            float sum = (gradevalue1 + gradevalue2 + gradevalue3 + gradevalue4)/credits;
            System.out.println(sum);
    }
}