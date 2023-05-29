package Trial;

public class RentalCost {
    public static void main(String[] args) {
        int costOfRent = 40;
        int sevenDaysDeduction = 50;
        int threeDaysDeduction = 20;
        int days = 7;
        int result = 0;
        if (days >= 7) result = (days *costOfRent) - sevenDaysDeduction;

        else if (days >= 3) result = (days * costOfRent) - threeDaysDeduction;

        else result = days * costOfRent;

        System.out.println(result);
    }
}
