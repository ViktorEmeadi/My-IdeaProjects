package Snacks5;

public class Customers extends Users{
    private BillingInfo[] billingInfo;
    public Customers(int age, String email, String homeAddress, String name, String password, String phoneNumber){
        super(age, email, homeAddress, name, password, phoneNumber);
    }
}
