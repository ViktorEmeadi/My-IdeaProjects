package Arrays;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArraysAndFiles {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = {3,8,10};
        PrintWriter outputFile = new PrintWriter("Values.txt");

        for (int i : arr){
            outputFile.println(i);
        }
        outputFile.close();
    }
}
