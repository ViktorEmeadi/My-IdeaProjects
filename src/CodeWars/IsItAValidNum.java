package CodeWars;

public class IsItAValidNum {
    public static boolean checkStr(String str){
        boolean check = false;
        for (int i = -100; i < 100; i++) {
            if (Integer.parseInt(str.trim()) == i) check = true;
//            System.out.println(i);
        }
        return check;
        }
    public static void main(String[] args) {
        System.out.println(checkStr(" 3"));
        String tg = "   hel lo ";
        System.out.println(tg.trim());
    }
}
