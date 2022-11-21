package ru.netology.stats;

public class StatsService {

    public int allSales(long[] sales) {     // Общее колличество продаж за год
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSales(long[] sales) {    // Среднее колличеств продаж за месяц
        int avrSale = 0;
        for (long sale : sales) {
            avrSale += sale;
        }
        avrSale /= 12;
        return avrSale;
    }


    public int maxSales(long[] sales) {    //  Пик продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {   // Минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int lowAverageSales(long[] sales) {   // Колличество месяцев ниже среднего
        int count = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

    public int highAverageSales(long[] sales) {   // Колличество месяцев выше среднего
        int count = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }
}