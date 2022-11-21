package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test
    public void allSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.allSales(temps);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(temps);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(temps);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(temps);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowAverageSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.lowAverageSales(temps);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highAverageSalesTest() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.highAverageSales(temps);
        Assertions.assertEquals(expected, actual);
    }
}
