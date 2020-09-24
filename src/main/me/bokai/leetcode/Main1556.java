package me.bokai.leetcode;

public class Main1556 {
    public static void main(String[] args) {
        Main1556 main1556 = new Main1556();
        System.out.println(main1556.thousandSeparator(123456789));
    }

    public String thousandSeparator(int n) {
        String num = String.valueOf(n);
        int count = num.length();
        int x = (count-1)/3;
        StringBuilder result = new StringBuilder();
        for(int i=1;i<=x;i++){
            result.insert(0, "." + num.substring(num.length() - i * 3, num.length() - (i - 1) * 3));
        }
        result.insert(0, num.substring(0, num.length() - x * 3));
        return result.toString();
    }
}
