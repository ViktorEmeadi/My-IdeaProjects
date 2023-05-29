package Snacks4;

public class Parlindromes {
    private String str;
    String mutatedStr = "";
    public void setStr(String str) {
        this.str = str;
        for (int index = 0; index < str.length(); index++) {
            mutatedStr = str.charAt(index) + mutatedStr;
        }
    }

    public boolean checkParlindrome() {
        return mutatedStr.toLowerCase().equals(str.toLowerCase());
    }
}
