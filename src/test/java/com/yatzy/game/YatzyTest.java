package com.yatzy.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class YatzyTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = new YatzyGame(2, 3, 4, 5, 1).calculateScore(YatzyFactory.createChanceCategory());
        assertEquals(expected, actual);
    }

    @Test
    public void ones_scores_sum_of_ones() {
        int expected = 4;
        int actual = new YatzyGame(1, 2, 1, 4, 1).calculateScore(YatzyFactory.createOfAKindCategory(1));
        assertEquals(expected, actual);
    }

    @Test
    public void twos_scores_sum_of_twos() {
        int expected = 4;
        int actual = new YatzyGame(2, 2, 2, 2, 1).calculateScore(YatzyFactory.createOfAKindCategory(2));
        assertEquals(expected, actual);
    }

    @Test
    public void threes_scores_sum_of_threes() {
        int expected = 9;
        int actual = new YatzyGame(3, 2, 3, 4, 3).calculateScore(YatzyFactory.createOfAKindCategory(3));
        assertEquals(expected, actual);
    }

    @Test
    public void one_pair_scores_sum_of_highest_pair() {
        int expected = 8;
        int actual = new YatzyGame(3, 3, 3, 4, 4).calculateScore(YatzyFactory.createOnePairCategory());
        assertEquals(expected, actual);
    }


    @Test
    public void three_of_a_kind_scores_sum_of_three_of_a_kind() {
        int expected = 9;
        int actual = new YatzyGame(3, 3, 3, 4, 5).calculateScore(YatzyFactory.createOfAKindCategory(3));
        assertEquals(expected, actual);
    }

    @Test
    public void four_of_a_kind_scores_sum_of_four_of_a_kind() {
        int expected = 8;
        int actual = new YatzyGame(2, 2, 2, 2, 5).calculateScore(YatzyFactory.createOfAKindCategory(4));
        assertEquals(expected, actual);
    }

    @Test
    public void small_straight_scores_15() {
        int expected = 15;
        int actual = new YatzyGame(1, 2, 3, 4, 5).calculateScore(YatzyFactory.createStraightCategory(new int[]{1, 2, 3, 4, 5}));
        assertEquals(expected, actual);
    }

    @Test
    public void large_straight_scores_20() {
        int expected = 20;
        int actual = new YatzyGame(2, 3, 4, 5, 6).calculateScore(YatzyFactory.createStraightCategory(new int[]{2, 3, 4, 5, 6}));
        assertEquals(expected, actual);
    }

    @Test
    public void full_house_scores_sum_of_all_dice() {
        int expected = 18;
        int actual = new YatzyGame(6, 2, 2, 2, 6).calculateScore(YatzyFactory.createFullHouseCategory());
        assertEquals(expected, actual);
    }
}
