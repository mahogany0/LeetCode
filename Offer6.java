package com.my.LeetCode;

public class Offer6 {
    public static void main(String[] args) {
        Offer6 test=new Offer6();
        int []nums={5,25,75};
        test.twoSum(nums,100);
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int high=0;

        for(int i=0;i<numbers.length-1;i++){
            high=i+1;
            while(high<numbers.length&&numbers[high]<=target-numbers[i]){
                high++;
            }
            if(numbers[high-1]==target-numbers[i]){
                return new int[]{i, high-1};
            }
        }
        return new int[]{-1, -1};
    }
}
