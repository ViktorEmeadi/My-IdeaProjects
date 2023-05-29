package JoyTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateDataTest {
    ValidateData validateData = new ValidateData();
    String[][] names = {{"Joy", "Peter"}, {"Parker", "Man"}};
    String[][] getName = validateData.getNames(names);
    @Test
    public void testFirstName(){
        assertEquals("[Joy, Peter]", Arrays.toString(getName[0]));
    }

    @Test
    public void testSecondName(){
        assertEquals("[Peter Pan]", Arrays.toString(getName[1]));
    }
}
