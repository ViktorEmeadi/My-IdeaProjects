package ObjectsAndArguments;

public class ArrTest {
    public static void main(String[] args) {
        MyArr arr = new MyArr(50);
        System.out.println(arr.getValue());
        ArrTest.modifyObj(arr);
        System.out.println(arr.getValue());

    }

    public static void modifyObj(MyArr myArray){
        myArray.setValue(40);
    }
}
