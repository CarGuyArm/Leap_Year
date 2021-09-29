package com.company;
class NumberOfDaysInMonth{

    public static boolean isLeapYear(int year){
        if(year<1 || year>=9999){
            return false;
        }
        if((year % 4==0) && (year % 100!=0) || (year % 400==0))
            return true;
        else return false;
    }
    public static int getDaysInMonth(int month,int year){

        if(month < 1 || month > 12)
            return -1;
        if(year <1 || year >9999)
            return -1;
        if(month ==2 && isLeapYear(year)==true){
            return 29;
        }
        switch(month){
            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2:
                return 28;
            default: return 31;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2000));
    }
}
