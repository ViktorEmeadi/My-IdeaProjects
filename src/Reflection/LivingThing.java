package Reflection;

import java.util.ArrayList;
import java.util.List;

public class LivingThing extends Things{
    public LivingThing(){
        System.out.println("I am trying to create a living thing");
    }
    public void move(){
        System.out.println("I am moving there");
    }

//    public static void main(String[] args) {
//        List<Object> tryy = new ArrayList<>();
//        tryy.add(1);
//        tryy.add("Hello");
//        System.out.println(tryy);
//    }

}
