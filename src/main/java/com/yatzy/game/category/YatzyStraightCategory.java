package com.yatzy.game.category;

import java.util.Arrays;

public class YatzyStraightCategory implements YatzyCategory {
    private final int[] requiredValues;

    public YatzyStraightCategory(int[] requiredValues) {
        this.requiredValues = requiredValues;
    }

    @Override
    public int calculateScore(int[] dice) {
        int[] sortedDice = Arrays.stream(dice).sorted().toArray();
        return Arrays.equals(sortedDice, requiredValues) ? Arrays.stream(dice).sum() : 0;
    }
}
