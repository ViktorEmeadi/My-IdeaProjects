package Diary;

public class Dairy {
    private String password;
    public Dairy(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return true;
    }
}
