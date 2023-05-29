package Snacks5;

public class BillingInfo {
    private String[] phoneNumber;
    private String[] name;
    private String[] address;
    private CreditCardInfo creditCardInfo;
    public BillingInfo(String[] phoneNumber, String[] name, String[] address, CreditCardInfo creditCardInfo){
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.creditCardInfo = creditCardInfo;
    }

}
