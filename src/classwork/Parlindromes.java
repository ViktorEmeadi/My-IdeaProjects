package classwork;

public class Parlindromes {
//    private int num;
//    public void setNumber(int num) {
//        this.num = num;
//    }

    public boolean checkParlindrome(int num) {
        boolean isPalindrome = false;

        int firstDigit = num % 10;
        int input = num / 10;
        int secDigit = input%10;
        input = input /10;
        int thirdDigit = input % 10;
        input = input/10;
        int fourthDigit = input%10;
        input = input/10;
        int fifthDigit = input%10;

        if ((firstDigit*10000) +(secDigit * 1000)+(thirdDigit * 100)+(fourthDigit * 10)+fifthDigit == num) isPalindrome = true;
    else isPalindrome = false;
//        System.out.println((firstDigit * 10000) + (secDigit * 1000) + (thirdDigit * 100) + (fourthDigit * 10) + fifthDigit);
        return isPalindrome;
    }
}