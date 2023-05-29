package Arrays;

public class SumValOfDigits {
    public static float add(float...decimals){
        float total = 0;
        for (float i : decimals){
            total += i;
        }
        return total;
    }

    public static int add(int...integers){
        int total = 0;
        for (int i : integers){
            total+= i;
        }
        return total;
    }

    public static void main(String[] args) {
        int add = add(2, 4, 6);
        float addFloat = add(2.4F, 3.7F, 3.8F);
        System.out.println(add);
        System.out.println(addFloat);
    }
}
