package me.bokai.leetcode;

public class Main1518 {
    public static void main(String[] args) {
        Main1518 main1518 = new Main1518();
        System.out.println(main1518.numWaterBottles(9, 3));
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            total += numBottles / numExchange;
            numBottles = numBottles/numExchange + numBottles%numExchange;
        }
        return total;
    }

}
