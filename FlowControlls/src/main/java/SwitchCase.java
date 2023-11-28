import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a Number :");
        int x = input.nextInt();

        switch (x){
            case 1 :
                System.out.println("Number 1");
                break;
            case 2 :
                System.out.println("Number 2");
                break;
            case 3 :
                System.out.println("Number 3");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
