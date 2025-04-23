
import java.util.Scanner;

// import java.util.Scanner;

// public  class function {

    
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print(" input the first number :  " );
//           double x = sc.nextDouble();
//         System.out.print(" input the second number : ");
//         double y = sc.nextDouble();
//         System.out.print(" input the third number :");
//         double z = sc.nextDouble();
//           System.out.print(" the average value is  " + average ( x, y, z) +"\n");
//     }
//            public static double average (double x, double y, double z){
//             return (x+ y+ z)/3; 
//            }

//     }

// import java.util.Scanner;

// public class function {

  
//   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print( " input the first number: ");
//        double a = sc.nextDouble();
//        System.out.print(" input the second number :");
//        double b = sc.nextDouble();
//        System.out.print( " input the third number : ");
//        double c = sc.nextDouble();
//        System.out.print( " the average value is "  + average( a, b ,c) + "\n");

//   }
//   public static  double average(double a, double b , double c ) {
//     return (a + b + c)/3; 
//   }
// }

// import java.util.Scanner;

// public class function{

//     public static void main ( String args []){

//       Scanner sc = new Scanner(System.in);
//       System.out.print(" input the first number : ");
//       double i = sc.nextDouble();
//       System.out.print(" input the second number : ");
//       double s = sc.nextDouble();
//       System.out.print(" input the third number : ");
//       double h = sc.nextDouble();
//       System.out.print(" input the fourth number : ");
//       double u = sc.nextDouble();
//       System.out.println(" the  average value is  :" + average (i , s , h , u) +"\n");
//     }
//     public static double  average ( double  i, double s, double h, double u ){
//       return ( i + s + h + u) / 4; 
//     }
//   }

// import java.util.Scanner;
// public class function {

//   public static void main(String[] args) {
    
//    Scanner sc = new Scanner(System.in);
//     int num ;
//     System.out.print( " Enter an integer : ");
//        num = sc.nextInt();

//     if ( isEven (num)){
//       System.out.println(" number is even ");
//     } else {
//       System.out.println(" number is odd");
//     }
//   }
//   public static boolean isEven(int number ){
//     if ( number % 2 == 0){
//       return true ;
//     }
//     else {
//       return false;
//     }
//   }
// }

// import java.util.Scanner;

// public  class function {
 
//   public static void main(String args []){
//     Scanner sc = new Scanner(System.in);
//     int num ;
//     System.out.println("enter the integer :" );
//     num =sc.nextInt();
//     if ( isEven (num)){
//       System.out.println(" number is even ");
//     }else {
//       System.out.println( " number is odd ");
//     }
//   }
//   public static boolean  isEven(int number ){
//     if ( number % 2 == 0 ){
//       return  true ;
//     }
//     else {
//       return  false ;
//     }
//   }
//  }

// import java.util.Scanner;

// public class function {
 
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in );
   
//    int num ;
//     System.out.println(" Enter the integer  ");
//     num = sc.nextInt();
//      if ( isEven(num)){
//       System.out.println(" number is even ");
//      }
//      else {
//       System.out.println( " number is odd");
//      }
//   }
//   public static boolean isEven(int number ){
//     if ( number % 2 ==0 ){
//       return true ;

//     }
//     else {
//       return false;
//     }
//   }
//  }

// import java.util.Scanner;

// public class function {
  
//   public static void main ( String args []){
    
//     Scanner sc = new Scanner( System.in);
//      int num ;
//       System.out.println( " Enter the integer :");
//       num = sc.nextInt();
       
//        if ( isEven( num )){
//          System.out.println( " number is even ");
//        }
//         else {
//            System.out.println( " number is odd ");
//         }
//       }
//          public static boolean isEven( int number ){
//           if ( number % 2 == 0){
//              return  true ;
//           }
//           else {
//             return  false ;
//           }
//          }
//   }
 

public class function {
   
  public static void main( String args []){

    System.out.print( " Plese Enter a Number :  ");
    Scanner sc = new Scanner( System.in);
     int palindrome = sc.nextInt();

      if ( isPalindrome (palindrome)){
         System.out.println(" Number  " + palindrome + " is a palindrome  ");
      }
       else {
         System.out.println( " Number " + palindrome + " is a palindrome ");
       }
  }
  public static boolean isPalindrome(int number){
    int palindrome = number ;
    int reverse = 0;
     while ( palindrome != 0){
      int remainder = palindrome % 10;
      reverse  =  reverse * 10 + remainder;
      palindrome = palindrome /10;

     }
      if ( number == reverse ){
         return true ;

      }
      return  false;
}
}