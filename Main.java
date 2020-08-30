package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Appointment someappt ;
        someappt = new Appointment();
        someappt.day = 29;
        System.out.println(someappt.day);
        someappt.writeOutput();
    }

}

class Appointment {
    private int startTime, endTime,  year;
    public int day;
    private String month;
    // constructor to initialise
    public Appointment(int startTime, int endTime, int day, int month, int year){
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
        this.month = monthString(month);
        this.year = year;
    }

    // default constructor:
    public Appointment(){
        this.startTime = 1000;
        this.endTime = 1800;
        this.day = 29;
        this.month = monthString(10);
        this.year = 2018;
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter month, day and year ");
        System.out.println("Do not use a comma");

        month = keyboard.nextLine();

        day = keyboard.nextInt();

        year = keyboard.nextInt();

        System.out.println(day + month + year);

    }

    public int getDay(){
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getStartTime() {
        return startTime;
    }


    public int getMonth(){
    if(month.equalsIgnoreCase("January"))
        return 1;
    else if ( month.equalsIgnoreCase("February"))
        return 2;
    else if ( month.equalsIgnoreCase("March"))
        return 3;
    else if ( month.equalsIgnoreCase("April"))
        return 4;
    else if ( month.equalsIgnoreCase("May"))
        return 5;
    else if ( month.equalsIgnoreCase("Jun"))
        return 6;
    else if ( month.equalsIgnoreCase("July"))
        return 7;
    else if ( month.equalsIgnoreCase("August"))
        return 8;
    else if ( month.equalsIgnoreCase("September"))
        return 9;
    else if ( month.equalsIgnoreCase("October"))
        return 10;
    else if ( month.equalsIgnoreCase("November"))
        return 11;
    else if ( month.equalsIgnoreCase("December"))
        return 12;
    else
    {
        System.out.println("Error");
        System.exit(0);
        return 0;
    }
    }


    public int getEndTime() {
        return endTime;
    }

    //convert integer representation of month to string representation
    private String monthString(int monthNumber){
        switch (monthNumber){
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";


            case 12:
                return "December";

            default:
                System.out.println("Error");
                return "error ";
        }
    }

    public void setDate(String newMonth, int newDay, int newYear){
        day = newDay;
        month = newMonth;
        year = newYear;

    }

    public void writeOutput(){
        System.out.println("Your appointment: ");
        System.out.println(month + " " + day + " " + year );
        System.out.println("Starting at "+ startTime + "\n" + "Ending at " +endTime);
    }

}