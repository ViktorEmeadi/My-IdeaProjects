package Arrays;

public class ElementsInArr {
    public static void main(String[] args) {
        int[] myArr = new int[6];
        for (int i = 0; i < myArr.length; i++){
            myArr[i] = i + 1;
//            System.out.println(myArr[i]);
        }
        for(int i : myArr){
            System.out.println(i);
        }
    }
}
