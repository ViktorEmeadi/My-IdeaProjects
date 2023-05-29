package C16Tests;


import static jdk.internal.icu.text.UTF16.charAt;

public class Encryption {
    String[] myArr;

    public String encryptData(String data) {
        int firstEncryptedChar = 0;
        int secEncryptedChar = 0;
        int thirdEncryptedChar = 0;
        int fourthEncryptedChar = 0;

        if (data.length() != 4) return "Alaye enter a four digit number!!!";
        for (int count = 0; count < data.length(); count++) {
            char character = data.charAt(count);
            int charInt = character - '0';

            int encryptedInts = (charInt + 7) % 10;
            if (count == 0) firstEncryptedChar = encryptedInts;
            if (count == 1) secEncryptedChar = encryptedInts;
            if (count == 2) thirdEncryptedChar = encryptedInts;
            if (count == 3) fourthEncryptedChar = encryptedInts;
        }
        String result = thirdEncryptedChar + "" + fourthEncryptedChar + "" + firstEncryptedChar + "" + secEncryptedChar;
        return result;

    }


    public String decryptData(String encryption){
        int firstEncryptedChar = 0;
        int secEncryptedChar = 0;
        int thirdEncryptedChar = 0;
        int fourthEncryptedChar = 0;

        if (encryption.length() != 4) return "Alaye enter a four digit number!!!";
        for (int count = 0; count < encryption.length(); count++) {
            char characterAt = encryption.charAt(count);
            int charInt = characterAt - '0';
            int decryptedInt = ((charInt + 10)- 7)%10;

            if (count == 0) firstEncryptedChar = decryptedInt;
            if (count == 1) secEncryptedChar = decryptedInt;
            if (count == 2) thirdEncryptedChar = decryptedInt;
            if (count == 3) fourthEncryptedChar = decryptedInt;
        }
        String result = thirdEncryptedChar+""+fourthEncryptedChar+""+firstEncryptedChar +""+secEncryptedChar;
        System.out.println(result);
        return result;
    }

    private void prompt(){
        System.out.println("Enter four digit intger: ");
    }
}