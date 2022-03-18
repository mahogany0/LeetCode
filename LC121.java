package com.my.LeetCode;

public class LC121 {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }else if(prices[i]-minprice>maxprofit){
                maxprofit=prices[i]-minprice;
            }
        }
        return maxprofit;
    }
    public static void main(String[]args){
        LC121 study=new LC121();
        study.maxProfit(new int[]{7, 4, 5, 3,1,10,2, 6, 18});
    }
}
