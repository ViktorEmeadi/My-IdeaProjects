package Trial;

public class Scope {
    private static int x = 5;
    public static void useLocalVariable(){
        int x = 10;
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        x++;
         System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }
    public static void useField(){
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 5;
         System.out.printf("field x before exiting method useField is %d%n", x);
    }
    public static void main(String[] args){
        Scope scope = new Scope();
        int x = 1;
        System.out.printf("local variable x in main method %d%n", x);
        useLocalVariable();
        useField();
    }
}
