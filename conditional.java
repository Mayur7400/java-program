// public class conditional {

//     public static void main(String[] args) {
         
//         int age = 17;
         
//         if (age >= 18){
//             System.out.println(" adult : drive , vote ");
//         }

//          else {
//             System.out.println(" not adult");
//          }
//     }

// }
// public class conditional {

//     public static void main(String[] args) {
 
//          int value = -120;
//         if  ( value >= 999){
//             System.out.println(" adult : 799,284,465");

//         }
//         else{
//             System.out.println(" not adult : -420");
//         }
//     }
//}

// import java.util.Scanner;

// public class conditional {

//     public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt(); 
//       System.out.println(age);
//          if ( age >= 20){
//             System.out.println(" adult : vote ,drivre , marriged , engagement , baby");
//          }
//          else {
//             System.out.println("not adult : ");
//          }
//     }
// }

// import java.util.Scanner;

// public class conditional {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println(age);
//         if ( age <= 25){
//             System.out.println("adult : marrige , vote , drive , love");
//         }
//         else{
//             System.out.println(" not adult");
//         }
//      }
// }

// import java.util.Scanner;

// public class conditional {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println(age);         
//         if ( age >=18 ){
//             System.out.println("adult : marrige , vote , drive , love");
//         }
//         if ( age > 13 && age < 18){
//             System.out.println("teenager");
//         }
//         else{
//             System.out.println(" not adult");
//         }


//      }

// }

// import java.util.Scanner;

// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int A = sc.nextInt();
//         System.out.println(A);
//         int B = sc.nextInt();
//         System.out.println(B); 
         

//         if  ( A  >=  B  ) {
//             System.out.println( " A is the largest of 2 ");
//         }

//         else {
//             System.out.println( " B is the largest of 2");
//         }
//     }
// }

// import java.util.Scanner;

// public class conditional {

//     public static void main(String[] args) {
//         // print the largest of 2 number ;
//         Scanner sc = new Scanner(System.in);
         
//          int A = sc.nextInt();
//          int B = sc.nextInt();
//           System.out.println(A);
//           System.out.println(B);

//           if ( A >= B ){
//             System.out.println( " A is the largest of 2 ");
//           }

//           else {
//             System.out.println( " B is the largest of 2");
//           }
//     }
// }

// import java.util.Scanner;

// public class conditional {
//  // printn the largest of 2 numer are the following example :
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in );
//         int age = sc.nextInt();

//         if ( age >= 20){
//             System.out.println( " adult :  marriged , engagement , vote , love ");
//            }

//           if ( age > 13  &&  age <  18 )
//         {
//             System.out.println(" teenger");
//             } 

//          else 
//           {
//              System.out.println( " not adult");
//          }
//      }

//  }

//import java.util.Scanner;

// public class conditional {
 
    
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
         
//          int number = sc.nextInt();
//          System.out.println( number);

//          if ( number % 2 == 0){
//             System.out.println( " EVEN");
//          }

//          else {
//             System.out.println("ODD");
//          }
//      }
//  }
// public class conditional {
// // print if a number is odd and even 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int  number = sc.nextInt();
//          System.out.println(number);
          
//         if ( number % 2 == 0){
//             System.out.println( "EVEN");
//         }
//         else {
//             System.out.println("ODD");
//         }
//     }
// }
// public class conditional {

//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//           int number = sc.nextInt();
//           System.out.println(number );

//           if ( number % 6 == 0 ){
//             System.out.println(" even ");
//           }

//           else {
//             System.out.println("odd");
//           }
//      }
// }

// import java.util.Scanner;
// // else if statement 
// public class conditional {
 
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//      int age = sc.nextInt();
//       System.out.println(age);

//       if ( age >= 18 ){
//         System.out.println("adult");
//       }
//        else if ( age >13  && age < 18){
//         System.out.println("teenager");
//        }
//         else{
//             System.out.println("not adult");
//         }
//     }
//  }
// public class conditional {

//      public static void main(String[] args) {
//         int age = 15;
        
//                     if ( age >= 18 ){
//                     System.out.println("adult");
//                   }
//                    else if ( age >13  && age < 18){
//                     System.out.println("teenager");
//                    }
//                     else{
//                         System.out.println("not adult");
//                     }
//                 }
//      }

// import java.util.Scanner;

// public class conditional {
// //  else if statement 
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println(age);

//         if ( age >= 18){
//             System.out.println(" adult ");
//         }
//          else if ( age > 13 && age < 18){
//             System.out.println(" teenager");
//          }
//           else {
//                 System.out.println(" not adult");
//           }
//      }
// }

// import java.util.Scanner;

// public class conditional {
 // income tax calculator
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int income = sc.nextInt();
//          System.out.println(income);

//          int tax;

//          if ( income < 500000){
//            tax = 0;
//          }

