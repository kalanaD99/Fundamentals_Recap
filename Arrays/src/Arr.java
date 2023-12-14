import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] ar = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Input no "+(i+1)+" :");
            ar[i] = input.nextInt();
        }

        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total+=ar[i];
        }
        System.out.println("Total ="+total);
    }
}
