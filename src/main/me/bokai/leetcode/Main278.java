package me.bokai.leetcode;

public class Main278 {
    public static void main(String[] args) {
        Main278 main278 = new Main278();
        System.out.println(main278.firstBadVersion(Integer.MAX_VALUE));
    }

    public int firstBadVersion(int n) {
        if(n==2){
            if(isBadVersion(1)){
                return 1;
            } else if(isBadVersion(2)){
                return 2;
            }
        }
        return first(1,n);
    }

    private int first(int start, int end){
        if(end - start <= 1){
            return isBadVersion(start) ? start : end;
        }
        int middle = (start % 2 == 1) && (end % 2 == 1)? start/2+end/2 +1: start/2+end/2;
        if(isBadVersion(middle)){
            return first(start,middle);
        } else {
            return first(middle,end);
        }
    }

    private boolean isBadVersion(int a){
        return a >= Integer.MAX_VALUE/2;
    }
}
