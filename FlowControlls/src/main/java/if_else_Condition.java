import java.util.Scanner;

public class if_else_Condition {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Insert your Age : ");
        int age = input.nextInt();
        if (age>=18)
            System.out.println("Your are eligible to watch family films");
        else if (age>=21) {
            System.out.println("You can watch adult film too");
        }else
            System.out.println("Yu can watch kids movies only!");
    }
}
