package classwork;

public class TaxCalculator {
    private String name;
    private int earning;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEarning(int earning){
        this.earning = earning;
    }

    public String getTaxRate() {
        int taxRate = 0;
        if (earning > 0 && earning < 30000) {
            taxRate = earning * 20/100;
        }
        else {
            taxRate = earning * 15/100;
        }
        return name+": "+taxRate;
    }
}
