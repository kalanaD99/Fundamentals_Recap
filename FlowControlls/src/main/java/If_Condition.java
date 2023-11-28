import java.util.Scanner;

public class If_Condition {
    public static void main(String[] args) {
        /*//basic of if condition--
        int x =100;
        System.out.println("A");
        System.out.println("B");
        if (false){// if true then condition run, if false skip the condition
            System.out.println("C");
        }
        System.out.println("D");
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = input.nextInt();
        if(age>18) {
            System.out.println("You can Enter the film hall");
        }else
            System.out.println("You cannot Enter the film hall");
    }
}
