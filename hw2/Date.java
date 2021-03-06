package hw2;

/**
 * Created by kysft on 3/26/17.
 */

/* Date.java */

import java.io.*;
import java.lang.*;

public class Date {

    /* Put your private data fields here. */
    private int month;
    private int day;
    private int year;

    /**
     * Constructs a date with the given month, day and year.   If the date is
     * not valid, the entire program will halt with an error message.
     *
     * @param month is a month, numbered in the range 1...12.
     * @param day   is between 1 and the number of days in the given month.
     * @param year  is the year in question, with no digits omitted.
     */
    public Date(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

    }

    /**
     * Constructs a Date object corresponding to the given string.
     *
     * @param s should be a string of the form "month/day/year" where month must
     *          be one or two digits, day must be one or two digits, and year must be
     *          between 1 and 4 digits.  If s does not match these requirements or is not
     *          a valid date, the program halts with an error message.
     */
    public Date(String s) {
        String[] str = s.split("/");
        this.month = Integer.parseInt(str[0]);
        this.day = Integer.parseInt(str[1]);
        this.year = Integer.parseInt(str[2]);

    }

    /**
     * Checks whether the given year is a leap year.
     *
     * @return true if and only if the input year is a leap year.
     */
    public static boolean isLeapYear(int year) {// check setup priority 4->100->400
        boolean check = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        }
        return check;// replace this line with your solution
    }

    /**
     * Returns the number of days in a given month.
     *
     * @param month is a month, numbered in the range 1...12.
     * @param year  is the year in question, with no digits omitted.
     * @return the number of days in the given month.
     */
    public static int daysInMonth(int month, int year) {
        int numberOfDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            default:
                numberOfDays = 30;
                break;
        }
        return numberOfDays;                           // replace this line with your solution
    }

    /**
     * Checks whether the given date is valid.
     *
     * @return true if and only if month/day/year constitute a valid date.
     * <p>
     * Years prior to A.D. 1 are NOT valid.
     */
    public static boolean isValidDate(int month, int day, int year) {
        boolean check = false;
        if (Math.floor(year) == year) {
            if (month >= 1 && month <= 12) {
                if (day <= daysInMonth(month, year) && day > 0) {
                    check = true;
                } else {
                    System.out.println("Wrong date! Program is 'halted' by function 'isValiDate'!");
                    System.exit(0);
                }
            }
        }
        return check;                        // replace this line with your solution
    }

    /**
     * Returns a string representation of this date in the form month/day/year.
     * The month, day, and year are printed in full as integers; for example,
     * 12/7/2006 or 3/21/407.
     *
     * @return a String representation of this date.
     */
    public String toString() {
        String stuff = "";
        return stuff = month + "/" + day + "/" + year;                     // replace this line with your solution
    }

    /**
     * Determines whether this Date is before the Date d.
     *
     * @return true if and only if this Date is before d.
     */
    public boolean isBefore(Date d) {
        if(difsinceZero(this)>=difsinceZero(d)){
            return false;
        }else{
            return true;
        }
                                // replace this line with your solution
    }

    /**
     * Determines whether this Date is after the Date d.
     *
     * @return true if and only if this Date is after d.
     */
    public boolean isAfter(Date d) {

        return (!isBefore(d));                        // replace this line with your solution
    }

    /**
     * Returns the number of this Date in the year.
     *
     * @return a number n in the range 1...366, inclusive, such that this Date
     * is the nth day of its year.  (366 is only used for December 31 in a leap
     * year.)
     */
    public int dayInYear() {//u better figure out the exactly days for the date here... :(
        int days = 0;

        for (int i = 1; i < month; i++) {
            days = days + daysInMonth(i, year);
        }
        days = days + day;// for current month
        return days;                           // replace this line with your solution
    }

    /**
     * Determines the difference in days between d and this Date.  For example,
     * if this Date is 12/15/1997 and d is 12/14/1997, the difference is 1.
     * If this Date occurs before d, the result is negative.
     *
     * @return the difference in days between d and this date.
     */
    public int difference(Date d) {

        int dif=difsinceZero(this)-difsinceZero(d);

        return dif;                           // replace this line with your solution
    }
    public int difsinceZero(Date d){//check the days from the date to 1/1/1
        int days=0;
        for(int i=1;i<d.year;i++){
            if(isLeapYear(i)){
                days=366+days;
            }else{
                days=365+days;
            }
        }
        days=days+d.dayInYear();
        return days;
    }
    public static void main(String[] argv) {
        System.out.println("\nTesting constructors.");
        Date d1 = new Date(1, 1, 1);
        System.out.println("Date should be 1/1/1: " + d1);
        d1 = new Date("2/4/2");
        System.out.println("Date should be 2/4/2: " + d1);
        d1 = new Date("2/29/2000");
        System.out.println("Date should be 2/29/2000: " + d1);
        d1 = new Date("2/29/1904");
        System.out.println("Date should be 2/29/1904: " + d1);

        d1 = new Date(12, 31, 1975);
        System.out.println("Date should be 12/31/1975: " + d1);
        Date d2 = new Date("1/1/1976");
        System.out.println("Date should be 1/1/1976: " + d2);
        Date d3 = new Date("1/2/1976");
        System.out.println("Date should be 1/2/1976: " + d3);

        Date d4 = new Date("2/27/1977");
        Date d5 = new Date("8/31/2110");

/* I recommend you write code to test the isLeapYear function! */
        System.out.println("\nTesting isLeapYear function.");
        System.out.println("LeapYearCheck: 1800 =====>" + isLeapYear(1800));
        System.out.println("LeapYearCheck: 1900 =====>" + isLeapYear(1900));
        System.out.println("LeapYearCheck: 1600 =====>" + isLeapYear(1600));
        System.out.println("LeapYearCheck: 2000 =====>" + isLeapYear(2000));
        System.out.println("LeapYearCheck: 444 =====>" + isLeapYear(444));
        System.out.println("LeapYearCheck: 447 =====>" + isLeapYear(447));


        System.out.println("\nTesting before and after.");
        System.out.println(d2 + " after " + d1 + " should be true: " +
                d2.isAfter(d1));
        System.out.println(d3 + " after " + d2 + " should be true: " +
                d3.isAfter(d2));
        System.out.println(d1 + " after " + d1 + " should be false: " +
                d1.isAfter(d1));
        System.out.println(d1 + " after " + d2 + " should be false: " +
                d1.isAfter(d2));
        System.out.println(d2 + " after " + d3 + " should be false: " +
                d2.isAfter(d3));

        System.out.println(d1 + " before " + d2 + " should be true: " +
                d1.isBefore(d2));
        System.out.println(d2 + " before " + d3 + " should be true: " +
                d2.isBefore(d3));
        System.out.println(d1 + " before " + d1 + " should be false: " +
                d1.isBefore(d1));
        System.out.println(d2 + " before " + d1 + " should be false: " +
                d2.isBefore(d1));
        System.out.println(d3 + " before " + d2 + " should be false: " +
                d3.isBefore(d2));

        System.out.println("\nTesting difference.");
        System.out.println(d1 + " - " + d1 + " should be 0: " +
                d1.difference(d1));
        System.out.println(d2 + " - " + d1 + " should be 1: " +
                d2.difference(d1));
        System.out.println(d3 + " - " + d1 + " should be 2: " +
                d3.difference(d1));
        System.out.println(d3 + " - " + d4 + " should be -422: " +
                d3.difference(d4));
        System.out.println(d5 + " - " + d4 + " should be 48762: " +
                d5.difference(d4));

        System.out.println("\nLast Testing: Wrong Input.");
        System.out.println("Date input:2.28.1975");
        Date d9 = new Date(2, 29, 1975);
    }
}

