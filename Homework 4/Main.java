
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Main {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};
        //you cannot use the array util. Do this one by hand :(
        boolean[] duplicateprinted = new boolean[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            if (!duplicateprinted[i]) {
                for (int j = 0; j < myArray.length; j++) {
                    if (myArray[i] == myArray[j]) {
                        count++;
                        duplicateprinted[j] = true;

                    }
                }
                if (count > 1) {
                    System.out.println("Duplicate:" + myArray[i]);
                    System.out.println("Number of occurrences " + count);
                    duplicateprinted[i] = true;
                }

            }


        }
    }
}