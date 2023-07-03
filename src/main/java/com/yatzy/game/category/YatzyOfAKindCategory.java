package com.yatzy.game.category;

import java.util.Arrays;

public class YatzyOfAKindCategory implements YatzyCategory {
    private final int kind;

    public YatzyOfAKindCategory(int kind) {
        this.kind = kind;
    }

    @Override
    public int calculateScore(int[] dice) {
        int maxOccurrences = Arrays.stream(dice)
                .boxed()
                .filter(value -> countOccurrences(dice, value) >= kind)
                .max(Integer::compare)
                .orElse(0);
        return maxOccurrences * kind;
    }

    private int countOccurrences(int[] dice, int value) {
        return (int) Arrays.stream(dice).filter(die -> die == value).count();
    }
}
