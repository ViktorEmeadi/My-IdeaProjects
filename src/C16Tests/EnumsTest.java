package C16Tests;

import static C16Tests.Enums.*;

class EnumsTest{

//    }
    public static void main(String[] args) {
//        System.out.println(direction.NORTH);
//        if (direction.NORTH == SOUTH) System.out.println("The enum is bad");
//        else System.out.println("The enum is gooood!");
//        System.out.println(Enums.NORTH);
//        System.out.println(SOUTH);
//        System.out.println(EAST);
//        System.out.println(WEST);

//        Enums test = new Enums();
//        setDirection(NORTH);
//        System.out.println(test.getDirection());

//        int rent = 40;
//        double threeDays = 0.2;
//        double sevenDays = 0.5;
//        int days = 2;

        for (Enums e: Enums.values()){
            System.out.println(e.getDistance());
        }
        for(Enums enums : Enums.values()){
            System.out.println(enums.getDirection());
        }
        for(Enums enums : Enums.values()){
            System.out.println(enums);
        }
    }
}
