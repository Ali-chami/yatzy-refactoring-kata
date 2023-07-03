package com.yatzy.game;

import com.yatzy.game.category.YatzyCategory;
import com.yatzy.game.category.YatzyChanceCategory;
import com.yatzy.game.category.YatzyFullHouseCategory;
import com.yatzy.game.category.YatzyOfAKindCategory;
import com.yatzy.game.category.YatzyOnePairCategory;
import com.yatzy.game.category.YatzyStraightCategory;

public class YatzyFactory {
    public static YatzyCategory createChanceCategory() {
        return new YatzyChanceCategory();
    }

    public static YatzyCategory createOfAKindCategory(int kind) {
        return new YatzyOfAKindCategory(kind);
    }

    public static YatzyCategory createStraightCategory(int[] requiredValues) {
        return new YatzyStraightCategory(requiredValues);
    }

    public static YatzyCategory createFullHouseCategory() {
        return new YatzyFullHouseCategory();
    }

    public static YatzyCategory createOnePairCategory() {
        return new YatzyOnePairCategory();
    }
}
