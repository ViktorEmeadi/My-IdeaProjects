package StringMethods;

import jdk.internal.icu.text.UCharacterIterator;

import java.util.ArrayList;
import java.util.Locale;

public class StrMethods {
    public static void main(String[] args) {
//        charAt()
//        String myStr = "Hello world";
//        char result = myStr.charAt(6);
//        System.out.printf("The character '%c' is at the index position of %d in the sentence %s%n",result, 6, myStr);


        //codePointAt()
//        String phoneNum = "08128670506";
//        int result = phoneNum.codePointAt(0);
//        System.out.println(result);

//        String str =  "hello";
//        String[] myStr = str.split("");
//        for(int i = 0; i < myStr.length; i++){
//            System.out.println(myStr[i]);

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Lamborghini");
//        cars.add("Volvo");
//        cars.add("G-Wagon");
//        cars.add(0, "Rolls Royce");
//
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

//        compareTo()
//        String myName = "Victor";
//        String yours = "John";
//        System.out.println(myName.compareTo(yours));



//        concat();
//        String myName = "Victor";
//        String lastName = "Emeadi";
//        System.out.println(myName.concat(lastName));


        //contains
//        String name = "Victor";
//        System.out.println(name.contains("e"));

//        contentEquals
//        String desiderata  = "Go placidly amids the noise and haste...";
//        String equipment = "Figure it out yourself my lad...";
//        System.out.println(desiderata.contentEquals(equipment));


//        String name = "victor";
//        String jangled = "torvic";
//        System.out.println(name.contentEquals(jangled));


//        copyValueOf()
//            char[] charArr = {'m','a','m','a',' ','m','e'};
//            String mom = "";
//            mom = mom.copyValueOf(charArr, 0,4);
//        System.out.println(mom);


        //getChar()
//        String name = "Victor";
//        char myChars[] = new char[7];
//        myChars[0] = 'I';
//        myChars[1] = '\'';
//        myChars[2] = 'm';
//        name.getChars(3, 6,myChars,3);
//        System.out.println(myChars);
//        for (int i = 0; i < myChars.length; i++){
//            System.out.println(myChars[i]);
//        }

//        String liquid = "Orange juice";
//        char[] juiceArr = new char[3];
//        liquid.getChars(0,5,juiceArr, 0);
//        for (int i = 0; i < juiceArr.length; i++){
//            System.out.println(juiceArr[i]);
//        }


//       String str = "Hello javatpoint how r u";
//       char[] chArr = new char[10];
//        str.getChars(6, 16,chArr, 0);
//        System.out.println(chArr);

        //indexOf()
//        String name = "Victor";
//        System.out.println(name.indexOf('t'));

//        String fruit = "Banana";
//        System.out.println(fruit.indexOf('a',2));

        //isEmpty()
//        String name = "";
//        String myName = "Victor";
//        System.out.println(name.isEmpty());
//        System.out.println(myName.isEmpty());

//        join()
//        String name = "Victor";
//        String joinString1=String.join("-",name,"hello");
//        System.out.println(joinString1);

        //join()
//        String str1 = "Hello";
//        St/ring str2 = "World";
//        String joinedStr = String.join(".",str1,str2);
//        System.out.println(joinedStr);


        //lastIndexOf()
//        String fruit = "Banana";
//        int ind = fruit.lastIndexOf('n');
//        System.out.println(ind);

       //length
//        String name = "Viktor";
//        System.out.println(name.length());

        //replace()
//        String fruit = "bannannaA";
//        String mutatedFruit1 = fruit.replace('b','.');
//        String mutatedFruit2 = mutatedFruit1.replace('a',',');
//        System.out.println(mutatedFruit2);

//        replaceAll()
//        String fruit = "coconut";
//        System.out.println(fruit.replaceAll("c","b"));

        //split();
//        String greeting = "geekss@geeksforgeeks";
//        String[] arr = greeting.split("");
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        String greeting = "geeks@geeksforgeeks bad bop";
//        String[] arr = greeting.split(" ",3);
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        String str = "Hello bad bop";
//        String[] arr = str.split("");
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        startsWith()
//        String name = "Viktor";
//        System.out.println(name.startsWith("Vik"));

//        substring()
//        String greet = "Hello world";
//        System.out.println(greet.substring(0,5));

//        toCharArray
//        String name = "Victor";
//        char[] charArr = name.toCharArray();
//        for (int i = 0; i < charArr.length; i++){
//            System.out.print(charArr[i]+",");
//        }

//        toLowerCase() toUpperCase()
//        String name = "Victor";
//        String surName = "Emeadi";
//        System.out.print(name.toLowerCase()+" ");
//        System.out.println(surName.toUpperCase());
        System.out.println(StrMethods.rps("scissors","rock"));

    }
    public static String rps(String p1, String p2){
        if(p1 == "scissors"&& p2 == "paper")return "Player 1 won!";
        else if (p1 == "scissors" && p2 == "rock") return "Player 2 won!";
        else if(p1 == "paper" && p2 == "paper") return "Draw!";
        else return null;
    }
}