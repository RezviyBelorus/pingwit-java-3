package org.example.lec_11.point_2;

public class SeasonMain {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        Season autumn = Season.AUTUMN;

        System.out.println(season == autumn);
        System.out.println(season.equals(autumn));

        System.out.println(season.getMonthQuantity());
        System.out.println(season.getAverageTemperature());

        System.out.println(season.name());

        String seasonValue = args[0];
        Season parsedSeason = Season.valueOf(seasonValue.toUpperCase());
        System.out.println(parsedSeason);
    }
}
