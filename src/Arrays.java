public class Arrays {
    public static void main(String[] args) {
//        int[] myArr =  {5,4,8,2,1};
//        System.out.printf("%3s%8s%n","Index","Value");
//        for (int i = 0; i < myArr.length; i++){
//            System.out.printf("%5d%8d%n", i, myArr[i]);
//        }

        final int ARRAY_LENGTH = 11;
        int[] arr = new int[ARRAY_LENGTH];

        System.out.printf("%s%8s%n","Index", "Value");
        for (int i = 0; i < arr.length; i++){
            arr[i] =  3 + 3 * i;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.printf("%5d%8d%n%n",i, arr[i]);
        }
        int[] array = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        System.out.printf("%5d",total);
    }
}
