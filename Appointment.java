import java.util.Scanner;

public class Appointment {
    private int startTime, endTime, day, year;
    private String month;
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter month, day and year ");
        System.out.println("Do not use a comma");

        month  = keyboard.nextLine();
        keyboard.nextLine();

        day = keyboard.nextInt();

        year = keyboard.nextInt();

        System.out.println(day + month + year );
    }

}
