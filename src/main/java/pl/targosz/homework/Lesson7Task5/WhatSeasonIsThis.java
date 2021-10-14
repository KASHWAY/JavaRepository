package pl.targosz.homework.Lesson7Task5;

import java.time.Month;

public class WhatSeasonIsThis {
    public static String WhichSeason(Month month) {

        String season = "";

        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = Season.WINTER.toString();
                break;

            case MARCH:
            case APRIL:
            case MAY:
                season = Season.SPRING.toString();
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = Season.SUMMER.toString();
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = Season.AUTUMN.toString();
                break;
            default:
                System.out.println("It's not a month!");
                break;


        }

        return season;
    }
}
