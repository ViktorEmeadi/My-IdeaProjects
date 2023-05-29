package Trial;

import java.sql.SQLOutput;

public class Shapes {
    public static void main(String[] args) {
//       int a = 0;
//        while (a < 5){
//            int b = 0;
//            while (b<= a){
//                System.out.print("*");
//                b++;
//            }
//            System.out.println(" ");
//            a++;
//        }


        for (int c = 1; c <= 5; c++){
            for (int d = 1; d <= c; d++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.printf("%n");


//
          for (int e = 0; e <= 4; e++){
              for (int f = 0; f <= 4; f++) {
                  if (e == 0 || f == 0 || e == 4 || f == 4) System.out.print("* ");
                  else System.out.printf(" ");
                  System.out.print("  ");
              }
              System.out.println("");
          }
          System.out.printf("%n");


          for (int g = 0; g < 4; g++){
              for (int h = 4; h > g; h--){
                  System.out.printf("* ");
              }
              System.out.println("");
          }

//        for (int i = 1; i <= 5; i++){
//            for (int j =0; j < 5 - i; j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k < i * 2; k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



//        for (int l = 1; l <= 8; l++){
//            for (int m =0; m < 8 - l; m++) {
//                System.out.print(" ");
//            }
//            for (int n = 2; n < l + 2; n++){
//                System.out.print(" ");
//                System.out.print(".");
//            }
//            System.out.println("");
//        }


//        for (int j = 0; j < 6; j++) {
//            for (int i = 0; i < 6; i++) {
//
//                    if (i == 0 || j == 0 || j == 5 || i == 4) System.out.print("* ");
//                    else  System.out.print("   ");
//
//            }
//            System.out.println("");
//        }

    }
    }