
//     public class ishum {
//         // inverted rotated half pyramid 
//     public static void inverted_rotated_half_pyramaid(int n ) {
//      for ( int i =1 ; i <=n; i++){
//        for ( int j=1; j<= n-i ; j++){
//          System.out.print(" ");
//        }
//         for (int j =1 ; j<=i; j++){
//          System.out.print("*");
//         }
//         System.out.println();
//      }
    
//     }
//     public static void main(String[] args) {
//      inverted_rotated_half_pyramaid(5);
//     }
//   }


// public class ishum{

//     public static void inverted__half_pyramaid_withNumbers(int n ) {
        
//         for ( int i=1; i<=n; i++ ){
//             for( int j =1 ; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         inverted__half_pyramaid_withNumbers(10);
//     }
// }
    

// public class ishum{

//     public static void inverted__half_pyramaid_withNumbers(int n){
//         for ( int i =1; i<=n; i++){
//             for (int j =1; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main( String args []){
//        inverted__half_pyramaid_withNumbers(15);
//     }
// }


//  public class ishum {
 
//      public static void  inverted__half_pyramaid_withNumbers(int n ) {
         

//          for ( int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print( j+" ");;
//             }
//             System.out.println();
//          }
//      }
//      public static void main(String[] args) {
//          inverted__half_pyramaid_withNumbers(5);
//      }
//  }


//   public class ishum{

//   //hollow reactangle pattern

//        public static void hollow_reactangle( int totRows, int totCols){
//          for (int i =1; i<=totRows; i++ ){
//              for( int j =1; j<= totCols; j++){
//                  if(i== 1 ||i == totRows|| j ==1 || j ==totCols ){
//                    System.out.print("*");
//                 }else{
//                      System.out.print(" ");
//                  }
//             }
//              System.out.println();
//          }
//        }
//        public static void main(String[] args) {
//            hollow_reactangle(7, 5);
//        }
//   }



//  public class ishum{
//     public static void inverted_rotated_half_pyramid(int n ) {
         
//          for (int i=1; i<=n; i++){
//             for (int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//            for(int j=1; j<=i; j++){
//             System.out.print("*");
//            }
//            System.out.println();
//          }
//     }
//     public static void main(String[] args) {
//         inverted_rotated_half_pyramid(15);
//     }
//  }

//  public class ishum {
 
//      public static void inverted_rotated_half_pyramid( int n ) {
        

//          for (int i=1; i<= n ; i++ )   {
//             for (int j=1; j <=n ; j++ ){
//                  System.out.print( " ");
//             }
//              for (int j =1 ; j <= n-i; j++){
//                 System.out.print("*" );
//              }
//               System.out.println();
//          }  
//         }
//          public static void main(String[] args) {
//             inverted_rotated_half_pyramid(15);
//          }
//  }

//  public class ishum {
 
//      public static void inverted_rotated_half_pyramid(int n ) {
        
//          for(int i=1; i<=n; i ++ ){
//              for(int j =1; j<=n-i; j++ ){
//                  System.out.print(" ");
//              }
//               for (int j=1 ; j<=i; j++){
// 


 
//  public class ishum{
//      public static void butterfly( int n ){

//          for ( int i=1; i<=n; i++){
//              for ( int j=1; j<=i; j++){
//                  System.out.print( "*");
//              }
//               for ( int j=1; j<=2*( n-i); j++){
//                  System.out.print( " ");
//               }
//               for ( int j=1; j<=i; j++){
//                 System.out.print( "*");
//             }
//              System.out.println();
//          }
//      }
//        for (int  i=1; i>=n; i--){
//         for ( int j=1; j<=i; j++){
//             System.out.print( "*");
//         }
//          for ( int j=1; j<=2*( n-i); j++){
//             System.out.print( " ");
//          }
//          for ( int j=1; j<=i; j++){
//            System.out.print( "*");
//        }
//         System.out.println();
//     }
// }
// public static void main (String args[]){
//     butterfly(6);
// }
 
//import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//             Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             int arr[]=new int[n];
//             for(int i=0;i< n;i++)
//                   arr[i]=sc.nextInt();
//             int count=0;
//             for(int i=0;i< n;i++)
//                 if(arr[i]!=0)
//                     arr[count++]=arr[i];
//              for(int i=count;i < n;i++)
//                  arr[i]=0;
//              for(int i=0;i< n;i++)
//                     System.out.print(arr[i]+" ");
//     }
// }



//  public class ishum{
//     public static void floyd_triangle (int n ){
         
//          int counter= 1;

//          for ( int i =1; i<=n; i++){
//             for ( int j=1; j<=i; j ++){
//                 System.out.print(counter+ " ");
//                  counter++;
//             }
//             System.out.println();
//          }
//     }
//      public static void main(String[] args) {
//          floyd_triangle(5);
         
