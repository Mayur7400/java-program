// /*import java.util.Scanner;
 
// //Average of 3 number 
// public class solution {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int A = sc.nextInt();
//     int B = sc.nextInt();
//     int C = sc.nextInt();
//     int average = ( A + B + C ) /3;
//     System.out.println("average  is : " + average);
    
    
// }
 //}*/

// import java.util.Scanner;

// public class solution {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//          int A = sc.nextInt();
//          int B = sc.nextInt();
//          int C = sc.nextInt();
//          int average = ( A + B + C) /3;
//          System.out.println("average  is : " + average);
//      }
// }    

// import java.util.Scanner;

// public class solution {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//          int side = sc.nextInt();
//          int area = side * side;
//         System.out.println("area of the square is : " + area );
//     }
//  }

// import java.util.Scanner;

// public class solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rad = sc.nextInt();
//         float area = 3.14f * ( rad * rad);
//         System.out.println("area of the circle is : " + area);
//     }
// }

// import java.util.Scanner;

// public class solution {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int length = sc.nextInt();
//         int width = sc.nextInt();
//         int area = ( length * width);
//         System.out.println("area of the rectangle is : " + area);
//      }
// }

//   import java.util.Scanner;

// public class solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         double area = (5.19/2) * a * a;
//         System.out.println(" area is the hexogaon  is : " + area);
// }
// }

// public class solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int b = sc.nextInt();
//         int h = sc.nextInt();
//         double area = (0.5) * (b * h);
//         System.out.println(" area if the triangle is : " + area );
// }
// }
// public class solution {

//     public static void main(String[] args) {
        
//         double area = (1.0/2.0);
//         System.out.println(" area if the triangle is : " + area );
// }
// }

// import java.util.Scanner;

// // Bill of item 
// public class solution {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          float pencile = sc.nextInt();
//          float pen = sc.nextInt();
//          float ereser = sc.nextInt();
        
//          float Total = pencile + pen + ereser ;
//          System.out.println( "  Total bill is :  " + Total);
          

          
//           // Add on - with  18% tax 
//           float newTotal  = Total +  ( 0.18f * Total );


//           System.out.println(" Bill with 18 % tax : " + newTotal);
//  }
//  }

import java.util.Scanner;

public class solution {
 
    //  total bill is add to coponent 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float block  = sc.nextInt() ;
        float piston = sc.nextInt();
        float rings = sc.nextInt();
        float bearing = sc.nextInt();
        
        float  Total = block + piston + rings + bearing;
        System.out.println(" Total bill is : "  + Total );

         // Add on - with 18% tax 
           float newTotal =  Total +  ( 0.18f  * Total);
        
           System.out.println("bill with 18 % tax :  " + newTotal);

    }
 }