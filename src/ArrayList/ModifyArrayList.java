package ArrayList;

import java.util.ArrayList;

public class ModifyArrayList {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Peter");
        names.add("Pan");
        names.add("Wendy");
        names.add(0, "Sno white");
        for (String name : names){
            System.out.println(name);
        }
        names.remove(0);
        names.remove("Wendy");
        System.out.println();
        for (String name : names){
            System.out.println(name);
        }
    }
}
