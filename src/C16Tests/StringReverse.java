package C16Tests;

public class StringReverse {
    private String name = "";
    private String reversedStr = "";
    public StringReverse(String name) {
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getReversedStr() {
        for (int i = 0; i < name.length(); i++){
            reversedStr = name.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
}
