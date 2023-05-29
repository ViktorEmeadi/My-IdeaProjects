package classwork;
import java.util.Scanner;

public class RunGeoPoliticalZones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GeoPoliticalZones place = GeoPoliticalZones.SOUTH_EAST;
        System.out.print("Enter your state: ");
        String state = input.nextLine();

        place.setPlace(state.toLowerCase());
        System.out.println(place.getGPZ());

    }
}
