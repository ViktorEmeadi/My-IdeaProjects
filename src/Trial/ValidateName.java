package Trial;

import java.util.Scanner;

public class ValidateName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.nextLine();
        if(name instanceof String){
            System.out.printf("Hello %s", name);
        }else {

        }
    }
}
