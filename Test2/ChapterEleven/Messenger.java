package ChapterEleven;

public class Messenger {
    public static Ewa buyEwa(int amount, boolean withOmiEwa, boolean moneyIsFake){
        return callVictoria(amount, withOmiEwa, moneyIsFake);
    }

    private static Ewa callVictoria(int amount, boolean withOmiEwa, boolean moneyIsFake) {
        return callMicheal(amount, withOmiEwa, moneyIsFake);
    }

    private static Ewa callMicheal(int amount, boolean withOmiEwa, boolean moneyIsFake) {
        try {
            return callTim(amount, withOmiEwa, moneyIsFake);
        }catch (IllegalArgumentException ex){
            System.out.println("Fake money");
            return callTim(amount, withOmiEwa, false);
        }
    }

    private static Ewa callTim(int amount, boolean withOmiEwa, boolean moneyIsFake) {
        return buyFromDavid(amount, withOmiEwa, moneyIsFake);
    }

    private static Ewa buyFromDavid(int amount, boolean withOmiEwa, boolean moneyIsFake) {
        if (moneyIsFake) throw new IllegalArgumentException("Fake money");
        return new Ewa(amount, withOmiEwa, moneyIsFake);
    }
}
