package com.yatzy.game.category;

import java.util.Arrays;

public class YatzyOnePairCategory implements YatzyCategory {
    @Override
    public int calculateScore(int[] dice) {
        int maxPairValue = Arrays.stream(dice)
                .boxed()
                .filter(value -> countOccurrences(dice, value) >= 2)
                .max(Integer::compare)
                .orElse(0);
        return maxPairValue * 2;
    }

    private int countOccurrences(int[] dice, int value) {
        return (int) Arrays.stream(dice).filter(die -> die == value).count();
    }
}
