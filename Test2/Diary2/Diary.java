package Diary2;

public class Diary {
    private boolean isLocked = true;
    private String password;
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordIsCorrect = password.equals(this.password);
        if (passwordIsCorrect) unlockDiary();
    }
    public boolean unlockDiary(){
        isLocked = false;
        return isLocked;
    }
}
