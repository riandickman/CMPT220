import java.util.Arrays;
//Our cheaty array helper file <3
public class Main {
    public static void main(String[] args) {

        //Create me an array named "nameArray" that is a string and has 4 values in it, give me 4 names of people or animals you care about
        String[] nameArray = {"Kellen", "Laurie", "Tim", "Mack"};
        //Create me an array without any values, but it's an integer array named "numArray"
        int[] numArray = {};
        //Create me an int array named "newArray" and set it to have 20 null spaces
        int[] newArray = new int[20];
        int nullvalue = -1;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nullvalue;




        //Here's our first practice array!
        String[] sortMe = {"Apple","Kiwi","Orange","Banana","Watermelon","Strawberry"};
        //What method is missing here to actually sort our array?
        Arrays.sort(sortMe);
        //And what method is missing here to print out that array?
        System.out.println(Arrays.toString(sortMe));
        //After this, you cannot use the array helper file, gotta go back to the old ways!!

        //another one!
        int addMe[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //How would we add every index together and print out the sum??
        //A small hint:
        int sum = 0;

        for (int m = 0; m < addMe.length; m++) {
            sum += addMe[m];

    }System.out.println("Sum of array: " + sum);


        //thinking one! here's an array
        int maxMe[] = {280, 4892, 134, 23, 1937, 5329, 932, 89};
        int large = maxMe[0];
        for (int j = 0; j < maxMe.length; j++) {
            if (maxMe[j] > large) {
                large = maxMe[j];
            }

        //What would you have to do to find the largest number and then print that value?


    }System.out.println("Largest number: " + large);
}}}