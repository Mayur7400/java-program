
// import java.util.Scanner;
// public  class Loops {


//    // keep entering number  till user enter a multipal of 10! 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        do {
//          System.out.print(" Enter Your Number :");
//          int n = sc.nextInt();

//          if( n % 20 == 0) {
//             break;
//          }
//          System.out.println(n);
//        }while(true);
        
//       }
// }

// import java.util.Scanner;
// public  class Loops {


//    // keep entering number  till user enter a multipal of 10! 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        do {
//          System.out.print(" Enter Your Number :");
//          int n = sc.nextInt();

//          if( n % 20 == 0) {
//             break;
//          }
//          System.out.println(n);
//        }while(true);
        
//       }
// }

// import java.util.Scanner;

// public  class Loops {


//    // keep entering number  till user enter a multipal of 10! 
//    public static void main(String[] args) {
       
//       for (int  i = 1; i <=5; i++){

//          if ( i == 3){
//          continue;
      
//       }System.out.println( i );
//       } 
//       }
// }

// import java.util.Scanner;

// public  class Loops {


//    // keep entering number  till user enter a multipal of 10! 
//    public static void main(String[] args) {
       
//       for (int  i = 1; i <=9; i++){

//          if ( i == 7){
//          continue;
      
//       }System.out.println( i );
//       } 
//       }
// }

// import java.util.Scanner;

// public  class Loops {


//    // keep entering number  till user enter a multipal of 10! 
//    public static void main(String[] args) {
       
//       Scanner sc = new Scanner(System.in);


//       do {
//          System.out.print(" Enter your number ");
//          int n = sc.nextInt();
            
//          if (  n % 10== 0){
//          continue;
         
//       }System.out.println(  " number was : " + n);
      

//       }while(true);
      
//    }

// }

// import java.util.Scanner;

// public class Loops {

//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();

//       if (n == 2) {
//          System.out.println(" n is prime number");

//       }
//       else {
//          boolean is 
//       }
//    }
// }

public  class
    

    public static void  primesInRange(int n ) {
        
      for ( int i=2; i<=n; i++){
        if( isPrime(i)){ // true
          System.out.print(i + " ");
        } 
      }
      System.out.println();
    }
    public static void main(String[] args) {
        primesInRange(20);
    
  }

}