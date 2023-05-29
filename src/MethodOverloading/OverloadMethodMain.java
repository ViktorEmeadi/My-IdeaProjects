package MethodOverloading;

public class OverloadMethodMain {
    public static void main(String[] args) {
        OverloadMethod overloadMethod = new OverloadMethod();
        System.out.println(overloadMethod.add(10,20, 30));
        System.out.println(overloadMethod.add(30,40));
        System.out.println(overloadMethod.add(5,10.9));
    }
}
