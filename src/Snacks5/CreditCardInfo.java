package Snacks5;

public class CreditCardInfo {
    private String cardCvv;
    private String cardExpiration;
    private int cardNum;
    private String nameOnCard;
    private CardType cardType;
    public CreditCardInfo(String cardCvv, String cardExpiration, int cardNum, String nameOnCard, CardType cardType){
        this.cardCvv = cardCvv;
        this.cardExpiration = cardExpiration;
        this.cardNum = cardNum;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }
}
