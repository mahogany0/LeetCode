package com.my.LeetCode;

public class LC122 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0||n==1)return 0;
        int pr0=0;
        int pr1=-prices[0];
        for(int i=1;i<n;i++){
            int newpr0=Math.max(pr0,pr1+prices[i]);
            int newpr1=Math.max(pr1,pr0-prices[i]);
            pr0=newpr0;
            pr1=newpr1;
        }
        return pr0;
    }


    public static void main(String[] args) {
        LC122 test=new LC122();
        test.maxProfit(new int[]{7, 4, 5, 3,1,10,2, 6, 18});

    }
}
