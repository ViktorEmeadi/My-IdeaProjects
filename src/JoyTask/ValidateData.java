package JoyTask;

import java.util.Arrays;

public class ValidateData {

    private static String[][] names;

    public static String[][] getNames(String[][] names) {
        ValidateData.names = names;

        String[][] result = new String[2][2];
        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names[i].length; j++) {
                result[i][j] = names[i][j];
            }
        }
        return result;
    }
}
