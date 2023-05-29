package Trial;

public class RatingOfMeal {
    public static void main(String[] args) {
        int[] rating = {1,5,4,2,5,2,3,2,3,2,1,3,4,5,2,4,2,2,3,4,4};
        int[] frequency = new int[6];
        for (int i = 0; i < rating.length; i++){
            try {
                ++frequency[rating[i]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("  respnses %d=%d%n",i, rating[i]);
            }
        }
        System.out.printf("%s%7s%n", "Rating","Frequency");
        for (int j = 1; j < frequency.length; j++){
            System.out.printf("%d%5d%n", j, frequency[j]);
        }
    }
}
