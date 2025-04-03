import java.util.*;
public class HomeWork {
    public static void main(String args[]) {
        // Make a calculator("Sum" , "Difference" , "Multiplication" , "Division")

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button (1 to 4) : ");
        int button = sc.nextInt();

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        switch(button) {
            case 1 : 
                System.out.println("The sum of " + a + " and " + b + " is : " + (a + b));
                break;
            case 2 : 
                if(a > b) {
                    System.out.println("The difference of " + a + " and " + b + " is : " + (a - b));
                }
                else {
                    System.out.println("The difference of" + a + " and " + b + " is : " + (b - a));
                }
                break;
            case 3 : 
                System.out.println("The multiplication of " + a + " and " + b + " is : " + (a * b));
                break;
            
            case 4 : 
                if(b == 0) {
                    System.out.println("The division is impossible (We can't divide anything by 0 ri8) ? ");
                }
                else {
                    System.out.println("The division of " + a + " and " + b + " is : " + (a/b));
                }
                break;
            default : 
                System.out.println("Invalid Input!");
                break;
        }
    }
}
