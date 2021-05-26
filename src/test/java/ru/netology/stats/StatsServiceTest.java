package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.average(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.monthMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountMoreAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.moreThanAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountLessAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.lessThanAverage(purchases);
        assertEquals(expected, actual);
    }
}