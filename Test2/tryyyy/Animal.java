package tryyyy;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Dog> dogs = new ArrayList<>();
//    Dog     dog = new Dog();
//    Dog     rot = new Dog();
//    Dog     german = new Dog();

//    public void setDog(){
//        dogs.noOfLegs(number);
//    }

//
//    public void addDog(){
//        dogs.add(dog);
//        dogs.add(rot);
//        dogs.add(german);
//
//
//    }
//    public void german(int num){
//        german.noOfLegs(num);
//
//    }
//    public Dog getNumOfLeg(){
//        return dogs.get(german.noOfLegs);
//    }
    Dog rot = new Dog();
    Dog germanShepherd = new Dog();
    Dog bull = new Dog();

    public void addDog(){
        dogs.add(germanShepherd);
        dogs.add(rot);
        dogs.add(bull);
    }
    public void setGermanShepherd(String bark){
        germanShepherd.setBark(bark);
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setGermanShepherd("Awoof woof");
//        System.out.println(animal.getGermanShepherdBark());
    }
}
