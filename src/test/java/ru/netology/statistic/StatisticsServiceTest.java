package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInThousands() {
        StatisticsService service = new StatisticsService();

        long[] incomesInThousands = {1000, 160, 8090, 6485};
        long expected = 8090;

        long actual = service.findMax(incomesInThousands);

        assertEquals(expected, actual);
    }
}
