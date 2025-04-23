// import java.util.Scanner;

// public class conditionStatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int X = sc.nextInt();

//         if ( X > 0){
//             System.out.println( " X is greaterthan is 0");
//         }
//         else {
//             System.out.println(" X is lessthan or is equal to 0");
//         }
//     }
    
// }
// public class conditionStatement {

//     public static void main(String[] args) {
//         double temp = 103.5;

//         if ( temp >= 100){
//             System.out.println(" you have a feaver");
//         }
//         else {
//             System.out.println(" you don't have a feaver ");
//         }
//     }
// }

// import java.util.Scanner;

// import javax.sql.rowset.CachedRowSet;

// public class conditionStatement {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         /* Input week number for user  */
//         System.out.println(" Enter week number for (1-7)");
//         int week = sc.nextInt();

//         switch (week) {
//             case 1 : System.out.println(" Sunday");
                
//                 break;
//                 case 2 : System.out.println(" Monday");
                
//                 break;
//                 case 3 : System.out.println(" tuesday");
                
//                 break;
//                 case 4 : System.out.println(" Wednesday");
                
//                 break;
//                 case 5 : System.out.println(" thursday");
                
//                 break;
//                 case 6 : System.out.println(" Friaday");
                
//                 break;
//                 case 7 : System.out.println(" Saturday");
                
//                 break;
        
//             default:
//             System.out.println(" Invilid input! plz enter week number between (1-7) ");
               
//         }
//     }
//  }

// import java.util.Scanner;

// import javax.sql.rowset.CachedRowSet;

// public class conditionStatement {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         /* Input month  number for user  */
//         System.out.println(" Enter month number for (1-12)");
//         int month = sc.nextInt();

//         switch (month) {
//                 case 1 : System.out.println(" january");
                
//                 break;
//                 case 2 : System.out.println(" February");
                
//                 break;
//                 case 3 : System.out.println(" March");
                
//                 break;
//                 case 4 : System.out.println(" April");
                
//                 break;
//                 case 5 : System.out.println(" May");
                
//                 break;
//                 case 6 : System.out.println(" june");
                
//                 break;
//                 case 7 : System.out.println(" jauly");
                
//                 break;  
//                 case 8 : System.out.println("Agust");
                
//                 break;
//                 case 9 : System.out.println("Sptember");
                
//                 break;
//                 case 10 : System.out.println(" Octombr");
                
//                 break;
//                 case 11 : System.out.println(" Nvember");
                
//                 break;
//                 case 12 : System.out.println("Dcembr");
                
//                 break;
        
//             default:
//             System.out.println(" Invilid input! plz enter week number between (1-12) ");
               
//         }
//     }
//  }

// import java.util.Scanner;

// public class conditionStatement {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // input month number for user 
//         System.out.println( " Enter month  number for user (1-8)" );
//         int month  = sc.nextInt();

//         switch (month) {
            
//                 case 1 :
//             System.out.println(" Monday ");
                
//                 break;
//                 case 2 :
//             System.out.println(" vilas ");
                
//                 break;
//                 case 3 :
//             System.out.println(" mayur");
                
//                 break;
//                 case 4 :
//             System.out.println(" sumit ");
                
//                 break;
//                 case 5 :
//             System.out.println(" mathematics ");
                
//                 break;
//                 case 6 :
//             System.out.println(" english ");
                
//                 break;
//                 case 7 :
//             System.out.println(" ishu ");
                
//                 break;
//                 case 8 :
//             System.out.println(" khushal ");
                
//                 break;
        
//             default:
//             System.out.println(" Invilid input ! plz enter month  number between");
               
//         } 
//     }
// }
//  public class conditionStatement {
 
//     public static void main(String[] args) {
//         int a = 36 ;
//         int b = 63 ;
//         boolean X =  ( a < b ) ? true : false;
//         System.out.println(X);
//         int Y = ( a > b ) ? a : b;
//         System.out.println(Y);
//     }
//  }

import java.util.Scanner;

public class conditionStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean X = ( A < B ) ? true : false;
        System.out.println( X );
        int Y = (A > B ) ? A : B;
        System.out.println(Y);
    }
}