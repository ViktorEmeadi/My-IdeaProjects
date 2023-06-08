package ChapterEleven;

public class Ewa {
    private int numberOfSpoons;
    private boolean withOmiEwa;
    public Ewa(int amount, boolean withOmiEwa, boolean moneyIsFake){
        this.withOmiEwa = withOmiEwa;
        int pricePerSpoon = 50;
        numberOfSpoons = amount/pricePerSpoon;
    }

    @Override
    public  String toString(){
        String response = String.format("""
                %s_spoon(s) of hot ewa %s omi ewa
                """, numberOfSpoons, withOmiEwa?"With ":"Without ");
        return response;
    }
}
