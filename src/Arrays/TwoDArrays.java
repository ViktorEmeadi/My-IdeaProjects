package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args){
//        String[][][][] name = {{{{"Mr","Master","Sir"},{"Jones", "Smith","Willie"}}}, {{{"Mrs","Miss","Lady"}, {"Pebbles", "Jacky", "Isabella"}}},
//                {{{"Sergeant", "Corporal","General"}, {"Ludwig", "Gnomes","Austin"}}}};
//        System.out.printf("%s %s %s weds %s %s %s with %s %s %s as their chief guard",name[0][0][0], name[0][1][1],
//                name[0][1][2], name[1][0][2], name[1][1][2], name[1][1][0]);
//        System.out.printf("%s %s %s weds %s %s %s with %s %s %s as chief of guards!",name[0][0][0][0],
//                name[0][0][1][1], name[0][0][1][2], name[1][0][0][2], name[1][0][1][2], name[1][0][1][0], name[2][0][0][0], name[2][0][1][2],
//                name[2][0][1][0]);
//        for(int i = 0; i < name.length; i++){
//            for(int j = 0; j < name[i].length; j++){
//                for (int k = 0; k < name[i][j].length; k++){
//                    for (int l = 0; l < name[i][j][k].length; l++) {
//                        System.out.print(name[i][j][k][l] + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//        }

//        String[][] names = {{"Annah","Bella"},{"Tinkle","Bell"}};
//        System.out.println(names[0][1]);
//        for(String[] people : names){
//            for (String peeps : people){
//                System.out.println(peeps);
//            }
//        }


        //Average number in an array
//        int[] nums = {23, 30,17, 31};
//        int sum = 0;
//        for (int num : nums){
//            sum += num;
//        }
//        int length = nums.length;
//        double average = sum /length;
//        System.out.printf("Sum = %d%n",sum);
//        System.out.printf("Average = %.2f%n",average);


//        Finding the max and min value in an array
//        int[] myNums = {3,8,5,4};
//        int max = myNums[0];
//        int min = myNums[0];
//        for (int i : myNums){
//            if (i > max) max = i;
//            if (i < min) min = i;
//        }
//        System.out.printf("Max number is %d%n",max);
//        System.out.printf("Min number is %d%n", min);


//        Partially filled arrays
//        int[] myNums = new int[20];
//        int i = 0;
//        System.out.print("Enter a number or -1 to exit: ");
//        Scanner input = new Scanner(System.in);
//        int userInput = input.nextInt();
//        while (userInput != -1 && i < myNums.length){
//            myNums[i] = userInput;
//            System.out.print("Enter a number or -1 to exit: ");
//            userInput = input.nextInt();
//            i++;
//        }
//        for (int num : myNums){
//            System.out.println(num);
//        }







        String[][][] names = new String[4][3][2];
        names[0][0][0] = "Peter";
        names[0][0][1] = "Pan";

        names[0][1][0] = "Wendy";
        names[0][1][1] = "Goo";

        names[0][2][0] = "Scott";
        names[0][2][1] = "McCal";

        names[1][0][0] = "Styles";
//        names[1][]

        System.out.println(Arrays.deepToString(names));
    }
}