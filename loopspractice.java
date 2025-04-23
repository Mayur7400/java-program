// public class loopspractice {

//     public static void main (String args []){

//         //int i = 1;
      
//            for ( int i=1; i<=7 ; i++){
//             System.out.println("hello world");
//             // i++;
//          }
        
//     }
// }

import java.util.Scanner;

public class loopspractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number");
            int number = sc.nextInt();

            if (number % 2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }
            System.out.println(" do you want to continous ? press 1 for yes or 0 for no");
            choice =sc.nextInt();
        }while(choice ==1);
        System.out.println(" sum of evenSum number : "+ evenSum) ;
        System.out.println(" sum of oddSum number : "+ oddSum) ;
    }
}