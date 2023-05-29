package C16Tests;
import java.util.Scanner;
public class StringReverseRun {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Alaye input your name!!!");
//        String name = input.nextLine();
//
//        StringReverse str = new StringReverse(name);
//        str.setName(name);
//        System.out.println(str.getReversedStr());

        String name = "Emeadi Victor";
        String[] newName = name.split(" ");
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < newName.length; i++){
            if (i == 1) str1 = newName[i];
            if (i == 0) str2 = newName[i];

        }
        System.out.println(str1+" "+str2);
    }
}
