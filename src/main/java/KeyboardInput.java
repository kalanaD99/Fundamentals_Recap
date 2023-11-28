import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
       /* int x,y,z;
        x = 100;
        y = 200;
        z = x+y;
        System.out.println(z);*/

        Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.print("x :");
        x = input.nextInt();

        System.out.print("y :");
        y = input.nextInt();

        z = x+y;

        System.out.println("value of z is :"+z);

    }
}
