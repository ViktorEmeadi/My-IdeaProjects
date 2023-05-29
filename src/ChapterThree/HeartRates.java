package ChapterThree;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.undo.AbstractUndoableEdit;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        String yearOfBirth = "";
        for (int i = dateOfBirth.length()-4; i < dateOfBirth.length(); i++) {
            char characters = dateOfBirth.charAt(i);
           yearOfBirth = yearOfBirth + characters;
        }
        int year = Integer.parseInt(yearOfBirth);
//        return 2023-year;
          LocalDate currentDate = LocalDate.now();
          return currentDate.getYear() - year;
    }

    public int getMaxHeartRate(){
        return 220 - getAge();
    }

    public String getTargetHeartRange(){
        String targetHeartRate = "";
        double targetHeartRateLower = ((double)50/100) * getMaxHeartRate();
        double targetHeartRateHigher = ((double)85/100) * getMaxHeartRate();
        return targetHeartRate = targetHeartRateLower +"-"+targetHeartRateHigher;
    }


//    public int getAge(){
//        String yearOfBirth = "";
//        for (int i = dateOfBirth.length()-4; i < dateOfBirth.length(); i++)
//            yearOfBirth = getYear(yearOfBirth,i);
//
//            int year = Integer.parseInt(yearOfBirth);
//            return 2023-year;
//    }
//
//    public String getYear(String yearOfBirth, int i){
//        yearOfBirth += dateOfBirth.charAt(i);
//        return yearOfBirth;
//    }
public static void main(String[] args) {
    String name = "Victor";
    String newStr = name.substring(1);
    System.out.println(newStr);
    System.out.println(newStr.substring(newStr.length() -3));
}
}


