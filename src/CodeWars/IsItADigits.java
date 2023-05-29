package CodeWars;

import java.util.Scanner;

public class IsItADigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myNum = input.nextInt();

        if (myNum == 1 || myNum == 2 || myNum == 3 || myNum == 4 || myNum == 5 || myNum == 6 || myNum == 7 || myNum == 8 || myNum == 9 || myNum == 0){
            System.out.println(true);
        }else System.out.println(false);
//        String numStr = Integer.toString(myNum);
//        if (numStr.equals(myNum)){
//            System.out.println(false);
//        }
//        else if (Integer.parseInt(numStr) == myNum) System.out.println(true);
    }
}
