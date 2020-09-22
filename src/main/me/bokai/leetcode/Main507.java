package me.bokai.leetcode;

public class Main507 {

    public static void main(String[] args) {
        Main507 main507 = new Main507();
        System.out.println(main507.checkPerfectNumber(100000000));
    }

    public boolean checkPerfectNumber(int num) {
        if(num == 0){
            return false;
        }
        int count = 0;
        for(int i=1; i< num; i++){
            if(num % i == 0){
                count += i;
            }
        }
        return count == num;
    }
}
