package CardValidation;

import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you credit card number: ");
        String cardNumber = input.nextLine();
        String[] cardNum = cardNumber.split("");

        if(cardNum.length < 13 || cardNum.length > 16){
            throw new IndexOutOfBoundsException("Invalid card number");
        }
        String cardType = "";

        if (cardNum[0].startsWith("4")) cardType = "Visa";
        else if (cardNum[0].startsWith("5")) cardType = "MasterCard";
        else if (cardNum[0].startsWith("37")) cardType = "American Express";
        else if (cardNum[0].startsWith("6")) cardType = "Discover";
        else cardType = "Incorrect credit card number";

        int sum = 0;
        boolean doubleDigits = false;

        for (int index = cardNum.length - 2; index >= 0; index--) {
            int digit = Integer.parseInt(cardNum[index]) * 2;
            if (digit > 9){
                digit %= 10 + digit/10;
                cardNum[index] = String.valueOf(digit);
            }
            sum += digit;
            doubleDigits = !doubleDigits;
        }
        String cardValidity = "";
        if (sum % 10 == 0) cardValidity = "Valid";
        else cardValidity = "Invalid";

        System.out.printf("**Credit Card Type: %s%n", cardType);
        System.out.printf("**Credit Card Number: %s%n", cardNumber);
        System.out.printf("**Credit Card Digit Length: %d%n", cardNum.length);
        System.out.printf("**Credit Card Validity Status: %s%n", cardValidity);


    }
}
