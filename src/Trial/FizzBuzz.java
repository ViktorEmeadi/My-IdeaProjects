package Trial;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int nums = 1; nums <= 100; nums++) {
            if (nums % 3 == 0 && nums % 5 == 0) System.out.println("FizzBuzz");
            else if (nums % 3 == 0) System.out.println("Fizz");
            else if (nums % 5 == 0)System.out.println("Buzz");
            else System.out.println(nums);
        }
    }
}