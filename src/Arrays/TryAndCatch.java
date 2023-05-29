package Arrays;

public class TryAndCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {2, 4, 8, 10};
            System.out.println(arr[9]);
        }catch (ArrayIndexOutOfBoundsException ex){
//            ex.getMessage();
            System.out.println(ex);
        }
    }
}
