package Trial;
import java.security.SecureRandom;
public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();

        int fre1 = 0;
        int fre2 = 0;
        int fre3 = 0;
        int fre4 = 0;
        int fre5 = 0;
        int fre6 = 0;

        for (int roll = 1; roll <= 100; roll++) {
            int face = 1 + randomNum.nextInt(6);
            if (face == 1) ++fre1;
            else if (face == 2) ++fre2;
            else if (face == 3) ++fre3;
            else if (face == 4) ++fre4;
            else if (face == 5) ++fre5;
            else if (face == 6) ++fre6;

            System.out.println("Face\tFrequency"); // output headers
            System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                    fre1, fre2, fre3, fre4,
                    fre5, fre6);
        }
    }

    }

