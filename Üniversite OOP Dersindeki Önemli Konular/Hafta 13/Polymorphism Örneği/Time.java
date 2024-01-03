package com.mycompany.java_temelleri;

public class Time {
    
    private int day, month, year;
    
    public Time(int d, int m, int y) {
        day = d; month = m; year = y;
    }
    
    public int GetDay() {
        return day;
    }
    
    public int GetMonth() {
        return month;
    }
    
    public int GetYear() {
        return year;
    }
}