//          else if ( income >= 500000 && income < 1000000){
//                 tax = (int) ( income * 0.2);
//          }
//          else {
//             tax = (int) (income * 0.3);
//          }

//           System.out.println(" your tax is :" + tax);
//          }
//      }

// import java.util.Scanner;

// public class conditional {

//     // income tax calculater 
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//          System.out.println(income);
//          int tax;

//           if ( income < 500000){
//             tax = 0;
//          }
//          else if ( income >  500000  &&  income < 100000){
//             tax = (int) ( income * 0.2);
//          }

//          else {
           
//             tax  = (int) ( income * 0.3);
//          }
          
//           System.out.println( " Your tax is : "  + tax);
//     }
// }

// import java.util.Scanner;

// public class conditional {
//  // income tax calculator  
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in );
//       int income = sc.nextInt();
//       System.out.println(income);
//        int tax;
        
//         if ( income < 500000 ){
//           tax = 0;
//         }

//         else if ( income > 500000  && income < 1000000 ){
//           tax = (int) ( income * 0.2); 
//         }
         
//         else {
//          tax = (int) ( income * 0.3);
//         }
//         System.out.println(" your tax is : " + tax);
//     }
//  }

// import java.util.Scanner;

// public class conditional {
 
//     public static void main(String[] args) {
      
    
//        Scanner sc = new Scanner(System.in);
//        int income =sc.nextInt();
//        System.out.println(income);

//        int tax ;

//        if ( income < 800000){
//           tax = 0;

//        }
//         else if ( income > 800000 && income < 160000){
//         tax = (int)( income * 0.2);
//        }
//        else {
         
//          tax = (int) ( income * 0.3);
//        }
    
//        System.out.println( " your tax is :" + tax);
//  }
// }

// import java.util.Scanner;
// // income tax calculator
// public class conditional {

//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int income = sc.nextInt();
//       System.out.println(income);
       
//        int tax ;
        
//        if (  income < 500000){
//          tax = 0;
//        }
//        else if ( income < 500000 && income > 1000000 ){
//          tax = (int) ( income * 0.2);
//        }

//        else {
//          tax = (int) ( income * 0.3);
//        }
//        System.out.println( " your tax is :" + tax);
        
//    }
// }

// import java.util.Scanner;

// public class conditional {
 
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int income = sc.nextInt();
//    System.out.println(income);
//     int tax ;

//     if ( income <  500000){
//       tax = 0;

//     }
//      else if ( income < 500000 &&  income > 1000000){
//       tax = (int) ( income * 0.2);
//      }
//      else {
//        tax = ( int) ( income * 0.3);
//      }
//      System.out.println(" Your tax is :" + tax);
//    }
//  }

//import java.util.Scanner;

// public class conditional {
 
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//     int income = sc.nextInt();
//     System.out.println( income);
//      int tax ;

//      if ( income < 500000){
//       tax = 0;

//      }

//      else if  ( income < 500000 && income > 1000000 ){
//        tax = (int) (income * 0.2);
//      }

//      else {
//             tax = (int ) ( income * 0.3);

//       }

//       System.out.println(" Your tax is : "  + tax);
//     }
//  }

// import java.util.Scanner;

// public class conditional {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int A = sc.nextInt(); 
//     int B = sc.nextInt();
//     int C = sc.nextInt();
    
//    // the largest number 
//     if ( ( A >= B ) && ( A >= C)){
//       System.out.println(" largest is A : " + A );
//     }
//      else if (B >=C ){
//       System.out.println(" largest is B : " + B );
//      }
//      else {
//       System.out.println(" largest is C : " + C );
//      }


//   }
// }

// import java.util.Scanner;

// public class conditional {
 

//   // print the largest of 3 number 
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int X = sc.nextInt();
//     int Y = sc.nextInt();
//     int Z = sc.nextInt();

//     if ( ( X >= Y) && ( X > Z) ){
//       System.out.println(" the largest is X : "  + X);
//     }
//     else if ( X >= Z ){
//       System.out.println(" the largest is Y :" + Y);
//     }
//     else {
//       System.out.println(" the largest is Z :" + Z );
//     }
    
//   }
//  }

// import java.util.Scanner;


// public class conditional {



//     // ternary operator 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt() ;

//          // ternary operator 

//          String type =((number%2)==0 ) ? " EVEN" : " ODD";
//          System.out.println(type);
//     }
// }

// import java.util.Scanner;

// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in );
//          int marks = sc.nextInt();

//          // ternary 
//          String reportCard = ( marks > 33 ) ? " PASS ": "FAIL";
//          System.out.println(reportCard);
//     }
// // }

// import java.util.Scanner;

// public class conditional {
 
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int marks = sc.nextInt();

//          // check will if a student will pass and fail


//          String reportCard = ( marks > 40) ?  " PASS " : "FAIL";
//          System.out.println(reportCard);
//     }
//  }
 

p