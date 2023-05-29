package classwork;

public class DivisibleBy3 {
public int sumOddInts(){
    int sum = 0;
    for (int i = 1; i <= 30; i++){
        if (i % 3 == 0) sum += i;
    }
    return sum;
}
}
