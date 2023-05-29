package Trial;

public class TryingArr {
    private static String[] names = {};
    private static int[] numbers = {};
    private static String result = "";

    public static void setNames(String[] names, int[] numbers){
        TryingArr.names = names;
        TryingArr.numbers = numbers;
        String strNames = "[";
        for(int i = 0; i < names.length; i++){
            numbers[i] = i + 1;
            if (i != names.length - 1) strNames += "Name "+numbers[i] +": "+names[i] + ", ";
            else strNames += "Name "+numbers[i] +": "+names[i];
        }
        result = strNames + "]";
    }
    public static String getName(){
        return result;
    }

    public static void main(String[] args) {
        TryingArr.setNames(new String[] {"Nile","Niger", "Senegal", "Congo"}, new int[4]);
        System.out.println(TryingArr.getName());
    }
}
