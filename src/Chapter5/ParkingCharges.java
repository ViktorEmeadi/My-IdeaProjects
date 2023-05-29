package Chapter5;

public class ParkingCharges {
    private static double charges = 2.00;
    private static double extraCharges = 0.50;
    private static double maxCharge = 10.00;
    private static double garageCost = 0;
    private static int hrs = 3;


    public void setTime(int hrs){
        ParkingCharges.hrs = hrs;
    }
    public static double amtPerHour() {
         if(hrs > 0 && hrs < 4) garageCost = 2;
        else if(hrs > 3 && hrs <= 19) garageCost = 2.00 + 0.50 *(hrs - 3);
        else if (hrs > 19) garageCost = 10.00;
        else if (hrs < 1) garageCost = 0.00;
        return garageCost;
    }

}