//      }
//  }


//  public class ishum {
//      public static void floyd_triangle( int n ){
//   int counter = 1; 
//  for ( int i=1; i<=n; i++){
//      for ( int j=1; j<=i; j++){
//         System.out.print(counter + " ");
//         counter ++;
//      }
//      System.out.println();
//  }
// }
//     public static void main(String[] args) {
//          floyd_triangle(5);
         
        
//     }
//  }
 

//  public  class ishum {

//      public static void butterfly ( int n ){
         
//          for ( int i =1; i<=n; i++){
//              for ( int j=1; j<=i; j++){
//                  System.out.print("*");
//              }
//              for ( int j=1; j<=2*(n-i); j++){
//                  System.out.print(" ");
//              }
//               for ( int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//          }
        

//           for ( int i=n; i>=1; i--){
//             for ( int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for ( int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
//              for ( int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//         }
//           }
     
 
//      public static void main(String[] args) {
//          butterfly(5);
         
//      }
//  }

 public  class ishum {
 

     public static void butterfly ( int n ){
         
         for ( int i=1; i<=n; i++){
             for ( int j=1; j<=i; j++){
                System.out.print("*");
             }
              for ( int j=1; j<=2*(n-i); j++){
                 System.out.print(" ");
              }
               for( int j=1; j<=i; j++){
                System.out.print("*");
             }
             System.out.println();
         }
            for ( int i=n; i>=1; i--){
                for ( int j=1; j<=i; j++){
                    System.out.print("*");
                 }
                  for ( int j=1; j<=2*(n-i); j++){
                     System.out.print(" ");
                  }
                   for( int j=1; j<=i; j++){
                    System.out.print("*");
                 }
                 System.out.println();
             }
            }
     
     public static void main(String[] args) {
         butterfly(7);
     }
}

//  public class ishum {
 
//     public static void invereted_rotated_half_pyramid_withNumber(int n ){
         
//          for ( int i = 1; i<=n; i++){

//              for ( int j = 1; j<=n-i+1; j++){
//                  System.out.print( j + " ");
//              }
//               System.out.println( );
//          }
//     }



//     public static void main(String[] args) {
//     invereted_rotated_half_pyramid_withNumber(15);
//     }
//  }

//    public class ishum {
   
//      public static void inverted_rotated_half_pyramaid(int n ) {
        
//         // outer
//          for ( int i =1; i<=n; i++){
//               // space 
//              for ( int j =1; j<=n-1; j++){
//                 System.out.print(" " );
//              }
//              // stars 
//               for ( int j =1; j<=i; j++){
//                  System.out.print( "*");
//               }
//              System.out.println();
//          }
//      }
//      public static void main(String[] args) {
//         inverted_rotated_half_pyramaid(5);
//      }
//    }

//  public class ishum {
 
//      public static void inverted_rotated_half_pyramaid(int n ) {
//         // outer 
//          for ( int i=1; i<=n; i++){
//              // space
//             for ( int j=1 ; j<=n-i; j++){
//                  System.out.print(" ");
//             }
//              // stars 
//               for ( int j =1; j<=i ; j++ ){
//                  System.out.print("*");
//               }
//                System.out.println();
//          }
//      }
//      public static void main(String[] args) {
//         inverted_rotated_half_pyramaid(15);
//      }
//  }
//  public class ishum {
 

//      public static void inverted_rotated_half_pyramid(int n ) {
        
//         // outer loop 
//         for ( int i=1; i<=n; i++){
//              // space int loop
//               for ( int j =1; j<=n-i; j++){
//                  System.out.print(" ");
//               }
//                // stars in the loops 
//                 for ( int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                  System.out.println();
//         }
//      }
//      public static void main(String[] args) {
//          inverted_rotated_half_pyramid(20);
//      }
//  }

//   public class ishum {
 

//      public static void invereted_rotated_half_pyramid_withNumber(int n) {
         
//         // outer 
//          for  ( int i=1; i<=n; i++){

//              for ( int j =1; j<=n-i+1; j++){
//                 System.out.print("j");
//              }
//              System.out.println();
//          }
//      }
//     public static void main(String[] args) {
//         invereted_rotated_half_pyramid_withNumber(10);
//     }
//  }



//  public class ishum{
//      public static void floyds_triangle(int n ){
//           int counter =1;
//          // outer 
//           for ( int i=1; i<=n; i++){
//              // inner - how many time of countear to print
//              for ( int j=1; j<=i; j++){
//                 System.out.print(counter+" ");
//                 counter++;
//              }
//              System.out.println();
//           }
//      }
//      public static void main ( String args []){
//          floyds_triangle(5);
//      }
//  }