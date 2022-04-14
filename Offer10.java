package com.my.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Offer10 {
    public static void main(String[] args) {
        Offer10 offer10 = new Offer10();
        int []nums={0,0,1,0,0,0,1,1};
        offer10.findMaxLength(nums);

    }
    public int findMaxLength(int[] nums) {
        int length=nums.length;
        int count=0;
        if(length<=1)return 0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        for(int i=0;i<length;i++){
            if(nums[i]==0)nums[i]=-1;
        }

        int pre=0;
        for(int i=0;i<length;i++){
            pre=pre+nums[i];
            int target=pre;
            if(map.containsKey(target)){
                count=Math.max(count,i+1-map.get(target));
            }else{
                map.put(pre,i+1);
            }

        }
        return count;
    }
}
