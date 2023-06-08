package ChapterEleven;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Messenger.buyEwa(500, true, true));
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
