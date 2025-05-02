package com.prathamesh.practice;

public class JavaSeventeenSwitch {
    public String getDayByNumber(int day){
        String dayOfWeek = switch(day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Saturday";
        };
        return dayOfWeek;
    }
}
