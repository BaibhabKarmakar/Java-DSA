import java.util.*;
public class Code {
    public static void printMul(int a , int b) {
        int mul = a * b;
        System.out.println("The nultiplication of the 2 numbers are : " + mul);
    }
    public static void printSum(int a , int b) {
        int sum = a + b;
        System.out.println("The sum of the given 2 numbers are : " + sum);
    }
    public static void printName(String name) {
        System.out.println("Hello! Mr. " + name);
    }
    public static void getFactorial(int number) {
        int result = 1;
        if(number < 0) {
            System.out.println("We can't mathematically calculate the factorial of a negative number ! Sorry !");
        }
        if(number == 0) {
            System.out.println("The factorial of 0 is 1");
        }
        for(int i = number ; i > 0 ; i--) {
            result *= i;
        }

        System.out.println("The result of the given number factorial is : " + result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Question 1 : Print a given name in a function : 

        // System.out.println("Can you please tell me your name ? : ");
        // String name = sc.nextLine();
        // printName(name);


        // Question 2 : Make a function to add 2 numbers and return the sum . 

        // System.out.println("Enter the first number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number : ");
        // int b = sc.nextInt();
        // printSum(a , b);


        // Question 3 : Make a funciton that multiples 2 numbers and give the product 

        // System.out.println("Enter the first number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number : ");
        // int b = sc.nextInt();
        // printMul(a , b);
        

        // Question 4 : Make a function to calculate the factorial of a given number : 
        
        // System.out.println("Enter the number : ");
        // int number = sc.nextInt();
        // getFactorial(number);
        sc.close();
    }
}
