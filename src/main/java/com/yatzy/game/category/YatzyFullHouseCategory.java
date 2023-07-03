package com.yatzy.game.category;

import java.util.Arrays;

public class YatzyFullHouseCategory implements YatzyCategory {
    @Override
    public int calculateScore(int[] dice) {
        int[] distinctValues = Arrays.stream(dice).distinct().toArray();
        if (distinctValues.length != 2) {
            return 0;
        }
        int occurrences1 = countOccurrences(dice, distinctValues[0]);
        int occurrences2 = countOccurrences(dice, distinctValues[1]);
        return (occurrences1 == 2 && occurrences2 == 3) || (occurrences1 == 3 && occurrences2 == 2) ? Arrays.stream(dice).sum() : 0;
    }

    private int countOccurrences(int[] dice, int value) {
        return (int) Arrays.stream(dice).filter(die -> die == value).count();
    }
}
