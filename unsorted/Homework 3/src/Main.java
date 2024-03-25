import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated) : ");
        int num = sc.nextInt();
        int i = 1;
        while(i <= 10) {
            int table = i*num;
            i++;
            System.out.println(table);
        }

    }
}