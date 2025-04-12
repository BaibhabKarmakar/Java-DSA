import java.util.*;
public class Code {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in a row you want : ");
        int cols = sc.nextInt();
        
        // Quesiton1 : Print the following pattern : 

        /*
            * * * * * 
            * * * * * 
            * * * * * 
            * * * * * 
         */

        //  for(int i = 0 ; i < rows ; i++) {
        //     for(int j = 0 ; j < cols ; j++) {
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // Question : Pirnt the following pattern : 
        /* 
            * * * * * 
            *       * 
            *       * 
            * * * * * 
        */

        // for(int i = 0 ; i < rows ; i++) {
        //     for(int j = 0 ; j < cols ; j++) {
        //         if(i == 0 || i == rows-1 || j == 0 || j == cols-1) {
        //             System.out.print("*" + " ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Question : Print the following pattern : 

        /*
            * 
            * * 
            * * * 
            * * * * 
            * * * * * 
        */

        // for(int i=0 ; i < rows ; i++) {
        //     for(int j = 0 ; j <= i ; j++) {
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // Question : Print the following pattern : 

        /*
            * * * * 
            * * * 
            * * 
            * 
        */

        // for(int i=0 ; i < rows ; i++) {
        //     for(int j=0 ; j < rows - i ; j++) {
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // Question : Print the following pattern : 

        /*
                  * 
                * *
              * * * 
            * * * * 
        */  

        // for(int i = 0 ; i < rows ; i++) {
        //     for(int j=0 ; j < rows - i - 1 ; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int k=0 ; k <= i ; k++) {
        //         System.out.print("*" + " ");
        //     }

        //     System.out.println();
        // }

        // Question : Print the following pattern : 

        /*
            1 
            1 2 
            1 2 3 
            1 2 3 4 
            1 2 3 4 5 
            1 2 3 4 5 6 
        */

        // for(int i=0 ; i < rows ; i++) {
        //     for(int j=0 ; j <= i ; j++) {
        //         System.out.print((j+1) + " ");
        //     }
        //     System.out.println();
        // }

        // question : Print the following pattern : 
        /*
            1 2 3 4 5 
            1 2 3 4 
            1 2 3 
            1 2 
            1 
         */

        // for(int i=0 ; i<rows; i++) {
        //     for(int j=0; j<rows - i; j++) {
        //         System.out.print((j+1) + " ");
        //     }
        //     System.out.println();
        // } 

        // Question : Print the following pattern : (Floyd's triangle)

        /*
            1 
            2 3 
            4 5 6 
            7 8 9 10
         */
        // int number = 0;
        // for(int i=0 ; i<rows ; i++) {
        //     for(int j=0 ; j <= i ; j++) {
        //         System.out.print((number + 1) + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // Question : Print the following pattern : 

        /*
            1
            0 1 
            1 0 1 
            0 1 0 1 
            1 0 1 0 1
         */

        
        // for(int i=0 ; i < rows ; i++) {
        //     int number = (i % 2 == 0) ? 1 : 0;
        //     for(int j = 0 ; j <= i ; j++) {
        //         System.out.print(number + " ");
        //         number = 1 - number;
        //     }
        //     System.out.println();
        // }
    } 
}
