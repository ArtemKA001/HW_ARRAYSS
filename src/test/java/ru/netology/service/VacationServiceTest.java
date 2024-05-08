package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.StatsService;

public class VacationServiceTest {

    @Test
    public void SumTest() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatsService service = new StatsService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.SumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinTest() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.MinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.MaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AvgTest() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.AvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LessTest() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.LessThanAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreTest() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.MoreThanAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
