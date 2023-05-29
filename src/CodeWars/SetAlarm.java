package CodeWars;

public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation){
        boolean result = false;
        if (employed && vacation) result = false;
        else if (employed == false && vacation == true) result = false;
        else if (!employed) result = false;
        else result = true;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(setAlarm(true, false));
    }
}