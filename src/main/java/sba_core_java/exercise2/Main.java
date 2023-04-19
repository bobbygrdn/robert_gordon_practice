package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = { 23, 12, 33, 47 };

        double result = 0.0;
        for (int number : myNumberArray) {
            result += number;
        }

        result = result / myNumberArray.length;

        System.out.printf("%.2f\n", result);

        MajorLeagueSoccer team1 = new MajorLeagueSoccer();

        System.out.println(Arrays.toString(team1.getPlayerNumberArray()));

        team1.sendPlayerToMinorLeague(4);
        team1.sendPlayerToMinorLeague(4);

        team1.transferPlayerToDifferentTeam(6, "Tottenham");
        team1.transferPlayerToDifferentTeam(6, "Napoli");
    }
}
