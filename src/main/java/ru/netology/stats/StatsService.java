package ru.netology.stats;

public class StatsService {

    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }
        return result;
    }


    public int average(int[] purchases) {
        return sum(purchases) / purchases.length;
    }


    public int monthMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        int mountNumber = 0;
        int mounthMax = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == max) {
                mounthMax = mountNumber;
            }
        }
        return mounthMax;
    }


    public int monthMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        int mountNumber = 0;
        int mounthMin = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == min) {
                mounthMin = mountNumber;
            }
        }
        return mounthMin;
    }


    public int moreThanAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }


    public int lessThanAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }
}