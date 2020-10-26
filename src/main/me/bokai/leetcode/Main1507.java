package me.bokai.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-10-26
 */
public class Main1507 {

    public static void main(String... args){
        Main1507 main1507 = new Main1507();
        System.out.println(main1507.reformatDate("2th Oct 2052"));
    }

    public String reformatDate(String date) {
        StringBuilder result = new StringBuilder();
        String[] time = date.split(" ");
        result.append(time[2]).append("-");
        result.append(getMonths().get(time[1])).append("-");
        String day = time[0];
        day = date.substring(0, day.length() - 2);
        day = day.length() == 1 ? result.append("0").append(day).toString() : result.append(day).toString();
        return result.toString();
    }

    private static Map<String, String> getMonths(){
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        return months;
    }
}
