package com.yatzy.game.category;

import java.util.Arrays;

public class YatzyChanceCategory implements YatzyCategory {
    @Override
    public int calculateScore(int[] dice) {
        return Arrays.stream(dice).sum();
    }
}
